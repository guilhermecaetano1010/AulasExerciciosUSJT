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
            System.out.print(nome + " caçando");
            energia -= 2;
        }
        else{
            System.out.print(nome + " sem energia para caçar");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
        estado();        
    }
    
    void comer(){
    if (fome >= 1) {
        System.out.print(nome + " comendo");
        energia = Math.min(energia + 1, 10);
        fome -= 1;
    } else{
        System.out.print(nome + " sem sono");
    }
       estado();
}


    void dormir(){
        if (sono >= 1) {
            System.out.print(nome + " dormindo");
            sono-=1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else{
            System.out.print(nome + " sem sono");
        }
        estado();
    
    }
    void estado(){
        System.out.print(/*nome +*/ "  [energia: "+ energia + " fome: " + fome + " sono: " + sono + "]\n");
    }
}