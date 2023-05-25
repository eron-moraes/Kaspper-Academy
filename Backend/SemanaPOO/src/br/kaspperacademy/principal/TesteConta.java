package br.kaspperacademy.principal;

import br.kaspperacademy.entidades.Cliente;
import br.kaspperacademy.entidades.Conta;

public class TesteConta {
    public static void main(String[] args) {
        // Instanciando um objeto
        Conta c1 = new Conta();
        Cliente cli1 = new Cliente();
        cli1.setNome("Bill Gates");
        cli1.setCpf("111.222.333-45");
        c1.setTitular(cli1);
        c1.setNumero("95972000XP");
        c1.depositar(100000.00);

        System.out.println(c1.getTitular().getNome());
        System.out.println(c1.getNumero());
        System.out.println(c1.getSaldo());

        Cliente cli2 = new Cliente();
        cli2.setNome("Musk");
        cli2.setCpf("666.666.666-66");
        Conta c2 = new Conta(cli2, "666", 666.66);
        //System.out.println(c2.titular);
        //System.out.println(c2.numero);
        //System.out.println(c2.saldo);
        c2.imprimirDadosBancarios();
        c2.depositar(1000.00);
        System.out.println("Depois do depósito: " + c2.mostraSaldo());
        c2.sacar(60000.00);
        System.out.println("Depois do saque: " + c2.mostraSaldo());

    }
}