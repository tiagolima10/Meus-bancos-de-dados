package com.tiago.WebPage.banco;

import org.springframework.data.repository.CrudRepository;

import com.tiago.WebPage.entidade.Cadastro;

public interface BancoUsuario  extends CrudRepository< Integer , Cadastro >{
    
}