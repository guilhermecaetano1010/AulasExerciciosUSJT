package Aula13;

public class Professor extends Pessoa {

    public Professor(String nome, int idade) {
        super(nome, idade);
        //TODO Auto-generated constructor stub
    }

    int matricula;

    public void lecionar() {
        System.out.println(getNome() + " lecionando...");
    }
}
