package JavaAula43Exercicio;

public class ContaBancaria {

    protected String nomeClasse;
    protected int numConta;
    protected double saldo;

    /**
     * @return the nomeClasse
     */
    public String getNomeClasse() {
        return nomeClasse;
    }

    /**
     * @param nomeClasse the nomeClasse to set
     */
    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    /**
     * @return the numConta
     */
    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public boolean sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            return true;
        } else {

            return false;
        }

    }

    @Override
    public String toString() {
        String s = " ";
        s += "Saldo:" + "\n";
        s += "numer da conta: " + numConta + "\n";
        s += "numero da classe: " + getNomeClasse() + "\n";
        return s;
    }

    public double depositar(double valor) {
        return saldo += valor;
    }

    /**
     * @return the numConta
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

}
