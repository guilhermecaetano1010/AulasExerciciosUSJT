package Aula3.repeticao2;

import javax.swing.JOptionPane;

public class Repeticao2 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        int contador = 1;

        while (contador <= 5) {

            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            media = (nota1 + nota2) / 2;
            contador += 1;
            JOptionPane.showMessageDialog(null, "Sua média é igual a: " + media);
        }

    }
}
