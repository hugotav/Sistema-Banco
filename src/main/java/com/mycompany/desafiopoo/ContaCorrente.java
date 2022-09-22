package com.mycompany.desafiopoo;

public class ContaCorrente{
    
    private int idContaCorrente;
    
    public ContaCorrente(int idContaCorrente){
    
        this.idContaCorrente = idContaCorrente;
        
    }

    ContaCorrente() {
    
    }
    
    public int getIdContaCorrente() {
        return idContaCorrente;
        
    }
    
    public int setIdContaCorrente(int idContaCorrente) {
        return this.idContaCorrente = idContaCorrente;
    }
        
}