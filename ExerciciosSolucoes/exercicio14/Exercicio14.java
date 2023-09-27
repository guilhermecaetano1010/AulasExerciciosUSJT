package ExerciciosSolucoes.Exercicio14;


import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sumGrades = 0;
        int studentsWithGradesAbove8 = 0;
        int studentsWithZeroGrade = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a nota do aluno " + i + ": ");

            double grade = scanner.nextDouble();
            sumGrades += grade;

            if (grade > 8) {
                studentsWithGradesAbove8++;
            } else if (grade == 0) {
                studentsWithZeroGrade++;
            }
        }

        double average = sumGrades / 10;

        System.out.println("Média das notas: " + average);

        if (average >= 6) {
            System.out.println("Alunos com nota maior que 8: " + studentsWithGradesAbove8);
        } else {
            System.out.println("Alunos com nota igual a 0: " + studentsWithZeroGrade);
        }

        scanner.close();
    }
}
/*
 * Escreva um programa que lê as notas de 10 alunos e calcula a média aritmética
 * delas. Caso a média seja pelo
 * menos 6, o programa deve exibir a quantidade de alunos que tiveram nota maior
 * do que 8. Caso contrário, o programa
 * deve exibir a quantidade de alunos que tiraram nota 0.
 */
