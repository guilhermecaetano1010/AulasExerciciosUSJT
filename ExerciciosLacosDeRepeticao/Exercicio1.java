package exerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {
        public static void main(String[] args) {
        int anoContratacao = 2005;
        double salario = 1000.00;

        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual:"));

        for (int ano = 2006; ano <= anoAtual; ano++) {
            double aumento = salario * 0.015; // 1,5%
            salario += aumento;
        }
        JOptionPane.showMessageDialog(null, anoContratacao);
        JOptionPane.showMessageDialog(null, "O salário atual do funcionário em " + anoAtual + " é R$" + salario);
    }
}