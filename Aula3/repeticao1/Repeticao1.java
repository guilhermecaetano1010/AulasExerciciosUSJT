package aula3.repeticao1;

import javax.swing.JOptionPane;

public class Repeticao1 {
        public static void main(String[] args) {
            double nota1, nota2, media;
            int contador = 1;

            //while(contador<=5){
                for(contador = 0; contador <=5; contador++){
                    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
                    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
                    media = (nota1+nota2)/2;
                    JOptionPane.showMessageDialog(null, "Sua média é igual a: "+media);
                }

        }
}
