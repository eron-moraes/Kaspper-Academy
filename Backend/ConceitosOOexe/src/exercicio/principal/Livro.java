package exercicio.principal;

public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    @Override
    public void emprestar() {
        System.out.println("Livro emprestado: " + titulo + " - " + autor);
    }
}

