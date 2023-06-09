package exercicios.entidades;

public interface IConta {
    public void depositar(double valor);
    public Double sacar(double valor);
    public double calcularTarifa(double valor);

}
