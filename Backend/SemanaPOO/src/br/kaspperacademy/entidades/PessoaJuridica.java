package br.kaspperacademy.entidades;

public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cpf, String cnpj) {
        super(nome, endereco, cpf);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String cpf, String cnpj) {
        super(cpf);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibeDados() {
        System.out.println("Pessoa Juridica");
    }

}
