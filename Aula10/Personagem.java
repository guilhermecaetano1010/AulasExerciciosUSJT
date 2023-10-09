package Aula10;

public class Personagem {
    String nome;
    int energia;
    int fome;
    int sono;


    void cacar() {
        System.out.println(nome + "caçando");
    }
    
    void comer(){
    System.out.println(fome + "comendo");
    }

    void dormir(){
        System.out.println(sono + "dormindo");
    }
}
