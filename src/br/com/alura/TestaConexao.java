package br.com.alura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection
				("jdbc:mysql://localhost:1604/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "j18g180604");
		
		System.out.println("Fechando conexão!");
		
		connection.close();
	}

}
