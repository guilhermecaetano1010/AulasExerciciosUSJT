package Aula3.salario;


public class Salario {
    public static void main(String[] args) {
        double salario = 1000;
        double percentual = 1.5;
        for(int ano = 2006; ano<= 2023; ano++){
            percentual *= 2;
            System.out.println("Anooo: "+ ano +" Salário: "+salario+ " Percentual do ano seguinte: "+percentual);
        }
        System.out.println(salario);
    }

}
