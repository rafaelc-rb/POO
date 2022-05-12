package manager;

import java.util.ArrayList;

public class Estoque implements IProdutos {

	private static ArrayList<Produto> prod = new ArrayList<>();

    /**
     * Adiciona um produto ao estoque.
     * @param p Produto
     * @return True se o produto for inclu�do com sucesso e False caso contr�rio.
     */
	@Override
	public boolean addProduto(Produto p) {
		return prod.add(p);
	}

    /**
     * Remove o produto com c�digo informado.
     * @param codigo C�digo do produto a ser removido.
     * @return True se o produto for removido com seucesso e False caso contr�rio.
     */
	@Override
	public boolean removeProduto(int codigo) {
		for (Produto p : prod) {
			if (p.getCodigo() == codigo) {
				prod.remove(p);
				return true;
			}
		}
		return false;
	}

    /**
     * Captura o produto com o c�digo informado.
     * @param codigo C�digo do produto a ser capturado.
     * @return O produto com o c�digo informado ou NULL caso produto n�o seja encontrado.
     */
	@Override
	public Produto getProduto(int codigo) {
		for (Produto p : prod) {
			if (p.getCodigo() == codigo) {
				return p;
			}
		}
		return null;
	}

    /**
     * Altera a quantidade do produto com o c�digo informado.
     * @param codigo C�digo do produto a ser alterado.
     * @param nova Nova quantidade do produto.
     * @return True se a quantidade foi corretamente atualizada e False caso contr�rio.
     */
	@Override
	public boolean updateQuantidade(int codigo, double nova) {
		for (Produto p : prod) {
			if (p.getCodigo() == codigo) {
				p.setQuantidade(nova);
				return true;
			}
		}
		return false;
	}

    /**
     * Altera o pre�o do produto com o c�digo informado.
     * @param codigo C�digo do produto a ser alterado.
     * @param novo Novo pre�o do produto.
     * @return True se o pre�o foi corretamente atualizado e False caso contr�rio.
     */
	@Override
	public boolean updatePreco(int codigo, double novo) {
		for (Produto p : prod) {
			if (p.getCodigo() == codigo) {
				p.setPreco(novo);
				return true;
			}
		}
		return false;
	}

    /**
     * Adiciona a quantidade ao produto com c�digo informado.
     * @param codigo C�digo do produto a ser alterado.
     * @param quantidade Quantidade a ser acrescentada.
     * @return True se a quantidade for adicionada e False caso contr�rio. 
     */
	@Override
	public boolean addQuantidade(int codigo, double quantidade) {
		for (Produto p : prod) {
			if (p.getCodigo() == codigo) {
				p.setQuantidade(p.getQuantidade() + quantidade);
				return true;
			}
		}
		return false;
	}

    /**
     * Subtrai a quantidade do produto com c�digo informado.
     * @param codigo C�digo do produto a ser alterado.
     * @param quantidade Quantidade a ser subtra�da.
     * @return True se a quantidade for subtra�da e False caso contr�rio. 
     */
	@Override
	public boolean subQuantidade(int codigo, double quantidade) {
		for (Produto p : prod) {
			if (p.getCodigo() == codigo) {
				p.setQuantidade(p.getQuantidade() - quantidade);
				return true;
			}
		}
		return false;
	}
}
