
package Anki;

public final class Pessoa {
    
     
    
    protected String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

   
    public static final String BLOG_URL="asdas";
    
   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

     
    public String getEndereco() {
        return endereco;
    }

     
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void verificarVisibilidade(){
        nome="Aroz";
        System.out.println(nome);
    } 
}
