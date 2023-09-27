package ExerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio8 {
        public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de termos da série:"));
        int valor = 2;
        StringBuilder serie = new StringBuilder("Série:");

        for (int i = 1; i <= n; i++) {
            serie.append(" ").append(valor);
            if (i % 2 == 0) {
                valor += 5;
            } else {
                valor -= 1;
            }
        }

        JOptionPane.showMessageDialog(null, serie.toString());
    }
}
