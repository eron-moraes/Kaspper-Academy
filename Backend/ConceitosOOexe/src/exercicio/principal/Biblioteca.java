package exercicio.principal;


public class Biblioteca {
    public static void main(String[] args) {
        
        IEmprestavel livro = new Livro("Os guris da rua 3", "Kheronn Khennedy Machado");
        IEmprestavel revista = new Revista("Superinteressante", 2023);

        livro.emprestar();
        revista.emprestar();
    }
}

