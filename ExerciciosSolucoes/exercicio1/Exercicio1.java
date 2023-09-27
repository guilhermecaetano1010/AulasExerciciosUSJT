package exerciciosSolucoes.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        if(number1<number2){
            JOptionPane.showMessageDialog(null, "O número inteiro é menor que o número real!");
        }
    }
}
// Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor
// do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa
// somente termina.