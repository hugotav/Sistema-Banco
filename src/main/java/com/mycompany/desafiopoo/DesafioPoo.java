package com.mycompany.desafiopoo;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.Random;

public class DesafioPoo {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contas;
    static ArrayList<Cliente> clientes;
    
    public static void main(String[] args) {
        
        contas = new ArrayList<Conta>();
        clientes = new ArrayList<Cliente>();
        menu();
        
    }
    
    public static void menu() {

        System.out.println(" ");
        System.out.println("Seja bem-vindo ao banco Techlead");
        System.out.println(" ");
        System.out.println("Por favor selecione a operação desejada");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Logar");
        System.out.println("3 - Sair");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                criarConta();
                break;

            case 2:
                logar();
                break;

            case 3:
                System.out.println("Obrigado por utilizar o banco Techlead!");
                System.exit(0);

            default:
                System.out.println("Operação inválida!");
                menu();
                break;
        }
    }
    
    public static void menuLogado() {

        System.out.println(" ");
        System.out.println("Seja bem-vindo, cliente!");
        System.out.println(" ");
        System.out.println("Por favor selecione a operação desejada");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Transferir");
        System.out.println("4 - Listar");
        System.out.println("5 - Sair");
        

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                depositar();
                break;
            
            case 2:
                sacar();
                break;

            case 3:
                transferir();
                break;
                
            case 4:
                listarContas();
                break;
                
            case 5:
                System.out.println("Obrigado por utilizar o banco Techlead!");
                System.exit(0);    

            default:
                System.out.println("Operação inválida!");
                menu();
                break;
        }
    }
    
    public static void criarConta() {
        
        System.out.println("Favor selecione a personalidade jurídica:");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        
        int valor = input.nextInt();
        
        if (valor == 1) {
        
            System.out.println("Favor selecione qual tipo de conta você deseja criar");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            
            int valor2 = input.nextInt();
            
            if (valor2 == 1){
            
                System.out.println("Favor insira o seu nome: ");
                String nome = input.next();

                System.out.println("Favor insira o seu sobrenome: ");
                String sobrenome = input.next();

                System.out.println("Favor insira sua data de nascimento no formato DDMMAAAA: ");
                int dataNascimento = input.nextInt();

                System.out.println("Favor insira seu RG: ");
                int id = input.nextInt();

                System.out.println("Favor insira uma senha: ");
                int senha = input.nextInt();

                Random aleatorio = new Random();
                int numeroConta = aleatorio.nextInt(100000);
                int digitoVerificador = aleatorio.nextInt(10);
                //System.out.println(valor);

                Cliente cliente = new Cliente(nome, sobrenome, dataNascimento, id, senha);

                Conta conta = new Conta(cliente, numeroConta);

                conta.setNumeroConta(numeroConta);

                conta.setdigitoVerificador(digitoVerificador);
                
                ContaCorrente contaC = new ContaCorrente();
                
                contaC.setIdContaCorrente(1);
                
                contas.add(conta);
                clientes.add(cliente);

                System.out.println("Conta criada com sucesso!");
                System.out.println("O número da sua conta é: " + numeroConta);
                System.out.println("Tipo de conta: " + conta.getIdContaCorrente());

                menu();
                
            }
            
            if (valor2 == 2){
            
                System.out.println("Favor insira o seu nome: ");
                String nome = input.next();

                System.out.println("Favor insira o seu sobrenome: ");
                String sobrenome = input.next();

                System.out.println("Favor insira sua data de nascimento no formato DDMMAAAA: ");
                int dataNascimento = input.nextInt();

                System.out.println("Favor insira seu RG: ");
                int id = input.nextInt();

                System.out.println("Favor insira uma senha: ");
                int senha = input.nextInt();

                Random aleatorio = new Random();
                int numeroConta = aleatorio.nextInt(100000);
                int digitoVerificador = aleatorio.nextInt(10);
                //System.out.println(valor);

                Cliente cliente = new Cliente(nome, sobrenome, dataNascimento, id, senha);

                Conta conta = new Conta(cliente, numeroConta);

                conta.setNumeroConta(numeroConta);

                conta.setdigitoVerificador(digitoVerificador);

                ContaPoupanca contaP = new ContaPoupanca();
                
                contaP.setIdContaPoupanca(2);
                
                contas.add(conta);

                System.out.println("Conta criada com sucesso!");
                System.out.println("O número da sua conta é: " + numeroConta);
                System.out.println("Tipo de conta: " + conta.getIdContaPoupanca());

                menu();
            
            }
            
            if (valor2 != 1 && valor2 != 2){
                
                System.out.println("Operação inválida");
                criarConta();
                
            }
            
        }
        
        if (valor == 2){
            
            System.out.println("Favor insira o seu nome: ");
                String nome = input.next();

                System.out.println("Favor insira o seu sobrenome: ");
                String sobrenome = input.next();

                System.out.println("Favor insira sua data de nascimento no formato DDMMAAAA: ");
                int dataNascimento = input.nextInt();

                System.out.println("Favor insira seu RG: ");
                int id = input.nextInt();

                System.out.println("Favor insira uma senha: ");
                int senha = input.nextInt();

                Random aleatorio = new Random();
                int numeroConta = aleatorio.nextInt(100000);
                int digitoVerificador = aleatorio.nextInt(10);
                //System.out.println(valor);

                Cliente cliente = new Cliente(nome, sobrenome, dataNascimento, id, senha);

                Conta conta = new Conta(cliente, numeroConta);

                conta.setNumeroConta(numeroConta);

                conta.setdigitoVerificador(digitoVerificador);
                
                ContaCorrente contaC = new ContaCorrente();
                
                contaC.setIdContaCorrente(1);
                
                contas.add(conta);

                System.out.println("Conta criada com sucesso!");
                System.out.println("O número da sua conta é: " + numeroConta);
                System.out.println("Tipo de conta: " + conta.getIdContaCorrente());

                menu();
           
        }
        
        if (valor != 1 && valor != 2){
                
                System.out.println("Operação inválida");
                criarConta();
                
            }
     
    }
    
    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if(contas.size() > 0) {
            for(Conta contaa : contas) {
                if(contaa.getNumeroConta() == numeroConta) {
                    conta = contaa;
                }
            }
        }
        return conta;
    }

    public static void depositar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();
        Conta conta = encontrarConta(numeroConta);
        
        if(conta != null) {
            System.out.println("Qual valor deseja depositar? ");
            Double valorDeposito = input.nextDouble();
            
            System.out.println("Digite o número do RG: ");
            int idLogin = input.nextInt();
            Cliente cliente = encontrarId(idLogin);

            if(cliente != null) {
                System.out.println("Digite a senha: ");
                int senha = input.nextInt();
            
                if (senha == cliente.getSenha()){
                    System.out.println("LOGADO");
                    conta.depositar(valorDeposito);
                    menuLogado();
                
            }else{
                System.out.println("Credenciais incorretas!");
                menu();
            }

            conta.depositar(valorDeposito);
        }else {
            System.out.println("Conta não encontrada");
        }

        menu();

    }
        
    }

    public static void sacar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Qual valor deseja sacar? ");
            Double valorSaque = input.nextDouble();
            
            
            
            if (valorSaque > conta.saldo || valorSaque > 5000){
                System.out.println("Operação indisponível");
            }else{
                System.out.println("Digite o número do RG: ");
            int idLogin = input.nextInt();
            Cliente cliente = encontrarId(idLogin);

            if(cliente != null) {
                System.out.println("Digite a senha: ");
                int senha = input.nextInt();
            
                if (senha == cliente.getSenha()){
                    System.out.println("LOGADO");
                    conta.sacar(valorSaque);
                    menuLogado();
                
            //System.out.println("Saque realizado com sucesso!");
            }
        }else {
            System.out.println("Conta não encontrada");
        }

        menu();

    }
            
    }
        
    }

    public static void transferir() {
        System.out.println("Número da conta que vai enviar a transferência: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if(contaRemetente != null) {
            System.out.println("Número da conta do destinatário: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if(contaDestinatario != null) {
                System.out.println("Valor da transferência: ");
                Double valor = input.nextDouble();
                
                System.out.println("Digite o número do RG: ");
                int idLogin = input.nextInt();
                Cliente cliente = encontrarId(idLogin);

            if(cliente != null) {
                System.out.println("Digite a senha: ");
                int senha = input.nextInt();
            
                if (senha == cliente.getSenha()){
                    System.out.println("LOGADO");
                    contaRemetente.transferencia(contaDestinatario, valor);
                    menuLogado();
  
            }

            }else {
                System.out.println("A conta para depósito não foi encontrada");
            }

        }else {
            System.out.println("Conta para transferência não encontrada");
        }
        menu();
    }
        
    }

    public static void listarContas() {
        if(contas.size() > 0) {
            for(Conta conta: contas) {
                System.out.println(conta);
            }
        }else {
            System.out.println("Não há contas cadastradas");
        }

        menuLogado();
    }
    
    public static void logar() {
        System.out.println("Digite o número do RG: ");
        int idLogin = input.nextInt();
        Cliente cliente = encontrarId(idLogin);

        if(cliente != null) {
            System.out.println("Digite a senha: ");
            int senha = input.nextInt();
            
            if (senha == cliente.getSenha()){
                System.out.println("LOGADO");
                menuLogado();
            }else{
                System.out.println("Credenciais incorretas!");
                menu();
            }
   
    }
        
}
    
    private static Cliente encontrarId (int id) {
        Cliente cliente = null;
        if(clientes.size() > 0) {
            for(Cliente clientee : clientes) {
                if(clientee.getId() == id) {
                    cliente = clientee;
                }
            }
        }
        return cliente;
    }
    
}