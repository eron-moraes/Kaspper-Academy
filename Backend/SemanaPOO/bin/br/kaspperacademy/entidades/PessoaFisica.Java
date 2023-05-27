package br.kaspperacademy.entidades;

public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private String nome;
    private String endereco;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String cpf) {
        this.nome = nome;
    }


    @Override
    public void exibeDados() {
        System.out.println("Pessoa Fisica");
    }
    
}