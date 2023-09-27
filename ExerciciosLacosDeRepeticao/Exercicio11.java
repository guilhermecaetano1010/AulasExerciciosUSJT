package exerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio11 {
        public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro maior que 1:"));

        if (numero <= 1) {
            JOptionPane.showMessageDialog(null, "O número não é válido.");
        } else {
            boolean ehPrimo = true;

            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é primo.");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo.");
            }
        }
    }
}
