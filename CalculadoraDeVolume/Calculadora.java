package CalculadoraDeVolume;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
       int numero = 0;
        while (numero != 4) {
            
            int raio;
            int altura;
            double volume;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da forma geométrica que deseja calcular o volume:"+"\n1 - Cone Reto"+"\n2 - Cilíndro"+ "\n3 - Esfera"+"\n4 - Sair"));
            switch (numero) {
                case 1:
                raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio: "));      
                altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));  
                volume = (3.1416 * Math.pow(raio,2)*altura)/3d; 
                JOptionPane.showMessageDialog(null, "O volume do Cone Reto é igual a: " + volume+" m³");   
                break;
                
                case 2:
                raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio: "));      
                altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));  
                volume = 3.1416 * Math.pow(raio,2) * altura;    
                JOptionPane.showMessageDialog(null, "O volume do Cilíndro é igual a: " + volume+" m³");
                
                break;
                
                case 3:
                raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio: "));      
                volume = (4 * 3.1416 * Math.pow(raio,3))/3d;
                JOptionPane.showMessageDialog(null, "O volume da Esfera é igual a: " + volume+" m³");
                
                break;
                case 4:
                JOptionPane.showMessageDialog(null, "Encerrando o programa........");
                
                break;
                
                default:
                JOptionPane.showMessageDialog(null, "Número inválido!");
                break;
                
            }

    
        }
    }
}
