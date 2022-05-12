package manager;

abstract class Produto{

	protected static int cod = 1;
	protected int codigo;
	protected String nome, descricao;
	protected double preco;

	public Produto(String nome, String descricao, double preco) {
		
		this.codigo += cod++;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;

	}
	
	public abstract boolean addQuantidade(double quantidade);
	public abstract boolean subQuantidade(double quantidade);
	public abstract void setQuantidade(double quantidade);
	public abstract double getQuantidade();

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "\nCódigo do Produto: " + getCodigo() + "\nNome do Produto: " + getNome() + "\nDescrição: "
				+ getDescricao() + "\nPreço: R$" + getPreco();
	}
}
