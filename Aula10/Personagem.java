package Aula10;

public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;


    void cacar() {
        if(energia>=2){
            System.out.println(nome + "caçando");
            energia -= 2;
        }
        else{
            System.out.println(nome + "sem energia para caçar");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }
    
    void comer(){
    if (fome >= 1) {
        System.out.println(fome + "comendo");
        energia = Math.min(energia + 1, 10);
        fome -= 1;
    }
    }

    void dormir(){
        System.out.println(sono + "dormindo");
    }
}
