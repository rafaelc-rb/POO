package manager;

public class Item {
	private Produto produto;
	private double quantidade;
	private double preco;
	
    /**
     * Construtor da Classe Item com as insformações de construção.
     * @param produto Produto.
     * @param double quantidade.
     */
    public Item (Produto produto, double quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = produto.getPreco() * quantidade;
    }

    /**
     * @return produto.
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto.
     */
	public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return quantidade.
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade.
     */
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    /**
     * @return preco.
     */
    public double getPreco() {
		return preco;
	}

    /**
     * Cria uma String que retorna as informações do item.
     * @return dados
     */
    @Override
	public String toString() {
    	String dados = "";
    	dados += "\nProduto: " + produto.getNome() + "\nCodigo: " + produto.codigo + "\nPreço 1x: R$" + produto.getPreco() + "\nQuantidade Vendida: " + quantidade + "\n";
		return dados;
	}
}