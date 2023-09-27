package exerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio12 {
        public static void main(String[] args) {
        int totalOperarios = 15;
        double salarioMinimo = 1100.00;
        double totalFolhaPagamento = 0.0;
        int totalPecasFabricadas = 0;
        int totalPecasHomens = 0;
        int totalPecasMulheres = 0;
        double mediaPecasHomens = 0.0;
        double mediaPecasMulheres = 0.0;
        int operarioMaiorSalario = 0;
        double maiorSalario = 0.0;

        for (int i = 1; i <= totalOperarios; i++) {
            int numeroOperario = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do operário " + i + ":"));
            int pecasFabricadas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de peças fabricadas pelo operário " + i + ":"));
            String sexo = JOptionPane.showInputDialog("Informe o sexo do operário (M/F):").toUpperCase();

            double salario = calcularSalario(pecasFabricadas, salarioMinimo);
            totalFolhaPagamento += salario;
            totalPecasFabricadas += pecasFabricadas;

            if (sexo.equals("M")) {
                totalPecasHomens += pecasFabricadas;
            } else if (sexo.equals("F")) {
                totalPecasMulheres += pecasFabricadas;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
                operarioMaiorSalario = numeroOperario;
            }
        }

        if (totalPecasHomens > 0) {
            mediaPecasHomens = (double) totalPecasHomens / totalOperarios;
        }

        if (totalPecasMulheres > 0) {
            mediaPecasMulheres = (double) totalPecasMulheres / totalOperarios;
        }

        JOptionPane.showMessageDialog(null, "Folha de Pagamento Total: R$" + totalFolhaPagamento +
                "\nTotal de Peças Fabricadas: " + totalPecasFabricadas +
                "\nMédia de Peças Fabricadas pelos Homens: " + mediaPecasHomens +
                "\nMédia de Peças Fabricadas pelas Mulheres: " + mediaPecasMulheres +
                "\nOperário com Maior Salário: Operário " + operarioMaiorSalario + " - Salário: R$" + maiorSalario);
    }

    public static double calcularSalario(int pecasFabricadas, double salarioMinimo) {
        double salario = salarioMinimo;

        if (pecasFabricadas > 30) {
            if (pecasFabricadas <= 31) {
                salario += (pecasFabricadas - 30) * (salarioMinimo * 0.03);
            } else {
                salario += 1 * (salarioMinimo * 0.03);
                salario += (pecasFabricadas - 31) * (salarioMinimo * 0.05);
            }
        }

        return salario;
    }
}
