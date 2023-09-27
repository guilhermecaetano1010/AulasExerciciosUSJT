package exerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio7 {
        public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de termos da sequência de Fibonacci:"));
        int a = 0;
        int b = 1;

        StringBuilder sequencia = new StringBuilder("Sequência de Fibonacci:");

        for (int i = 0; i < n; i++) {
            sequencia.append(" ").append(a);
            int temp = a + b;
            a = b;
            b = temp;
        }

        JOptionPane.showMessageDialog(null, sequencia.toString());
    }
}
