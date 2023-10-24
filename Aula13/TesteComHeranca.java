package Aula13;

public class TesteComHeranca {
    public static void main(String[] args) {
        var aluno = new AlunoDeGraduacao(null, 0);
        aluno.nome = "José";
        aluno.idade = 19;
        System.out.printf("nome: %s, idade: %d", aluno.nome, aluno.idade);
    }
}
