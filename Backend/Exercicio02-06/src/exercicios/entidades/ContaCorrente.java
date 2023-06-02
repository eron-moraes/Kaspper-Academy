package exercicios.entidades;

public class ContaCorrente extends Conta {

    @Override
    public double calcularTarifa(double valor) {
        return valor * 0.02;
    }
    
}
