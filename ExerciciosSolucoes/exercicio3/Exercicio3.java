package ExerciciosSolucoes.Exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));

        if (number1 > number2) {
            JOptionPane.showMessageDialog(null, "O primeiro é maior que o segundo!");
        } else {
            JOptionPane.showMessageDialog(null, "O segundo é maior que o primeiro!");
        }
    }
}
/*Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
primeiro”.*/