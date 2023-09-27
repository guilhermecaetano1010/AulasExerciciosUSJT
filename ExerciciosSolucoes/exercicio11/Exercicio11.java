package exerciciosSolucoes.exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código de estado:");
        int state = sc.nextInt();
        System.out.println("Digite o valor inicial de carga:");
        double value = sc.nextDouble();

        if(state == 2 || state == 5){
            value = value - (value*12/100);
            System.out.println("O valor final da carga é: "+value);

        }else if(state == 1 || state == 3 || state == 4){
            value = value - (value*15/100);
            System.out.println("O valor final da carga é: "+value);
            
        }
        sc.close();
    }
}
/*Faça um programa que lê os seguintes dados:
- código de estado (um inteiro de 1 a 5)
- valor inicial de carga
Seu programa deve calcular qual o valor final de uma carga de acordo com as seguintes regras.
Caso o código de estado seja 2 ou 5 o valor final da carga é o valor inicial menos 12%.
Caso o código de estado seja 1, 3 ou 4, o valor final da carga é o valor inicial menos 15%. */