package br.kaspperacademy.principal;

import br.kaspperacademy.entidades.Conta;

public class TesteConta {
    public static void main(String[] args) {
        // instanciando um objeto
        Conta c1 = new Conta();
        c1.titular = "Bill Gates";
        c1.numero = "9544440558XP";
        c1.saldo = 100000.00;

        System.out.println(c1.titular);
        System.out.println(c1.numero);
        System.out.println(c1.saldo);


        Conta c2 = new Conta("Musk", "666", 666.66);

        c2.imprimirDadosBancarios();
        c2.depositar(10000.00);
        System.out.println("Depois do depósito " + c2.mostraSaldo());
        c2.sacar(6000.00);
        System.out.println("Depois do saque: " + c2.mostraSaldo());
    }


    
}
