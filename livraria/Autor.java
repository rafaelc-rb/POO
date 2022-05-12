package src;

public class Autor {
	private int codigo;
    private String nome;
    
    public Autor(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public String toString(){
        return "Codigo = " + codigo + " Nome= " + nome;
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
}
