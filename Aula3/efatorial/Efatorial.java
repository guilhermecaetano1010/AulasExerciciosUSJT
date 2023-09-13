package Aula3.efatorial;

import java.util.Scanner;

public class Efatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double e = 1;

        for (int i = 1; i <= n; i++) {
            double fatorial = 1;
            for (int j = 2; j <= i; j++) {
                fatorial*= j;
            }
            e = e + (1 / fatorial);
        }
        System.out.println(e);
        sc.close();
    }
}
/* E = 1+ 1/1!+ ....+1/N! */
