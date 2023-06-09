package exercicio.principal;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    @Override
    public void emprestar() {
        System.out.println("Revista emprestada: " + titulo + " - Edição: " + edicao);
    }
}

