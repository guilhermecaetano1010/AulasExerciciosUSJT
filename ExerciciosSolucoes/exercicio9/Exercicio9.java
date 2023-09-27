package exerciciosSolucoes.exercicio9;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double grade1 = scanner.nextDouble();  
        System.out.println("Digite sua segunda nota: ");
        double grade2 = scanner.nextDouble(); 
        double average = (grade1+grade2)/2;
        if (average>=9) {
            System.out.println("Parabéns, continue assim!");
        } else if(7 <= average && average < 9) {
            System.out.println("Aprovado.");
        }else if(6 <= average && average < 7) {
            System.out.println("Aprovado no limite, estude um pouco mais.");
        }else if(2 <= average && average < 6) {
            System.out.println("Não está aprovado mas ainda pode fazer a segunda época.");
        }else if(average < 2) {
            System.out.println("Reprovado. Nos vemos semestre que vem.");
        }
        scanner.close();
    }
}
/*Escreva um programa que lê duas notas de um estudante, ambas sendo valores reais. O programa deve calcular a
média e exibir um texto para o usuário conforme a tabela a seguir:
Nota Texto
média >= 9 Parabéns, continue assim!
7 <= média < 9 Aprovado.
6 <= média < 7 Aprovado no limite, estude um pouco mais.
2 < = média < 6 Não está aprovado mas ainda pode fazer a segunda época
média < 2 Reprovado. Nos vemos semestre que vem.*/