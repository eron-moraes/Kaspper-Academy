package exercicio.principal;


public class ItemBiblioteca implements IEmprestavel {
    protected String titulo;

    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void emprestar() {
        System.out.println("Item emprestado: " + titulo);
    }
}

