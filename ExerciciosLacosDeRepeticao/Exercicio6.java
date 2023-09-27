package ExerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio6 {
        public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do funcionário " + i + ":"));
            int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de horas trabalhadas pelo funcionário " + i + ":"));
            String turno = JOptionPane.showInputDialog("Informe o turno de trabalho (M/V/N) do funcionário " + i + ":");
            String categoria = JOptionPane.showInputDialog("Informe a categoria (O/G) do funcionário " + i + ":");
            
            double valorHora = calcularValorHora(turno, categoria);
            double salarioInicial = calcularSalarioInicial(horasTrabalhadas, valorHora);
            double auxilioAlimentacao = calcularAuxilioAlimentacao(salarioInicial);
            double salarioFinal = salarioInicial + auxilioAlimentacao;

            JOptionPane.showMessageDialog(null, "Código: " + codigo +
                    "\nHoras Trabalhadas: " + horasTrabalhadas +
                    "\nValor da Hora Trabalhada: R$" + valorHora +
                    "\nSalário Inicial: R$" + salarioInicial +
                    "\nAuxílio Alimentação: R$" + auxilioAlimentacao +
                    "\nSalário Final: R$" + salarioFinal);
        }
    }

    public static double calcularValorHora(String turno, String categoria) {
        double salarioMinimo = 450.00;
        double percentual = 0.0;

        if (categoria.equals("G")) {
            if (turno.equals("N")) {
                percentual = 0.18;
            } else {
                percentual = 0.15;
            }
        } else {
            if (turno.equals("N")) {
                percentual = 0.13;
            } else {
                percentual = 0.10;
            }
        }

        return salarioMinimo * percentual;
    }

    public static double calcularSalarioInicial(int horasTrabalhadas, double valorHora) {
        return horasTrabalhadas * valorHora;
    }

    public static double calcularAuxilioAlimentacao(double salarioInicial) {
        if (salarioInicial <= 300.00) {
            return salarioInicial * 0.20;
        } else if (salarioInicial <= 600.00) {
            return salarioInicial * 0.15;
        } else {
            return salarioInicial * 0.05;
        }
    }
}
