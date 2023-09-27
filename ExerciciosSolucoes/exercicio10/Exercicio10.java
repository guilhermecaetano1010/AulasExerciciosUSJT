package ExerciciosSolucoes.Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do combo que deseja: "+
        "\n 1 - Misto quente R$5,50"+
        "\n 2 - Salada Chinesa R$10,20"+
        "\n 3 - Suco de Laranja R$4,00"+
        "\n 4 - Suco de Manga R$3,50");

        String price;
        int foodDrink = sc.nextInt();
        
        if(foodDrink>=1 && foodDrink<=4){
            switch (foodDrink) {
                case 1:
                price = "R$5,50";
                System.out.println("Bom apetite, vai lhe custar "+price);    
                    break;
                case 2:
                price = "R$10,20";
                System.out.println("Bom apetite, vai lhe custar "+price);     
                    break;
                case 3:
                price = "R$4,00";
                System.out.println("Tenha um excelente drink, vai lhe custar "+price);     
                break;
                case 4:
                price = "R$3,50";
                System.out.println("Tenha um excelente drink, vai lhe custar "+price);     
                break;

                default:
                    break;
            }
        }
        else{
            System.out.println("Erro! Digite um combo válido!");
        }
        sc.close();
    }
}
/*
 * Escreva um programa que oferece para o usuário as seguintes opções:
 * 1 – Misto quente R$5,50
 * 2 – Salada Chinesa R$10,20
 * 3 – Suco de Laranja R$4,00
 * 4 – Suco de Manga R$3,50
 * Se o usuário digitar qualquer número diferente de 1, 2, 3 ou 4, o seu
 * programa deve exibir uma mensagem de erro e
 * terminar. Caso contrário, se o usuário escolher alguma bebida, o programa
 * deve exibir “tenha um excelente drink, vai
 * lhe custar” seguido do valor da bebida. Se o usuário escolher alguma comida,
 * o programa deve exibir “bom apetite,
 * vai lhe custar” seguido do valor da comida.
 */