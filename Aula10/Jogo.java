package Aula10;
public class Jogo {
    public static void main(String[] args) throws InterruptedException {
            Personagem cacador = new Personagem("John", 10, 0, 0);
            Personagem soneca = new Personagem("Soneca", 2, 6, 4);
            Personagem mineiro = new Personagem("Cruzeirense", 2, 6, 4);
            // soneca.nome = "Soneca";
            // cacador.nome = "John";
        while (true) {
            cacador.cacar();
            soneca.dormir();
            mineiro.comer();
            cacador.comer();
            soneca.dormir();
            mineiro.cacar();
            cacador.dormir();
            soneca.dormir();
            mineiro.dormir();
            cacador.cacar();
            soneca.comer();
            mineiro.dormir();
            cacador.cacar();
            soneca.cacar();
            mineiro.comer();
            System.out.println("==========================");
            Thread.sleep(3000);

        }
    }
}
