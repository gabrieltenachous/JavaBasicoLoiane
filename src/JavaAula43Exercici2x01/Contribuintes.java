package JavaAula43Exercici2x01;

 public abstract class Contribuintes {

    protected String nome;
    private double rendaBruta;

    @Override
    public String toString() {
        String s="Contribuinte[";
        s+="Nome: "+nome;
        s+="RendaBruta: "+getRendaBruta();
        System.out.println("");
        return s;
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

    abstract public double impostoPago();

    /**
     * @return the rendaBruta
     */
    public double getRendaBruta() {
        return rendaBruta;
    }

    /**
     * @param rendaBruta the rendaBruta to set
     */
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

}
