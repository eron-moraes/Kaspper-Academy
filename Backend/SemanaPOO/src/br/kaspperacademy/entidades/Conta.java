package br.kaspperacademy.entidades;

public class Conta {

public String titular;
public String numero;
public Double saldo;

// Método contrutor
public Conta(){}
// Método contrutor com parâmetros
public Conta(String titular, String numero, Double saldo){
    this.titular = titular;
    this.numero = numero;
    this.saldo = saldo;

    }
    //Método sem retorno
    public void imprimirDadosBancarios(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo da conta(R$): " + this.saldo);
    }
    // Método com retorno
    public Double mostraSaldo(){
        return this.saldo;
    }
    
    public void depositar(Double valor){
        this.saldo += valor;
    }

    public Double sacar(Double valor){
        this.saldo -= valor;
        return this.mostraSaldo();
    }
}