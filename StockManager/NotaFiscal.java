package manager;

import java.util.ArrayList;

public class NotaFiscal {

    private static int cod = 1;
    private int codigo;
    private String data;
    
    protected ArrayList<Item> it = new ArrayList<>();
    
    /**
     * Construtor da Classe NotaFiscal com as insformações de construção.
     * @param String data.
     */
    public NotaFiscal (String data) {
    	
    	this.codigo += cod++;
    	this.data = data;
    }
    
    /**
     * Retorna o item de um Array de itens.
     * @param codigo da nota fiscal.
     * @return o item ou null caso o item não estiver na array de itens.
     */
    public Item getItem(int codigo) { 
    	for(Item i : it) {
    		if (i.getProduto().getCodigo() == codigo)
    			return i;
    	}
    	return null;
	}

	/**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
    /**
     * Cria uma String que retorna as informações da Nota Fiscal.
     * @return dados
     */
    @Override
	public String toString() {
		return "\n=== NFe StockManager ===" + "\nCódigo da NF: " + getCodigo() + "\nData: " + getData() + "\nItens: " + it;
	}
}