package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.alura.jdbc.factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		Connection connection = new ConnectionFactory().recuperarConexao();
		
		System.out.println("Fechando conexão!");
		
		connection.close();
	}

}
