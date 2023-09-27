package exerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio13 {
        public static void main(String[] args) {
        int totalCriancas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de crianças nascidas no período:"));
        int criancasMortasFeminino = 0;
        int criancasMortasMasculino = 0;
        int criancasMenos24Meses = 0;

        for (int i = 1; i <= totalCriancas; i++) {
            String sexo = JOptionPane.showInputDialog("Informe o sexo da criança " + i + " (M/F):").toUpperCase();
            int tempoVida = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de vida (em meses) da criança " + i + ":"));

            if (sexo.equals("F") && tempoVida == 0) {
                criancasMortasFeminino++;
            }

            if (sexo.equals("M") && tempoVida == 0) {
                criancasMortasMasculino++;
            }

            if (tempoVida <= 24) {
                criancasMenos24Meses++;
            }
        }

        double percentagemMortasFeminino = (double) criancasMortasFeminino / totalCriancas * 100;
        double percentagemMortasMasculino = (double) criancasMortasMasculino / totalCriancas * 100;
        double percentagemMenos24Meses = (double) criancasMenos24Meses / totalCriancas * 100;

        JOptionPane.showMessageDialog(null, "Percentagem de crianças do sexo feminino mortas: " + percentagemMortasFeminino + "%" +
                "\nPercentagem de crianças do sexo masculino mortas: " + percentagemMortasMasculino + "%" +
                "\nPercentagem de crianças que viveram 24 meses ou menos: " + percentagemMenos24Meses + "%");
    }
}
