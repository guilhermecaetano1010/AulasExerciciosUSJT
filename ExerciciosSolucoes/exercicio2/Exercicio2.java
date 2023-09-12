package ExerciciosSolucoes.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2{
    public static void main(String[] args) {
       double number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: ")); 
       double number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: ")); 

       if (number1 == number2) {
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
       }
       
    }
}
/*Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina.*/