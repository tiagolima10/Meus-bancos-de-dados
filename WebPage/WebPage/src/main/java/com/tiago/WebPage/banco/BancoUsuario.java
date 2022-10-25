package com.tiago.WebPage.banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiago.WebPage.entidade.Cadastro;

@Repository

public interface BancoUsuario  extends CrudRepository< Cadastro, Integer >{ // Salva os dados nesse Banco //
    
}