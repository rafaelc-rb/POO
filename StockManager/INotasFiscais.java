package manager;

/**
 * Interface que especifica os m�todos m�ninos para manipular uma cole��o de notas fiscais.
 */
public interface INotasFiscais {
            
    /**
     * Adiciona uma nota fiscal.
     * @param nf Nota fiscal a ser adicionada.
     * @return True se a nota for inclu�da com sucesso e False caso contr�rio.
     */
    public abstract boolean addNotaFiscal(NotaFiscal nf);
    
    /**
     * Remove a nota fiscal com c�digo informado.
     * @param codigo C�digo da nota fiscal a ser removida.
     * @return True se a nota for removida com sucesso e False caso contr�rio.
     */
    public abstract boolean removeNotaFiscal(int codigo);
    
    /**
     * Captura a nota fiscal com a nota fiscal informada.
     * @param codigo C�digo da nota fiscal a ser capturada.
     * @return A nota fiscal com o c�digo informado ou NULL caso a nota fiscal n�o seja encontrada.
     */
    public abstract NotaFiscal getNotaFiscal(int codigo);
    
	/**
     * Captura o total da nota fiscal informada.
     * @param codigo C�digo da nota fiscal.
     * @return O total (soma do valor de todos os items) da nota fiscal com o c�digo informado ou NULL caso a nota fiscal n�o seja encontrada.
     */
    public abstract double getTotal(int codigo);

    /**
     * Adiciona um item a nota fiscal com o c�digo informado.
     * @param codigo C�digo da nota fiscal na qual o item deve ser adicionado.
     * @param item Item a ser adicionado.
     * @return True caso o item foi adicionado com sucesso e False caso a nota fiscal n�o exista ou a quantidade do produto em estoque seja menos do que a solicitada.
     */
    public abstract boolean addItem(int codigo, Item item);
    
    /**
     * Remove um item da nota fiscal com o c�digo informado.
     * @param codigo C�digo da nota fiscal na qual o item deve ser removido.
     * @param item Item a ser removido.
     * @return True caso o item foi removido com sucesso e False caso contr�rio.
     */
    public abstract boolean removeItem(int codigo, Item item);
}