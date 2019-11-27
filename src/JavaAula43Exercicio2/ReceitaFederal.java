package JavaAula43Exercicio2;

public class ReceitaFederal {

    private String nome;
    private double imposto;

    @Override
    public String toString() {

        String s = "Receita Federal(Contribuinte)[";
        s += super.toString() + "]";
        s += "nome: " + nome;
        s += "; imposto: " + imposto;
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

    /**
     * @return the imposto
     */
    public double getImposto() {
        return imposto;
    }

    /**
     * @param imposto the imposto to set
     */
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

}
