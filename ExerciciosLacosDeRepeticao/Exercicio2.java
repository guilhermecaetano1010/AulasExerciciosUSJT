package exerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {
        public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro positivo N:"));
        double e = 1.0;
        double fatorial = 1.0;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
            e += 1.0 / fatorial;
        }

        JOptionPane.showMessageDialog(null, "O valor de E para N = " + n + " é " + e);
    }
}
