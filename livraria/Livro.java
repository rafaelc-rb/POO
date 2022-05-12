package src;

import java.util.ArrayList;

public class Livro {
	private int codigo;
    private String titulo;
    private int ano;
	private ArrayList<Autor> autores;
    private Editora editora;
    
    public Livro(int codigo, String titulo, int ano, ArrayList<Autor> autores, Editora editora){
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
        this.editora = editora;
    }
    
    public Livro(int codigo, String titulo){
        this.codigo = codigo;
        this.titulo = titulo;
    }
    
    public String toString(){
        String status = "";
        status = "Titulo: " + titulo + "Ano: " + ano ;
                for(Autor a: autores){
                    status += " Autor: " + a.toString();
                }
                status += " Editora: " + editora.getNome();
        return status;
                
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the autores
     */
    public ArrayList<Autor> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    /**
     * @return the editora
     */
    public Editora getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
