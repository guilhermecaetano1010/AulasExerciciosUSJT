package ExerciciosSolucoes.Exercicio15;


import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor por hora:");
        double hourlyRate = scanner.nextDouble();

        System.out.println("Digite o número de horas trabalhadas:");
        int hoursWorked = scanner.nextInt();

        System.out.println("Digite o valor do imposto (entre 0 e 1):");
        double taxRate = scanner.nextDouble();

        System.out.println("Digite o valor da comissão:");
        double commission = scanner.nextDouble();

        double grossSalary = hourlyRate * hoursWorked;
        double netSalary;

        if (hoursWorked >= 120) {
            netSalary = grossSalary - (grossSalary * taxRate) + commission;
        } else {
            netSalary = grossSalary - (grossSalary * taxRate);
        }

        System.out.println("Salário bruto: " + grossSalary);
        System.out.println("Salário líquido: " + netSalary);

        scanner.close();
    }
}
/*Faça um programa que lê os seguintes dados:
- valor/hora (é um número real positivo)
- horas trabalhadas (é um inteiro)
- imposto (um real entre 0 e 1, inclusive)
- comissão (é um real positivo)
Seu programa deve calcular e exibir para o usuário os seguintes valores:
Salário bruto, que é igual ao valor/hora multiplicado pelo número de horas trabalhadas.
Salário líquido, que é igual ao salário bruto menos o imposto mais a comissão. Note que a comissão somente
entrará nos cálculos caso o número de horas trabalhadas seja pelo menos 120.
 */