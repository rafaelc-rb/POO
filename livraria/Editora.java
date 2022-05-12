package src;

public class Editora {
	private int codigo;
    private String nome;
    //private ArrayList<Livro> livros;
    
    public Editora(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        //this.livros = new ArrayList<>();
        
    }
    public String toString(){
        return "Codigo =" + codigo + " Nome= " + nome;
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the livros
     */
    /*public ArrayList<Livro> getLivros() {
        return livros;
    }*/

    /**
     * @param livros the livros to set
     */
    /*public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }*/
}
