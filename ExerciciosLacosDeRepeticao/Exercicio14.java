package ExerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio14 {
        public static void main(String[] args) {
        int quantidadeParcelas[] = {1, 3, 6, 9, 12};
        double juros[] = {0, 0.10, 0.15, 0.20, 0.25};
        
        double valorDivida = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da dívida:"));
        StringBuilder tabela = new StringBuilder("Valor da Dívida   Valor dos Juros   Quantidade de Parcelas   Valor da Parcela\n");

        for (int i = 0; i < quantidadeParcelas.length; i++) {
            double juroParcela = valorDivida * juros[i];
            double valorTotal = valorDivida + juroParcela;
            double valorParcela = valorTotal / quantidadeParcelas[i];
            
            tabela.append(String.format("R$ %.2f            R$ %.2f            %d                            R$ %.2f\n", valorTotal, juroParcela, quantidadeParcelas[i], valorParcela));
        }

        JOptionPane.showMessageDialog(null, tabela.toString());
    }
}
