package Aula12;

import java.util.Random;

public class Ordenacao {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int vetor[] = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = aleatorio.nextInt(100);
            System.out.println(vetor[i] + ", ");
        }
        for (int j = 0; j < 10; j++) {   // Esse for serve para ficar na ordem do menor ao maior
            for (int i = 0; i < 10 - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // trocar
                    int temp = vetor[i];   //Trocando os valores de posição para o maior sempre ficar na frente
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }

    }
}
