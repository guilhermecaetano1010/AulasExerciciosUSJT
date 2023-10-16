package Aula12;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos?");
        int alunos = sc.nextInt();
        int notas[] = new int[alunos];
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite a nota (" + i + "): ");
            notas[i] = sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < alunos; i++) {
            soma += notas[i];
        }
        // double alunosd = alunos;
        // double media = soma / alunosd;
        double media = soma / Double.valueOf(alunos);
        System.out.println("Media: "+ media);
        sc.close();
    }
}
