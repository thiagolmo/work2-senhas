package model;

public class Item {

	private String tipo;
	private String senha;
	private Item proximo;

	public Item(String tipo, String senha) {
		this.tipo = tipo;
		this.senha = senha;
		proximo = null;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;

	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Item getProximo() {
		return proximo;
	}

	public void setProximo(Item proximo) {
		this.proximo = proximo;
	}
}
