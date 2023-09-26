package Aula6.ExemploClasse;

public class LivroDeNotas {
    private String nomeDoCurso;

    public LivroDeNotas (String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }

    public void exibirMensagem(String nomeDoCurso){
        System.out.printf("Bem vindo ao livro de notas %s", getNomeDoCurso());
        
    }
    
}

/* public class LivroDeNotas {
    public void exibirMensagem(){
        System.out.println("Bem vindo ao livro de notas");
    }
} */
