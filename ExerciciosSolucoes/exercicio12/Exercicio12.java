package ExerciciosSolucoes.Exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha como número inteiro de 4 dígitos:");
        int password = scanner.nextInt();

        double firstNumber = password / 1000;
        double secondNumber = (password%1000)/100;
        double thirdNumber = (password%100)/10;
        double fourthNumber = password%10;
        double sum = secondNumber+thirdNumber;
        if(firstNumber == 5 || firstNumber == 8){
            if(fourthNumber == 5 || fourthNumber == 1){
                if(fourthNumber == 5 && sum == 3){
                    System.out.println("A senha é valida!");
                }
                if(fourthNumber == 1 && sum == 0){
                System.out.println("A senha é valida!");
                }
            }
        }
        else{
        System.out.println("Senha inválida!");
            }
        scanner.close();
    }
}
/*Escreva um programa que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
considerado como uma senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
meio é 3.*/