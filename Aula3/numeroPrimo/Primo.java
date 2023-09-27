package aula3.numeroPrimo;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        long n = sc.nextLong(); //Long é para testar números primos grandes
        if(n<=3){
            System.out.println("É primo!");
        }else{
            boolean ehPrimo = true;
            for (long div = 2; div < (n - 1); div++) {
                if(n % div == 0){
                    System.out.println("Consegui dividir por: "+ div);
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println("É primo!");
            }else{
                System.out.println("Não é primo!");
            }
        }
        sc.close();
    }
}
