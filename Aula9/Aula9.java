package Aula9;
import java.sql.DriverManager;
import java.sql.Connection;
public class Aula9 {
    
public static void main(String[] args) {
try{
Connection conexao =
DriverManager.getConnection(

//essa é a conhecida string de conexão
"jdbc:mysql://localhost:3306/teste",
"root",
"1234"
);
if (conexao != null){
System.out.println("Conexão estabelecida com sucesso!");
}
else{
System.out.println("Conexão não estabelecida!");
}
}
catch (Exception e){

System.out.println("Exceção: " + e.getMessage());

}
}
}