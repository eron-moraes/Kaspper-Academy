package listas.principal;

import java.util.ArrayList;

public class TesteLista {
    public static void main(String[] args) {
        String disciplina1 = "Javascript";
        String disciplina2 = "Banco de Dados";
        String disciplina3 = "Java";

        ArrayList<String> disciplinas = new ArrayList<>();
        //Adicionar elementos no ArrayList
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);

        System.out.println(disciplinas);
    }
}
