package com.tiago.WebPage.entidade;

public class Cadastro {
    private int id;
      private String usuario;
        private String email;
          private String senha;
            private String nome;

    /**
     * 
     */
    public int getId() {
        return id;
    }

    /**
     *
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * 
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     */
    public String getSenha() {
        return senha;
    }

    /**
     * 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    /**
     * 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
