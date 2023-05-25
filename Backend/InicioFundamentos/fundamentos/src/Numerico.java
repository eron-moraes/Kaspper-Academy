public class Numerico {

    public static void main(String[] args) {
        int idade = 17;
        int qntAcompanhante = 2;
        // Operador condicional lógica if
        if (idade >= 18) {
            System.out.println("Você é de maior!");
        } else {
            if (qntAcompanhante >= 3) {
                System.out.println("Você é de menor mas está acompanhado!");
            } else {
                System.out.println("Você não pode entrar.");

            }

        }
    }

}