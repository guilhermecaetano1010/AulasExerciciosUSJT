package exerciciosSolucoes.exercicio6;

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta bancária:"));
        double withdraw = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja sacar:"));

        double finalBalance = balance - withdraw;
        if(finalBalance>=0){
           JOptionPane.showMessageDialog(null, "O saque foi realizado, seu saldo final é: "+finalBalance+ " reais.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não é possível sacar esse valor pois seu saldo atual é: "+balance+ " reais.");
        }
    }
}
/*Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o saque.*/