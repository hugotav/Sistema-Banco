package com.mycompany.desafiopoo;

public class ContaPoupanca{
    
    private int idContaPoupanca;
    
    public ContaPoupanca(int idContaPoupanca){
    
        this.idContaPoupanca = idContaPoupanca;
        
    }
    
    ContaPoupanca() {
    
    }

    public int getIdContaPoupanca() {
        return idContaPoupanca;
        
    }
    
    public int setIdContaPoupanca(int idContaPoupanca) {
        return this.idContaPoupanca = idContaPoupanca;
    }
    
    
}