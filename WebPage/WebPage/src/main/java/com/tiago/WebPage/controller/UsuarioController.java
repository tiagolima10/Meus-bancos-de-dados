package com.tiago.WebPage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.WebPage.banco.BancoUsuario;
import com.tiago.WebPage.entidade.Cadastro;

//Controller Controla as rotas e o que fazem em cada situação
@CrossOrigin("*")
@RestController

public class UsuarioController {
    
    @Autowired
    private BancoUsuario acessoBanco;

    @GetMapping("/usuarios") //Nome da rota na barra navegador
    public List<Cadastro> listarUsuarios() { //Métodos vem do crudrepository que é uma classe gigante que contem vários métodos //
        return (List<Cadastro>) acessoBanco.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Optional<Cadastro> peguePorId(@PathVariable int id){
        return acessoBanco.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePorId(@PathVariable int id){
        acessoBanco.deleteById(id);
    }

    @PostMapping("/cadastrar")
    public void cadastrarUsuario(@RequestBody Cadastro novoUsuario){
        acessoBanco.save(novoUsuario); //novoUsuario está vindo do corpo da requisição. Cadastro
    }

    @PutMapping("/editar/{id}") //Put é para alterar
    public void alterarUsuario(@RequestBody Cadastro usuario, @PathVariable int id){
        acessoBanco.findById(id).map( u -> { //Mapear os itens do usuário / u vai representar o usuario id//
            u.setNome(usuario.getNome());
            u.setEmail(usuario.getEmail());
            u.setUsuario(usuario.getUsuario());
            u.setSenha(usuario.getSenha());
            return acessoBanco.save(u); // Salvando o usuário novo no banco 
        });
        acessoBanco.save(usuario);
    }
}