package Aula10;

public class Personagem {
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    public Personagem(String nome, int energia, int fome, int sono){
        this (energia, fome, sono);
        this.nome = nome;
    }


    public Personagem(int energia, int fome, int sono){
        if (energia >= 0 && energia <= 10) {
            this.energia = energia;
        }
        if (fome >= 0 && fome <=10) {
            this.fome = fome;
        }
        if (sono >= 0 && sono <= 10) {
            this.sono = sono;
        }
    }


    void cacar() {
        if(energia>=2){
            System.out.println(nome + " caçando");
            energia -= 2;
        }
        else{
            System.out.println(nome + " sem energia para caçar");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }
    
    void comer(){
    if (fome >= 1) {
        System.out.println(fome + " comendo");
        energia = Math.min(energia + 1, 10);
        fome -= 1;
    } else{
        System.out.println(nome + " sem sono");
    }
    }

    void dormir(){
        if (sono >= 1) {
            System.out.println(sono + " dormindo");
            sono-=1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else{
            System.out.println(nome + " sem sono");
        }
            
       
            
    }
}
