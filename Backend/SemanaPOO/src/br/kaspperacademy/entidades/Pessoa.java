package br.kaspperacademy.entidades;

public abstract class Pessoa implements IPessoa {
    private String nome;
    private String endereco;
    private String cpf;



    public Pessoa(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    public Pessoa(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
     this.endereco = cpf;
    }
    public String getCpf() {
        return cpf;
}
}
