package JavaAula43Ex03;

  public class Animal {

    private String nome;
    private double comprimento;
    private int numeroPata;
    private String cor;
    private double velocidade;
    private String ambiente;

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
     * @return the comprimento
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the numeroPata
     */
    public int getNumeroPata() {
        return numeroPata;
    }

    /**
     * @param numeroPata the numeroPata to set
     */
    public void setNumeroPata(int numeroPata) {
        this.numeroPata = numeroPata;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the velocidade
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the ambiente
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        String s="Animal";
        s+="\nNome: "+nome;
        s+="\nComprimento: "+comprimento+"cm";
        s+="\nPatas: "+numeroPata;
        s+="\ncor: "+ cor;
        s+="\nambiente: "+ambiente;
        s+="\nvelocidade: "+velocidade+"m/s";
        return s;
    }

}
