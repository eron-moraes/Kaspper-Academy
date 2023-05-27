package br.kaspperacademy.principal;

import br.kaspperacademy.entidades.PessoaJuridica;
//import br.kaspperacademy.entidades.Pessoa;



public class TestePessoa {
    public static void main(String[] args) {
        // Instanciando objetos - Classe Pessoa não pode ser instanciada
        // Pessoa pessoa = new Pessoa();
        // pessoa.setNome("Eron");   
        // pessoa.setEndereco("SJC");
        // System.out.println("Pessoa: " + pessoa.getNome() + " - " + pessoa.getEndereco());

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Tex Willer");
        pessoaFisica.setEndereco("Arizona");
        pessoaFisica.setCpf("123.123.123-55");
        System.out.println("Pessoa Fisica: " + pessoaFisica.getNome() + " CPF: " + pessoaFisica.getCpf());

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Google");
        pessoaJuridica.setCnpj("218.849.130/0001-51");
        System.out.println("Pessoa Jurídica: " + pessoaJuridica.getNome() + " Cnpj: " + pessoaJuridica.getCnpj());


    }
}