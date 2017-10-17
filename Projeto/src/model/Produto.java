package model;

public class Produto {
	
	private String nome;
	private String descricao;
     
	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}

	private Integer id;
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString(){
		return String.format("[produto: %d %s %s]", id, nome, descricao);
	}
	
	
}
