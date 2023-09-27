package ExerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio15 {
       public static void main(String[] args) {
        int totalProdutos = 12;
        double custoEstocagem = 0.0;
        double totalImpostos = 0.0;
        double totalPrecosFinais = 0.0;
        double maiorPrecoFinal = 0.0;
        double menorPrecoFinal = Double.MAX_VALUE;
        int produtosBaratos = 0;
        int produtosCaros = 0;
        int produtosNormais = 0;

        for (int i = 1; i <= totalProdutos; i++) {
            double precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço unitário do produto " + i + ":"));
            char refrigeração = JOptionPane.showInputDialog("Informe a refrigeração (S/N) do produto " + i + ":").toUpperCase().charAt(0);
            char categoria = JOptionPane.showInputDialog("Informe a categoria (A/L/V) do produto " + i + ":").toUpperCase().charAt(0);

            custoEstocagem += calcularCustoEstocagem(precoUnitario, refrigeração, categoria);

            double imposto = calcularImposto(precoUnitario, refrigeração, categoria);
            totalImpostos += imposto;

            double precoFinal = precoUnitario + custoEstocagem + imposto;
            totalPrecosFinais += precoFinal;


            if (precoFinal > maiorPrecoFinal) {
                maiorPrecoFinal = precoFinal;
            }

            if (precoFinal < menorPrecoFinal) {
                menorPrecoFinal = precoFinal;
            }

            if (precoFinal <= 20.00) {
                produtosBaratos++;
            } else if (precoFinal > 100.00) {
                produtosCaros++;
            } else {
                produtosNormais++;
            }
        }

        double mediaValoresAdicionais = (custoEstocagem + totalImpostos) / totalProdutos;

        JOptionPane.showMessageDialog(null, totalPrecosFinais);
        JOptionPane.showMessageDialog(null, "Custo de Estocagem Total: R$" + custoEstocagem +
                "\nImpostos Totais: R$" + totalImpostos +
                "\nMédia dos Valores Adicionais: R$" + mediaValoresAdicionais +
                "\nMaior Preço Final: R$" + maiorPrecoFinal +
                "\nMenor Preço Final: R$" + menorPrecoFinal +
                "\nQuantidade de Produtos Baratos: " + produtosBaratos +
                "\nQuantidade de Produtos Caros: " + produtosCaros +
                "\nQuantidade de Produtos Normais: " + produtosNormais);
    }

    public static double calcularCustoEstocagem(double precoUnitario, char refrigeração, char categoria) {
        if (precoUnitario <= 20.00) {
            if (categoria == 'A') {
                return 2.00;
            } else if (categoria == 'L') {
                return 3.00;
            } else if (categoria == 'V') {
                return 4.00;
            }
        } else if (precoUnitario <= 50.00) {
            if (refrigeração == 'S') {
                return 6.00;
            } else if (refrigeração == 'N') {
                return 0.00;
            }
        } else {
            if (categoria == 'A') {
                if (refrigeração == 'S') {
                    return 5.00;
                } else if (refrigeração == 'L') {
                    return 2.00;
                } else if (refrigeração == 'V') {
                    return 4.00;
                }
            } else if (categoria == 'L') {
                return 1.00;
            }
        }
        return 0.00; // Default caso nenhuma das condições seja atendida
    }

    public static double calcularImposto(double precoUnitario, char refrigeração, char categoria) {
        if (categoria == 'A' && refrigeração == 'S') {
            return precoUnitario * 0.04;
        }
        return precoUnitario * 0.02;
    }
}
/* Olá
 * 
 */