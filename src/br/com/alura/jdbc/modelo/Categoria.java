package br.com.alura.jdbc.modelo;

public class Categoria {

	private Integer id;
	private String nome;
	
	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return String.format("id : %d, nome: %s", this.id, this.nome);
	}
}
