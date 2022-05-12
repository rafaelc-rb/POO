package manager;

/**
 * Interface que especifica os m�todos m�ninos para manipular uma cole��o de produtos
 * @author Aline
 */
public interface IProdutos {
    /**
     * Adiciona um produto ao estoque.
     * @param p Produto
     * @return True se o produto for inv=clu�do com sucesso e False caso contr�rio.
     */
    public abstract boolean addProduto(Produto p);
    
    /**
     * Remove o produto com c�digo informado.
     * @param codigo C�digo do produto a ser removido.
     * @return True se o produto for removido com seucesso e False caso contr�rio.
     */
    public abstract boolean removeProduto(int codigo);
    
    /**
     * Captura o produto com o c�digo informado.
     * @param codigo C�digo do produto a ser capturado.
     * @return O produto com o c�digo informado ou NULL caso produto n�o seja encontrado.
     */
    public abstract Produto getProduto(int codigo);
    
    /**
     * Altera a quantidade do produto com o c�digo informado.
     * @param codigo C�digo do produto a ser alterado.
     * @param nova Nova quantidade do produto.
     * @return True se a quantidade foi corretamente atualizada e False caso contr�rio.
     */
    public abstract boolean updateQuantidade(int codigo, double nova);
    
	
    /**
     * Altera o pre�o do produto com o c�digo informado.
     * @param codigo C�digo do produto a ser alterado.
     * @param novo Novo pre�o do produto.
     * @return True se o pre�o foi corretamente atualizado e False caso contr�rio.
     */
    public abstract boolean updatePreco(int codigo, double novo);
    
    /**
     * Adiciona a quantidade ao produto com c�digo informado.
     * @param codigo C�digo do produto a ser alterado.
     * @param quantidade Quantidade a ser acrescentada.
     * @return True se a quantidade for adicionada e False caso contr�rio. 
     */
    public abstract boolean addQuantidade(int codigo, double quantidade);

    /**
     * Subtrai a quantidade do produto com c�digo informado.
     * @param codigo C�digo do produto a ser alterado.
     * @param quantidade Quantidade a ser subtra�da.
     * @return True se a quantidade for subtra�da e False caso contr�rio. 
     */
    public abstract boolean subQuantidade(int codigo, double quantidade);

}