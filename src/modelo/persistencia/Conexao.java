package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public Connection getConection(){
		try{
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
 			
			String url = "jdbc:mysql://localhost:3306/aula1";
 			String user = "root";
 			String password = "123456";
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println("Conex‹o efetuada com sucesso!");
			
			return con;
		}catch(Exception e){
			System.out.print("Falha ao tentar conex‹o "+ e.getMessage());
			return null;
		}
	}
	
	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		conexao.getConection();
	}
	
}





