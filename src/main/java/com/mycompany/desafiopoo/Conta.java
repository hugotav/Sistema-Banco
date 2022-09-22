package com.mycompany.desafiopoo;

import static com.mycompany.desafiopoo.DesafioPoo.input;

public class Conta {

        
    private int numeroConta;
    private int digitoVerificador;
    Cliente cliente;
    double saldo;
    private int idContaCorrente;
    private int idContaPoupanca;
    private double valorSaque;
    
    public Conta(Cliente cliente, int numeroConta){
    
        this.cliente = cliente;
        this.updateSaldo();
        
    }
    
    public Conta(){
    
        
    }
    
    public double getValorSaque() {
        return valorSaque;
        
    }
    
    public double setValorSaque(double valorSaque) {
        return this.valorSaque = valorSaque;
    }
    
    public int getIdContaCorrente() {
        return idContaCorrente;
        
    }
    
    public int setIdContaCorrente(int idContaCorrente) {
        return this.idContaCorrente = idContaCorrente;
    }
    
    public int getIdContaPoupanca() {
        return idContaPoupanca;
        
    }
    
    public int setIdContaPoupanca(int idContaPoupanca) {
        return this.idContaPoupanca = idContaPoupanca;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public int setNumeroConta(int numeroConta) {
        return this.numeroConta = numeroConta;
    }
    
    public int getdigitoVerificador() {
        return digitoVerificador;
    }
    
    public int setdigitoVerificador(int digitoVerificador) {
        return this.digitoVerificador = digitoVerificador;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private void updateSaldo() {
        this.saldo = this.getSaldo();
    }
    
    @Override
    public String toString() {
 
        return "\nNúmero da conta: " + this.getNumeroConta() + "-" + this.getdigitoVerificador() +
                "\nCliente: " + this.cliente.getNome() +
                "\nRG: " + this.cliente.getId() +
                "\nSaldo: " + this.getSaldo() +
                "\n" ;
    }
    
    
    public void depositar(Double valor) {
        
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();
                
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            //this.saldo = this.getSaldo() + valor;
            System.out.println("Seu depósito foi realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar o depósito!");
        }
    }

    public void sacar(Double valor) {
        if(valor > 0 && this.getSaldo() >= valor && this.getValorSaque() <= 5000) {
            setValorSaque(valor);
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }
    
    public void transferencia(Conta contaParaDeposito, Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor - 10);
            setValorSaque(valor);
            //this.saldo = this.getSaldo() - valor;
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso!");
        }else {
            System.out.println("Não foi possível realizar a tranferência");
        }
        
    }
    
    
    
}
