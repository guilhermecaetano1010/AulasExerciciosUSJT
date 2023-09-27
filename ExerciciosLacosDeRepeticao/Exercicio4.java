package exerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio4 {
        public static void main(String[] args) {
        int cidadeComMenosVeiculos = 0;
        int cidadeComMaisVeiculos = 0;
        int menorIndiceAcidentes = Integer.MAX_VALUE;
        int maiorIndiceAcidentes = Integer.MIN_VALUE;
        int totalVeiculos = 0;
        int totalAcidentes = 0;
        int cidadesMenos2000Veiculos = 0;

        for (int i = 1; i <= 5; i++) {
            int codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da cidade " + i + ":"));
            int veiculosPasseio = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de veículos de passeio em 2007 na cidade " + i + ":"));
            int acidentesTransito = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de acidentes de trânsito com vítimas em 2007 na cidade " + i + ":"));

            totalVeiculos += veiculosPasseio;
            totalAcidentes += acidentesTransito;

            if (veiculosPasseio < 2000) {
                cidadesMenos2000Veiculos++;
            }

            int indiceAcidentes = acidentesTransito * 100 / veiculosPasseio;

            if (indiceAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = indiceAcidentes;
                cidadeComMenosVeiculos = codigoCidade;
            }

            if (indiceAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = indiceAcidentes;
                cidadeComMaisVeiculos = codigoCidade;
            }
        }

        double mediaVeiculos = (double) totalVeiculos / 5;
        double mediaAcidentes = (double) totalAcidentes / 5;

        JOptionPane.showMessageDialog(null, "Cidade com menos veículos: Cidade " + cidadeComMenosVeiculos +
                "\nCidade com mais veículos: Cidade " + cidadeComMaisVeiculos +
                "\nMédia de veículos nas cidades: " + mediaVeiculos +
                "\nMédia de acidentes nas cidades com menos de 2.000 veículos de passeio: " + mediaAcidentes +
                "\nTotal de cidades com menos de 2.000 veículos de passeio: " + cidadesMenos2000Veiculos);
    }
}
