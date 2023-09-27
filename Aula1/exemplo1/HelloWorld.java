package exemplo1;
import java.util.Scanner;

public class HelloWorld{
public static void main(String[] args) {

System.out.println("Digite o valor de uma variável: ");
Scanner sc = new Scanner(System.in);
int variavel = sc.nextInt();
System.out.println(variavel);
sc.close();



}

}
