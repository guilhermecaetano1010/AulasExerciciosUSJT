package ExerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {
       public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número N:"));
        
        for (int i = 0; i < n; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro e positivo:"));
            int fatorial = 1;

            for (int j = 1; j <= valor; j++) {
                fatorial *= j;
            }

            JOptionPane.showMessageDialog(null, "Valor: " + valor + "\nFatorial: " + fatorial);
        }
    }
}
