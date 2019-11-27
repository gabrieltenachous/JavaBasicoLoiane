package JavaAula36Exercicio;

public class Agenda {

    private Contato[] contato;
    private String nome;

    public Agenda() {
        nome = "Agenda de janeiro";

    }

    public Agenda(Contato[] contato, String nome) {
        this.contato = contato;
        this.nome = nome;
    }

    /**
     * @return the contato
     */
    public Contato[] getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(Contato[] contato) {
        this.contato = contato;
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
    
    void obterResultado(){
        for (int i = 0; i < 3; i++) {
            System.out.println(nome+(i+1));
            System.out.println(getContato()[i].getEmail());
            System.out.println(getContato()[i].getNome());
            System.out.println(getContato()[i].getTelefone());
            System.out.println("");
        }
    }
    
}
