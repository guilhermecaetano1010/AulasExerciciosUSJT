package ExerciciosSolucoes.exercicio8;

import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura(m):"));
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso(kg):"));

        double bmi =  weight/(height*height);

        if (bmi < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo de 18,5\n"+"- Abaixo do peso ideal."); 
        } else if(18.5<= bmi && bmi <= 24.9) {
            JOptionPane.showMessageDialog(null, "Entre 18,5 e 24,9\n"+"- Peso ideal, muito bem.");
        }else if(25.0<= bmi && bmi <= 29.9) {
            JOptionPane.showMessageDialog(null, "Entre 25,0 e 29,9\n"+"- Sobrepeso, um regime leve pode ajudar.");
        }else if(30.0<= bmi && bmi <= 34.9) {
            JOptionPane.showMessageDialog(null, "Entre 30,0 e 34,9\n"+" - Obesidade leve.");
        }else if(35.5<= bmi && bmi <= 39.9) {
            JOptionPane.showMessageDialog(null, "Entre 35,0 e 39,9\n"+"- Obesidade moderada.");
        }else if(40 < bmi) {
            JOptionPane.showMessageDialog(null, "Acima de 40\n"+" - Obesidade mórbida.");
        }
    }
}
/*Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea.
O programa deve exibir um texto para o usuário conforme a tabela abaixo:
IMC Texto
Abaixo de 18,5 Abaixo do peso ideal.
Entre 18,5 e 24,9 Peso ideal, muito bem.
Entre 25,0 e 29,9 Sobrepeso, um regime leve pode ajudar.
Entre 30,0 e 34,9 Obesidade leve.
Entre 35,0 e 39,9 Obesidade moderada.
Acima de 40 Obesidade mórbida.*/