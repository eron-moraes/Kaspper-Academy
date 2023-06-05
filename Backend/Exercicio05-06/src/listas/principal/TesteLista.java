package listas.principal;

import java.util.ArrayList;
import java.util.Collections;

public class TesteLista {
    public static void main(String[] args) {
        String disciplina1 = "Javascript";
        String disciplina2 = "Banco de Dados";
        String disciplina3 = "Java";
        String disciplina4 = "Angular";

        ArrayList<String> disciplinas = new ArrayList<>();
        //Adicionar elementos no ArrayList
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        disciplinas.add(2, disciplina4);

        System.out.println(disciplinas);

        //1º Forma de percorrer vetor
        for (int i = 0; i < disciplinas.size(); i++) {
           // System.out.println(disciplina.get(i));
        }

        //2ª Forma lambda
        disciplinas.forEach(disciplina -> System.out.println(disciplina));

        // Ordenando um ArrayList
        Collections.sort(disciplinas);
        System.out.println(disciplinas);



    }
}
