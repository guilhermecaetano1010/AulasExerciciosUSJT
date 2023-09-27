package ExerciciosSolucoes.Exercicio7;


import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        double value = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da roupa em reais: "));
        int payment = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de pagamento entre:\n"+
        "0 - Compra à vista\n"+"1 - Compra parcelada no cartão\n"+"2 - Crediário"));
        int installm;
        switch (payment) {
            case 0:
                value -= (value*10/100);
                JOptionPane.showMessageDialog(null, "O valor da compra à vista com 10% de desconto é: "+value+" reais.");
                break;
            case 1:
                installm = Integer.parseInt(JOptionPane.showInputDialog("Quantas parcelas deseja utilizar?"));
                value /= installm;
                JOptionPane.showMessageDialog(null, "O valor de cada parcela é: "+value+" reais.");
                break;
            case 2:
                installm = Integer.parseInt(JOptionPane.showInputDialog("Quantas parcelas deseja utilizar?"));
                value = (value + (value*10/100))/ installm;
                JOptionPane.showMessageDialog(null, "O valor das parcelas do total com juros de 10% é: "+value+" reais.");
                break;
        
            default:
                break;
        }
    }
}
/*Faça um programa que lê um valor real, representando o valor de uma peça de roupa. A seguir, o programa deve ler
um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
0 – Compra à vista
1 – Compra parcelada no cartão
2 – Crediário
Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
Caso o usuário digite */