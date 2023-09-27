package ExerciciosLacosDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio9 {
        public static void main(String[] args) {
        int totalAlunos = 6;
        int alunosAprovados = 0;
        int alunosExame = 0;
        int alunosReprovados = 0;
        double mediaClasse = 0.0;

        for (int i = 1; i <= totalAlunos; i++) {
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota do aluno " + i + ":"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota do aluno " + i + ":"));

            double mediaAluno = (nota1 + nota2) / 2;
            mediaClasse += mediaAluno;

            String mensagem = "";
            if (mediaAluno <= 3.0) {
                mensagem = "Reprovado";
                alunosReprovados++;
            } else if (mediaAluno <= 7.0) {
                mensagem = "Exame";
                alunosExame++;
            } else {
                mensagem = "Aprovado";
                alunosAprovados++;
            }

            JOptionPane.showMessageDialog(null, "Aluno " + i + " - Média: " + mediaAluno + " - Situação: " + mensagem);
        }

        mediaClasse /= totalAlunos;

        JOptionPane.showMessageDialog(null, "Total de alunos aprovados: " + alunosAprovados +
                "\nTotal de alunos de exame: " + alunosExame +
                "\nTotal de alunos reprovados: " + alunosReprovados +
                "\nMédia da classe: " + mediaClasse);
    }
}
