package br.kaspperacademy.entidades;

public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

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
