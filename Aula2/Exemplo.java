import javax.swing.JOptionPane;

public class Exemplo {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
        JOptionPane.showMessageDialog(null,"Os números digitados foram: "+numero1+" e "+numero2);
    }
    
}