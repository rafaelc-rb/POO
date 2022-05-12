package src;

import java.util.ArrayList;
import java.util.Scanner;

public class LivrariaUI {
	private Livraria liv;

	public LivrariaUI() {
		liv = new Livraria();
	}

	public void menu() {
		Scanner in = new Scanner(System.in);
		int op;

		do {
			System.out.println("Livraria\n");
			System.out.println("1. Cadastrar editora");
			System.out.println("2. Consultar editora");
			System.out.println("3. Remover editora");
			System.out.println("4. Cadastrar autor");
			System.out.println("5. Consultar autor");
			System.out.println("6. Remover autor");
			System.out.println("7. Cadastrar livro");
			System.out.println("8. Consultar livro");
			System.out.println("9. Remover livro");
			System.out.println("0. Sair");
			System.out.println("Escolha uma opção: ");
			op = in.nextInt();
			in.nextLine();

			switch (op) {

			case 1:
				cadastrarEditora();
				break;
			case 2:
				consultaEditora();
				break;
			case 3:
				removerEditora();
				break;
			case 4:
				cadastrarAutor();
				break;
			case 5:
				consultaAutor();
				break;
			case 6:
				removerAutor();
				break;
			case 7:
				cadastrarLivro();
				break;
			case 8:
				consultarLivro();
				break;
			case 9:
				removerLivro();
				break;
			case 0:
				break;

			default:
				System.out.println("Opção inválida!");
				break;

			}

		} while (op != 0);
	}

	public void cadastrarLivro() {
		Scanner in = new Scanner(System.in);
		int cod, ano, codigoedit, codigoauto, num;
		String titulo;
		Editora editoraed;
		Autor autora;
		ArrayList<Autor> autores = new ArrayList<>();
		if (liv.existeEditora() && liv.existeAutor()) {
			System.out.println("Informe o código: ");
			cod = in.nextInt();
			in.nextLine();
			System.out.println("Informe o título");
			titulo = in.nextLine();
			System.out.println("Informe o ano");
			ano = in.nextInt();
			in.nextLine();
			do {
				System.out.println("Essas são as editoras disponíveis:");
				System.out.println(liv.toStringEditoras());
				System.out.println("Informe o codigo da editora:");
				codigoedit = in.nextInt();
				in.nextLine();
				editoraed = liv.getEditora(codigoedit);
				if (editoraed == null) {
					System.out.println("Código da editora inválido");
				}
			} while (editoraed == null);
			do {
				do {
					System.out.println("Esse são os autores disponiveis");
					System.out.println(liv.toStringAutores());
					System.out.println("Informe o código do autor");
					codigoauto = in.nextInt();
					in.nextLine();
					autora = liv.getAutor(codigoauto);
					if (autora == null) {
						System.out.println("Código do autor inválido");
					}
				} while (autora == null);
				autores.add(autora);
				System.out.println("Você deseja informar outro autor 1 = sim / 2 = não?");
				num = in.nextInt();
				in.nextLine();
			} while (num == 1);
			liv.cadastroLivro(cod, titulo, ano, autores, editoraed);

		} else {
			System.out.println("Cadastre primeiro um autor e uma editora");
		}
	}

	public void consultarLivro() {
		Scanner in = new Scanner(System.in);
		int cod;
		System.out.println("Consultar livro");
		System.out.println("Informe o código do Livro:");
		cod = in.nextInt();
		in.nextLine();
		System.out.println(liv.consultaLivro(cod));
	}

	public void removerLivro() {
		int cod;
		Scanner in = new Scanner(System.in);
		System.out.println("Remover livro");
		System.out.println("Informe o código do Livro:");
		cod = in.nextInt();
		in.nextLine();
		liv.removerLivro(cod);
	}

	public void cadastrarEditora() {
		Scanner in = new Scanner(System.in);
		int cod;
		String nome;
		System.out.println("Cadastro da Editora");
		System.out.println("Informe o código: ");
		cod = in.nextInt();
		in.nextLine();
		System.out.println("Informe o nome da Editora:");
		nome = in.nextLine();
		liv.cadastroEditora(cod, nome);
	}

	public void consultaEditora() {
		Scanner in = new Scanner(System.in);
		int cod;
		System.out.println("Consulta da Editora");
		System.out.println("Informe o código da Editora:");
		cod = in.nextInt();
		in.nextLine();
		System.out.println(liv.consultaEditora(cod));
	}

	public void removerEditora() {
		int cod;
		Scanner in = new Scanner(System.in);
		System.out.println("Remover editora");
		System.out.println("Informe o código da Editora:");
		cod = in.nextInt();
		in.nextLine();
		liv.removerEditora(cod);
	}

	public void cadastrarAutor() {
		Scanner in = new Scanner(System.in);
		int cod;
		String nome;
		System.out.println("Cadastro do Autor");
		System.out.println("Informe o código: ");
		cod = in.nextInt();
		in.nextLine();
		System.out.println("Informe o nome do Autor:");
		nome = in.nextLine();
		liv.cadastroAutor(cod, nome);
	}

	public void consultaAutor() {
		Scanner in = new Scanner(System.in);
		int cod;
		System.out.println("Consulta do Autor");
		System.out.println("Informe o código do Autor:");
		cod = in.nextInt();
		in.nextLine();
		System.out.println(liv.consultaAutor(cod));
	}

	public void removerAutor() {
		int cod;
		Scanner in = new Scanner(System.in);
		System.out.println("Remover autor");
		System.out.println("Informe o código do Autor:");
		cod = in.nextInt();
		in.nextLine();
		liv.removeAutor(cod);
	}

	public static void main(String args[]) {
		LivrariaUI liui = new LivrariaUI();
		liui.menu();
	}

}
