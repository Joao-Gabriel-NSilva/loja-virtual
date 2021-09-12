package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.modelo.Categoria;

public class TestaListagemDeCategoria {

	public static void main(String[] args) throws SQLException {

		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaCategorias = categoriaDAO.listar();
			listaCategorias.stream().forEach(lc -> System.out.println(lc.getNome()));
		}
	}

}