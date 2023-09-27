package aula6.ExemploClasse;

import javax.swing.JOptionPane;

public class LivroDeNotasTeste {
    public static void main(String[] args) {
        String primeiroCurso= JOptionPane.showInputDialog("Professor, qual o nome do primeiro curso?");
        String segundoCurso= JOptionPane.showInputDialog("Professor, qual o nome do segundo curso?");
        LivroDeNotas livroDeNotas1 = new LivroDeNotas(primeiroCurso);
        LivroDeNotas livroDeNotas2 = new LivroDeNotas(segundoCurso);

        livroDeNotas1.exibirMensagem(primeiroCurso);
        livroDeNotas2.exibirMensagem(segundoCurso);

    }
}

/* public class TesteLivroDeNotas {
    public static void main(String[] args) {
        var caderninho = new LivroDeNotas();
        caderninho.exibirMensagem();
    }
}
 */