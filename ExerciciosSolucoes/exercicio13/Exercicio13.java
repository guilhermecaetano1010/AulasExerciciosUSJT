package ExerciciosSolucoes.Exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int number1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int number2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int number3 = scanner.nextInt();

        if (number1 != number2 && number1 != number3 && number2 != number3) {
            if (number1 < number2 && number1 < number3) {
                System.out.print(number1 + " ");

                if (number2 < number3) {
                    System.out.print(number2 + " " + number3);

                } else {

                    System.out.print(number3 + " " + number2);
                }

            } else if (number2 < number1 && number2 < number3) {
                System.out.print(number2 + " ");

                if (number1 < number3) {
                    System.out.print(number1 + " " + number3);
                } else {
                    System.out.print(number3 + " " + number1);
                }
            } else {
                System.out.print(number3 + " ");
                if (number1 < number2) {
                    System.out.print(number1 + " " + number2);
                } else {
                    System.out.print(number2 + " " + number1);
                }
            }

        } else {
            System.out.println("Erro: Os números são iguais.");
        }

        scanner.close();
    }
}
/*Escreva um programa que lê três números inteiros diferentes e os exibe em ordrescente. Se o usuário digitar
números iguais, seu programa deve exibir uma mensagem de erro e terminar.*/