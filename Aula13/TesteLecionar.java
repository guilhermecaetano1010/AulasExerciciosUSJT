package Aula13;

public class TesteLecionar {
    public static void main(String[] args) {
        var profHorista = new ProfessorHorista(null, 0);
        profHorista.setNome("Rodrigo");
        var profPesq = new ProfessorPesquisador(null, 0);
        profPesq.setNome("José");
        profHorista.lecionar();
        profPesq.lecionar();
    }
}
