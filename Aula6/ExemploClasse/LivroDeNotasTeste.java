package Aula6.ExemploClasse;

import javax.swing.JOptionPane;

public class LivroDeNotasTeste {
    public static void main(String[] args) {
        String nomeDoCurso = JOptionPane.showInputDialog("Querido professor, qual o nome do curso?");
        LivroDeNotas livroDeNotas = new LivroDeNotas(nomeDoCurso);
        livroDeNotas.setNomeDoCurso(nomeDoCurso);
        livroDeNotas.exibirMensagem(nomeDoCurso);

    }
}

/* public class TesteLivroDeNotas {
    public static void main(String[] args) {
        var caderninho = new LivroDeNotas();
        caderninho.exibirMensagem();
    }
}
 */