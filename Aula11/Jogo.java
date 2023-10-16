


public class Jogo{
    public static void main(String[] args) throws InterruptedException/*lança uma interrupção*/{


        Personagem cacador = new Personagem("John", 10, 0, 0);
        Personagem soneca = new Personagem ("Soneca", 2, 6, 4);
        Personagem mineiro = new Personagem("Mineiro", 8, 0, 5);
       // cacador.nome = "John";
        //soneca.nome = "Soneca";


        while(true){


        soneca.comer();
        soneca.comer();
        cacador.dormir();
        soneca.cacar();
        mineiro.comer();
        soneca.cacar();
        cacador.comer();
        soneca.comer();
        mineiro.cacar();
        cacador.cacar();
        soneca.dormir();
        mineiro.dormir();
        cacador.cacar();
        cacador.dormir();
        mineiro.comer();
        cacador.dormir();
        cacador.dormir();
        System.out.println("====================");
        Thread.sleep(3000);
        }
     
    }
}
 

