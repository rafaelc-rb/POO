package src;

import java.util.ArrayList;

public class Livraria {
	// composição
	ArrayList<Autor> autores = new ArrayList<>();
	ArrayList<Livro> livros = new ArrayList<>();
	ArrayList<Editora> editoras = new ArrayList<>();

	public void cadastroLivro(int codigo, String titulo, int ano, ArrayList<Autor> autores, Editora editora) {
		livros.add(new Livro(codigo, titulo, ano, autores, editora));
	}

	public void cadastroAutor(int codigo, String nome) {
		autores.add(new Autor(codigo, nome));
	}

	public void cadastroEditora(int codigo, String nome) {
		editoras.add(new Editora(codigo, nome));
	}

	public String consultaLivro(int codigo) {
		for (Livro l : livros) {
			if (l.getCodigo() == codigo) {
				return l.toString();
			}
		}
		return "código não encontrado";
	}

	public String consultaAutor(int codigo) {
		for (Autor au : autores) {
			if (au.getCodigo() == codigo) {
				return au.toString();
			}
		}
		return "código não encontrado";
	}

	public Autor getAutor(int codigo) {
		for (Autor au : autores) {
			if (au.getCodigo() == codigo) {
				return au;
			}
		}
		return null;
	}

	public String consultaEditora(int codigo) {
		for (Editora ed : editoras) {
			if (ed.getCodigo() == codigo) {
				return ed.toString();
			}
		}
		return "código não encontrado";
	}

	public Editora getEditora(int codigo) {
		for (Editora ed : editoras) {
			if (ed.getCodigo() == codigo) {
				return ed;
			}
		}
		return null;
	}

	public boolean existeEditora() {
		return (!editoras.isEmpty());
	}

	public boolean existeAutor() {
		return (!autores.isEmpty());
	}

	public void removerLivro(int codigo) {
		for (Livro liv : livros) {
			if (liv.getCodigo() == codigo) {
				livros.remove(liv);
			}
		}
	}

	public void removeAutor(int codigo) {
		Autor auto = null;
		for (Autor aut : autores) {
			if (aut.getCodigo() == codigo) {
				auto = aut;
			}
		}
		if (auto != null) {
			autores.remove(auto);
		}
	}

	public void removerEditora(int codigo) {
		Editora rev = null;
		for (Editora ed : editoras) {
			if (ed.getCodigo() == codigo) {
				rev = ed;
			}
		}
		if (rev != null) {
			editoras.remove(rev);
		}
	}

	public String toStringEditoras() {
		String edit = "";
		for (Editora ed : editoras) {
			edit += ed.toString() + "\n";
		}
		return edit;
	}

	public String toStringAutores() {
		String autoedit = "";
		for (Autor a : autores) {
			autoedit += a.toString() + "\n";
		}
		return autoedit;
	}
}
