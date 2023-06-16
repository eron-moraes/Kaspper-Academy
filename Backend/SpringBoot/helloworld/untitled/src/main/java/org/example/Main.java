package org.example;

import java.util.Random;
import java.util.Scanner;

class AdivinhacaoNumero {
    public static void main(String[] args) {
        int numeroSorteado, chute, tentativas = 0;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        numeroSorteado = rand.nextInt(100) + 1;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite o seu chute: ");
            chute = scanner.nextInt();
            tentativas++;

            if (chute < numeroSorteado) {
                System.out.println("O número sorteado é maior que o chute.");
            } if (chute > numeroSorteado) {
                System.out.println("O número sorteado é menor que o chute.");
            } else {
                System.out.println("Parabéns! Você acertou o número sorteado em " + tentativas + " tentativas.");
            }
        } while (chute != numeroSorteado);

        scanner.close();
    }
}
