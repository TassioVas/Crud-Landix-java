package br.com.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1234567";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/gerenciamento";
	
	public static Connection createConnectionToMySQL() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(USERNAME, PASSWORD, DATABASE_URL);
		
		return connection;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Recuperar conexão com o banco
		Connection conn = createConnectionToMySQL();
		
		if (conn != null) {
			System.out.println("Conectado com sucesso!");
			conn.close();
		}	
	}

}
