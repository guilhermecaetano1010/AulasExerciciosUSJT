package ExerciciosSolucoes.exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        double number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        
        if (number1>number2) {
            JOptionPane.showMessageDialog(null, number1 +" é o maior.");
        } else if(number1 < number2) {
            JOptionPane.showMessageDialog(null, number2 +" é o maior.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Estes números são iguais.");
        }
    }
}
/*Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário e então imprime
o maior número seguido pelas palavras “é o maior”. Se os números forem iguais, imprime a mensagem “Estes
números são iguais”.*/