package manager;

import java.util.ArrayList;

public class HVenda implements INotasFiscais {   
	private NotaFiscal nf;
	
	private static ArrayList<NotaFiscal> listanf = new ArrayList<>();
	
    public static ArrayList<NotaFiscal> getListanf() {
		return listanf;
	}
    
    /**
     * Adiciona uma nota fiscal.
     * @param nf Nota fiscal a ser adicionada.
     * @return True se a nota for incluída com sucesso e False caso contrário.
     */
	@Override
    public boolean addNotaFiscal(NotaFiscal nf) {
        if (listanf.add(nf))
            return true;
        return false;
    }

    /**
     * Remove a nota fiscal com código informado.
     * @param codigo Código da nota fiscal a ser removida.
     * @return True se a nota for removida com sucesso e False caso contrário.
     */
	@Override
    public boolean removeNotaFiscal(int codigo) {
        for (NotaFiscal nf : listanf) {
            if (nf.getCodigo() == codigo) {
                listanf.remove(nf);
                return true;
            }
        }
        return false;
    }

    /**
     * Captura a nota fiscal com a nota fiscal informada.
     * @param codigo Código da nota fiscal a ser capturada.
     * @return A nota fiscal com o código informado ou NULL caso a nota fiscal não seja encontrada.
     */
    @Override
    public NotaFiscal getNotaFiscal(int codigo) {
        for (NotaFiscal nf : listanf) {
            if (nf.getCodigo() == codigo) {
                return nf;
            }
        }
        return null;
    }

	/**
     * Captura o total da nota fiscal informada.
     * @param codigo Código da nota fiscal.
     * @return O total (soma do valor de todos os items) da nota fiscal com o código informado ou NULL caso a nota fiscal não seja encontrada.
     */
    @Override
    public double getTotal(int codigo) {
        double valorTotal = 0;
        for (NotaFiscal nf : listanf) {
            if (nf.getCodigo() == codigo) {
                for (Item lista : nf.it) {
                    valorTotal = lista.getPreco() + valorTotal;
                }
                return valorTotal;
            }
        }
        return 0;
    }

    /**
     * Adiciona um item a nota fiscal com o código informado.
     * @param codigo Código da nota fiscal na qual o item deve ser adicionado.
     * @param item Item a ser adicionado.
     * @return True caso o item foi adicionado com sucesso e False caso a nota fiscal não exista ou a quantidade do produto em estoque seja menos do que a solicitada.
     */
    @Override
    public boolean addItem(int codigo, Item item) {
    	for (NotaFiscal nf : listanf) {
            if (nf.getCodigo() == codigo) {
            	if(nf.it.add(item))
            		return true;
            }
        }
        return false;
    }

    /**
     * Remove um item da nota fiscal com o código informado.
     * @param codigo Código da nota fiscal na qual o item deve ser removido.
     * @param item Item a ser removido.
     * @return True caso o item foi removido com sucesso e False caso contrário.
     */
    @Override
    public boolean removeItem(int codigo, Item item) {
    	for (NotaFiscal nf : listanf) {
            if (nf.getCodigo() == codigo) {
            	if(nf.it.remove(item))
            		return true;
            }
        }
        return false;
    }
    
    /**
     * Cria uma String que retorna as informações que estão no item da nota fiscal.
     * @return dados
     */
    @Override
    public String toString() {
        String dados = "";
        dados += nf.it.toString();
        return dados;
    }
}
