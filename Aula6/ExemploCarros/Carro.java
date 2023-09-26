package Aula6.ExemploCarros;

public class Carro {
    
    private String cor;
    private String marca;
    private int velocidade;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void buzinar() {
        System.out.println("Fom");
    }
    public int getVelocidade() {
       return velocidade;
    }
    public void frear(){
        System.out.println("rrrrrrrr...");
        this.velocidade = 0;
    }
}
