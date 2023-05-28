package br.kaspperacademy.entidades;

public class Mei extends PessoaJuridica {
    public Mei(String cpf, String cnpj) {
        super(cpf, cnpj);
        //TODO Auto-generated constructor stub
    }

    private double limiteRenda;

    public double getLimiteRenda() {
        return limiteRenda;
    }

    public void setLimiteRenda(double limiteRenda) {
        this.limiteRenda = limiteRenda;
    }
    
}