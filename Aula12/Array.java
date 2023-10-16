package Aula12;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int notas[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota (" + i + "): ");
            notas[i] = sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += notas[i];
        }
        System.out.println("Media: "+ soma / 10d);
        sc.close();
    }
}
