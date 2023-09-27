package ExerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio5 {
        public static void main(String[] args) {
   
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos:"));

   
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x:"));

        double resultado = calcularSerie(x, n);

  
        JOptionPane.showMessageDialog(null, "O resultado da série é: " + resultado);
    }

    public static double calcularSerie(double x, int n) {
        double resultado = 0;
        double sinal = 1;

        for (int i = 1; i <= n; i++) {
            double termo = ((Math.pow(x, 2 * i - 1)) / (i * (i - 1))) * sinal;
            resultado += termo;
            sinal = -sinal;
        }

        return resultado;
    }
}
