package com.mycompany.desafiopoo;

public class Cliente {
    
    private String nome;
    private String sobrenome;
    private int dataNascimento;
    private int id;
    private int login;
    private int senha;
    
    public Cliente(){
    
    }
    
    
    public Cliente(String nome, String sobrenome, int dataNascimento, int id, int senha){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.id = id;
        this.login = id;
        this.senha = senha;
    }
   
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public int getId() {
        return id;
    }
    
    public int getLogin() {
        return login;
    }

    public int getSenha() {
        return senha;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setLogin(String id) {
        this.id = login;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
      
    @Override
    public String toString(){
    
        return "\nNome: " + this.getNome() + " " + this.getSobrenome() +
                "\nData de nascimento: " + this.getDataNascimento() +
                "\nIdentidade: " + this.getId() +
                "\nLogin: " + this.getId();
    
    }
    
    
}
