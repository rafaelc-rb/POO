package manager;

import java.util.Scanner;

public class StockManager {
	private Estoque e = new Estoque();
	HVenda hv = new HVenda();

	public void Menu() {
		/*
		 * M�todo que mostra o Menu na aplica��o.
		 * */
		int menu = 0;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("========= StockManager =========\n\nGerenciador de Estoque\n"
					+ "1. Adicionar produto no estoque\n" + "2. Remover produto do estoque\n"
					+ "3. Mostrar produto do estoque\n" + "4. Atualizar quantidade total em estoque de um produto\n"
					+ "5. Atualizar pre�o do produto\n" + "6. Adicionar quantidade de produto em estoque\n"
					+ "7. Subtrair quantidade produto em estoque\n\n --------------------------------\n"
					+ "Gerenciador de Notas Fiscais\n" + "8. Adicionar Nota Fiscal\n" + "9. Deletar Nota Fiscal\n"
					+ "10. Mostrar Nota Fiscal\n" + "11. Retornar pre�o total de uma Nota Fiscal\n"
					+ "12. Adicionar item na Nota Fiscal\n" + "13. Remover item da Nota Fiscal\n"
					+ "0. Sair\n\nSua op��o: ");
			menu = in.nextInt();

			switch (menu) {
			case 1:
				addProduto();
				break;

			case 2:
				removeProduto();
				break;

			case 3:
				mostraProduto();

				break;

			case 4:
				updateQuantidade();
				break;

			case 5:
				updatePreco();
				break;

			case 6:
				addEstoque();
				break;

			case 7:
				subtraiEstoque();
				break;

			case 8:
				addNotaFiscal();
				break;

			case 9:
				removeNotaFiscal();
				break;

			case 10:
				mostraNotaFiscal();
				break;

			case 11:
				retornaPrecoTotalNF();
				break;

			case 12:
				addItemNF();
				break;

			case 13:
				removeItemNF();
				break;

			case 0:
				System.exit(0);

			default:
				System.out.println("Insira uma op��o v�lida.\n\n");
				break;

			}
		} while (menu != 0);
	}
	
	/*
	 * M�todo da main que adiciona produto no estoque.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void addProduto() {

		Scanner in = new Scanner(System.in);
		String op;
		String nome;
		String desc;
		double preco;

		try {
			System.out.println("Insira o NOME do Produto: ");
			nome = in.nextLine();

			System.out.println("Insira a DESCRI��O do Produto: ");
			desc = in.nextLine();

			System.out.println("Insira o PRE�O do Produto: ");
			preco = in.nextDouble();

			System.out.println("O produto � por KG ou Unidade? ");
			op = in.next();
			if (op.equalsIgnoreCase("kg") || op.equalsIgnoreCase("k") || op.equalsIgnoreCase("quilos")) {
				System.out.println("Insira os KG do Produto: ");
				float quantidade = in.nextFloat();
				Produto pQ = new ProdutoQuilo(nome, desc, preco, quantidade);

				e.addProduto(pQ);
				System.out.println("\nO seguinte produto foi adicionado: " + pQ.toString());
			} else {
				System.out.println("Insira as UNIDADES do Produto: ");
				int quantidade = in.nextInt();
				Produto pU = new ProdutoUnidade(nome, desc, preco, quantidade);

				e.addProduto(pU);
				System.out.println("\nO seguinte produto foi adicionado: " + pU.toString());
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que remove o produto do estoque.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void removeProduto() {
		Scanner in = new Scanner(System.in);
		String op;

		try {
			System.out.println("Informe o C�DIGO do PRODUTO para ser deletado: ");
			int codD = in.nextInt();
			if (e.getProduto(codD) == null) {
				System.out.println("Este produto n�o est� registrado!");

			} else {
				System.out.println("Deseja realmente deletar o seguinte produto: \n" + e.getProduto(codD));
				op = in.next();
				if (op.equalsIgnoreCase("sim"))
					e.removeProduto(codD);
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que mostra o produto do estoque, juntamente com suas informa��es.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void mostraProduto() {
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Informe o C�DIGO do PRODUTO para ser pesquisado: ");
			int codP = in.nextInt();
			if (e.getProduto(codP) == null) {
				System.out.println("Este produto n�o est� resgitrado!");
			} else {
				System.out.println(e.getProduto(codP));
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que altera a quantidade do produto no estoque.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void updateQuantidade() {
		Scanner in = new Scanner(System.in);
		String op;

		try {
			System.out.println("Informe o C�DIGO do PRODUTO que se deseja alterar sua quantidade no estoque: ");
			int codA = in.nextInt();

			if (e.getProduto(codA) == null) {
				System.out.println("Este produto n�o est� resgitrado!");
			} else {
				System.out.println("O produto � em KG ou UNIDADE? ");
				op = in.next();
				if (op.equalsIgnoreCase("kg") || op.equalsIgnoreCase("k") || op.equalsIgnoreCase("quilos")) {
					System.out.println("Insira os QUILOS do Produto: ");
					float quantidade = in.nextFloat();

					e.updateQuantidade(codA, quantidade);
					System.out.println("\nQuantidade atualizada, produto: )" + e.getProduto(codA) + "\n");
				} else {
					System.out.println("Insira as UNIDADES do Produto: ");
					int quantidade = in.nextInt();

					e.updateQuantidade(codA, quantidade);
					System.out.println("\nQuantidade atualizada, produto: )" + e.getProduto(codA) + "\n");
				}
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que altera o pre�o do produto no estoque.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void updatePreco() {
		Scanner in = new Scanner(System.in);
		int codA;

		try {
			System.out.println("\nInforme o C�DIGO do PRODUTO que se deseja alterar o seu pre�o: ");
			codA = in.nextInt();
			if (e.getProduto(codA) == null) {
				System.out.println("Este produto n�o est� resgitrado!");
			} else {
				System.out.println("\nInforme o novo pre�o do produto: ");
				float newPreco = in.nextFloat();
				e.updatePreco(codA, newPreco);
				System.out.println("Pre�o atualizado!" + e.getProduto(codA) + "\n");
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que adiciona a quantidade do produto no estoque.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void addEstoque() {
		Scanner in = new Scanner(System.in);
		int codA;
		int quant;

		try {
			System.out.println("\nInforme o C�DIGO do PRODUTO que se deseja AUMENTAR a quantidade em estoque: ");
			codA = in.nextInt();
			if (e.getProduto(codA) == null) {
				System.out.println("Este produto n�o est� resgitrado!");
			} else {
				do {
					System.out.println("\nInforme a quantidade que se deseja aumentar do estoque: ");
					quant = in.nextInt();
					if (quant <= 0) {
						System.out.println("Informe um valor maior que zero\n");
					} else {
						e.addQuantidade(codA, quant);
						System.out.println("\nQuantidade em estoque atualizada!" + e.getProduto(codA) + "\n");
					}
				} while (quant <= 0);
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que subtrai a quantidade do produto no estoque.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void subtraiEstoque() {
		Scanner in = new Scanner(System.in);
		int codA;
		double quant;

		try {
			System.out.println("\nInforme o C�DIGO do PRODUTO que se deseja DIMINUIR a quantidade em estoque: ");
			codA = in.nextInt();
			if (e.getProduto(codA) == null) {
				System.out.println("Este produto n�o est� resgitrado!");
			} else {
				do {
					System.out.println("\nInforme a quantidade que se deseja retirar do estoque: ");
					quant = in.nextInt();
					if (quant >= 0) {
						if (quant > e.getProduto(codA).getQuantidade()) {
							System.out.println("Quantidade em estoque insuficiente!\n");
						} else {
							e.subQuantidade(codA, quant);
							System.out.println("\nQuantidade em estoque atualizada!" + e.getProduto(codA) + "\n");
						}
					} else {
						System.out.println("\nValores negativos n�o s�o v�lidos!\n");
					}
				} while (quant < 0);
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que adiciona Nota Fiscal em um Array de Notas Fiscais.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void addNotaFiscal() {
		Scanner in = new Scanner(System.in);
		NotaFiscal nf;

		try {
			System.out.println("\nInforme a data da gera��o da Nota Fiscal: ");
			String data = in.next();
			in.nextLine();

			nf = new NotaFiscal(data);
			hv.addNotaFiscal(nf);
			System.out.println("\nNota Fiscal adicionada!, codigo: " + nf.getCodigo());
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que remove Nota Fiscal de um Array de Notas Fiscais.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void removeNotaFiscal() {
		Scanner in = new Scanner(System.in);
		int CodNF;
		String op;

		try {
			System.out.println("\nInforme o codigo da NF a ser removida: ");
			CodNF = in.nextInt();

			System.out.println("Deseja realmente remover a seguinte NF: \n" + hv.getNotaFiscal(CodNF));
			op = in.next();
			if (op.equalsIgnoreCase("sim"))
				hv.removeNotaFiscal(CodNF);
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main mostra Nota Fiscal de um Array de Notas Fiscais.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void mostraNotaFiscal() {
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("\nInforme o C�DIGO da NOTA FISCAL para ser pesquisado: ");
			int codNF = in.nextInt();
			if (hv.getNotaFiscal(codNF) == null) {
				System.out.println("Esta NF n�o est� registrada!");
			} else {
				for (NotaFiscal nf : HVenda.getListanf()) {
					if (nf.getCodigo() != codNF) {
						System.out.println("Esta NF n�o existe!");
					} else {
						System.out.println(hv.getNotaFiscal(codNF).toString());
					}
				}
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}

	}

	/*
	 * M�todo da main que retorna o pre�o total dos itens de uma Nota Fiscal de um Array de Notas Fiscais.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void retornaPrecoTotalNF() {
		Scanner in = new Scanner(System.in);
		int codigo;

		try {
			System.out.println("\nInforme o C�DIGO da NOTA FISCAL para ser pesquisado: ");
			codigo = in.nextInt();

			if (hv.getNotaFiscal(codigo) == null) {
				System.out.println("Esta NF n�o est� registrada!");
			} else {
				System.out.println("\nPre�o total da Nota Fiscal: R$ " + hv.getTotal(codigo) + ".\n");
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que adiciona itens na Nota Fiscal de um Array de Notas Fiscais.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void addItemNF() {
		Scanner in = new Scanner(System.in);
		int codigo, codNF;
		int op = 0;
		double qtd;

		try {
			System.out.println("\nInforme o C�DIGO da NOTA FISCAL para ser inserido um novo produto: ");
			codNF = in.nextInt();
			if (hv.getNotaFiscal(codNF) == null) {
				System.out.println("Esta NF n�o est� registrada!");
			} else {
				do {
					System.out.println("Informe o c�digo do produto que queira inserir: ");
					codigo = in.nextInt();
					if (e.getProduto(codigo) == null) {
						System.out.println("Este produto n�o est� registrado!");
					} else {
						e.getProduto(codigo);

						for (NotaFiscal nf : HVenda.getListanf()) {
							if (nf.getCodigo() != codNF) {
								System.out.println("Esta NF n�o existe!");
							} else {
								do {
									System.out.println("Informe a quantidade vendida do produto: ");
									qtd = in.nextDouble();
									if (qtd <= 0) {
										System.out.println("Valores negativos n�o s�o v�lidos!\n");
									} else {
										if (qtd <= e.getProduto(codNF).getQuantidade()) {
											Item it = new Item(e.getProduto(codigo), qtd);
											e.subQuantidade(codNF, qtd);
											hv.addItem(codNF, it);

											System.out.println("Item adicionado na nota fiscal!\n");
										} else {
											System.out.println("N�o possui essa quantidade estocada deste item!");
										}
									}
								} while (qtd <= 0);
							}
						}
						System.out.println("Deseja adicionar um novo produto? [0 = n�o | 1 = sim]");
						op = in.nextInt();
					}
				} while (op != 0);
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	/*
	 * M�todo da main que remove itens da Nota Fiscal de um Array de Notas Fiscais.
	 * Est�o sendo utilizadas valida��es de entrada do usu�rio.
	 * */
	public void removeItemNF() {
		Scanner in = new Scanner(System.in);
		int codigo, codNF;

		try {
			System.out.println("\nInforme o C�DIGO da NOTA FISCAL onde ser� removido o item: ");
			codNF = in.nextInt();
			if (hv.getNotaFiscal(codNF) == null) {
				System.out.println("Esta NF n�o est� registrada!");
			} else {
				System.out.println(hv.getNotaFiscal(codNF).toString());

				System.out.println("Informe o c�digo do produto que deseja remover: ");
				codigo = in.nextInt();
				e.addQuantidade(codigo, hv.getNotaFiscal(codNF).getItem(codigo).getQuantidade());
				hv.removeItem(codNF, hv.getNotaFiscal(codNF).getItem(codigo));
			}
		} catch (Exception x) {
			System.out.println("FatalError " + x);
		}
	}

	public static void main(String args[]) {
		StockManager sm = new StockManager();
		sm.Menu();
	}
}