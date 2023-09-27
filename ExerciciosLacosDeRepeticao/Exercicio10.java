package exerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio10 {
        public static void main(String[] args) {
        int totalTimes = 5;
        int totalJogadores = totalTimes * 11;
        int jogadoresMenores18 = 0;
        double somaAlturas = 0.0;
        double mediaAlturas = 0.0;
        int jogadoresMais80Kg = 0;
        
        for (int i = 1; i <= totalJogadores; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do jogador " + i + ":"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso (em kg) do jogador " + i + ":"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura (em metros) do jogador " + i + ":"));

            if (idade < 18) {
                jogadoresMenores18++;
            }

            somaAlturas += altura;

            if (peso > 80.0) {
                jogadoresMais80Kg++;
            }
        }

        mediaAlturas = somaAlturas / totalJogadores;
        double percentagemMais80Kg = (double) jogadoresMais80Kg / totalJogadores * 100;

        JOptionPane.showMessageDialog(null, "Quantidade de jogadores com menos de 18 anos: " + jogadoresMenores18 +
                "\nMédia das alturas de todos os jogadores: " + mediaAlturas +
                "\nPercentagem de jogadores com mais de 80 kg: " + percentagemMais80Kg + "%");
    }
}
