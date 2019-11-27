package JavaAula43Exercicio;

public class ContaEspecial extends ContaBancaria {

    private double limite = 20;

    @Override
    public boolean sacar(double valor) {
        if (valor < this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            if (limite > this.saldo + valor) {
                this.saldo -= limite;
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        String s = " ";
        s += "limite: " + getLimite() + "\n";
        
        return s;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

}
