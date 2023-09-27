package exerciciosSolucoes.exercicio5;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args){
        int number1, number2, number3, product, sum, average;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        number3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        sum = number1+number2+number3;
        average = (number1+number2+number3)/3;
        product = number1*number2*number3;

        JOptionPane.showMessageDialog(null, "O valor da soma é: "+sum);
        JOptionPane.showMessageDialog(null, "O valor da média é: "+average);
        JOptionPane.showMessageDialog(null, "O valor do produto é: "+product);
        
        if (number1>number2 && number1>number3 && number2>number3) {
            JOptionPane.showMessageDialog(null, "O maior número é o primeiro: "+number1);
            JOptionPane.showMessageDialog(null, "O menor número é o terceiro: "+number3);
        }
         else if(number1>number2 && number1>number3 && number3>number2){
            JOptionPane.showMessageDialog(null, "O maior número é o primeiro: "+number1);
            JOptionPane.showMessageDialog(null, "O menor número é o segundo: "+number2);
        }
        else if(number2>number1 && number2>number3 && number3>number1){
            JOptionPane.showMessageDialog(null, "O maior número é o segundo: "+number2);
            JOptionPane.showMessageDialog(null, "O menor número é o primeiro: "+number1);
        }
        else if(number2>number1 && number2>number3 && number1>number3){
            JOptionPane.showMessageDialog(null, "O maior número é o segundo: "+number2);
            JOptionPane.showMessageDialog(null, "O menor número é o terceiro: "+number3);
        }
        else if(number3>number2 && number3>number1 && number2>number1){
            JOptionPane.showMessageDialog(null, "O maior número é o terceiro: "+number3);
            JOptionPane.showMessageDialog(null, "O menor número é o primeiro: "+number1);
        }
        else if(number3>number1 && number3>number2 && number1>number2){
            JOptionPane.showMessageDialog(null, "O maior número é o terceiro: "+number3);
            JOptionPane.showMessageDialog(null, "O menor número é o segundo: "+number2);
        }

    }
}
/*Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o
maior desses números.*/