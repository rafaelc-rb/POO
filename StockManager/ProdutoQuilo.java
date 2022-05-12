package manager;

public class ProdutoQuilo extends Produto {

	private float quantidade;

    /**
     * Construtor da Classe ProdutoQuilo com as insformações de construção.
     * @param String nome.
     * @param String descricao.
     * @param double preco.
     * @param float quantidade.
     */
	public ProdutoQuilo(String nome, String descricao, double preco, float quantidade) {
		super(nome, descricao, preco);
		this.quantidade = quantidade;
	}

	/**
	 * @return the quantidade
	 */
	@Override
	public double getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	@Override
	public void setQuantidade(double quantidade) {
		float qf;
		qf = (float)quantidade;
		this.quantidade = qf;
	}
	
    /**
     * Adiciona quantidade em quilos de um produto ao estoque.
     * @param double quantidade.
     * @return True caso for adicionada a quantidade do estoque.
     */
	@Override
	public boolean addQuantidade(double quantidade) {
		this.quantidade += quantidade;
		return true;
	}
	
    /**
     * Subtrai quantidade em quilos de um produto ao estoque.
     * @param double quantidade.
     * @return True caso for subtraida a quantidade do estoque.
     */
	@Override
	public boolean subQuantidade(double quantidade) {
		this.quantidade -= quantidade;
		return true;
	}
	
    /**
     * Cria uma String
     * @return o toString da classe super, juntamente com a quantidade em estoque do produto.
     */
	@Override
	public String toString() {
		return super.toString() + "\nQuantidade: " + quantidade + "Kg \n\n";
	}
	
}