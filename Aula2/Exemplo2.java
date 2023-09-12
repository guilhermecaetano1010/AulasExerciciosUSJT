import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();
        System.out.println("Os números digitados foram: "+numero1+" e "+numero2);
        sc.close();
    }
    
}

