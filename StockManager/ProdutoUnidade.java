package manager;

public class ProdutoUnidade extends Produto {

	private int quantidade;

	/**
     * Construtor da Classe ProdutoUnidade com as insformações de construção.
     * @param String nome.
     * @param String descricao.
     * @param double preco.
     * @param int quantidade.
     */
	public ProdutoUnidade(String nome, String descricao, double preco, int quantidade) {
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
		int qi;
		qi = (int) quantidade;
		this.quantidade = qi;
	}
	
	/**
     * Adiciona quantidade em unidades de um produto ao estoque.
     * @param double quantidade.
     * @return True caso for adicionada a quantidade do estoque.
     */
	@Override
	public boolean addQuantidade(double quantidade) {
		this.quantidade += quantidade;
		return true;
	}
	
	/**
     * Subtrai quantidade em unidades de um produto ao estoque.
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
		return super.toString() + "\nQuantidade: " + quantidade + " unidades\n\n";
	}
}