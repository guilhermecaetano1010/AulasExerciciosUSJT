package exemplo2;

import javax.swing.JOptionPane;

public class InterfaceGrafica {
    public static void main(String[] args) {
        double primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        double segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        JOptionPane.showMessageDialog(null, "A soma é " + (primeiroValor + segundoValor));
    }
    //Como fazer a entrada e saída de dados em uma interface gráfica
}


