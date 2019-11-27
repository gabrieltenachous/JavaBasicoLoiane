package JavaAula43Exercicio;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public boolean novoSaldo(double taxaRendimento) {
        Calendar c = Calendar.getInstance();
        if (getDiaRendimento() == c.get(Calendar.DAY_OF_MONTH)) {
            super.saldo = super.saldo * diaRendimento;
            return true;
        } else {

            return false;
        }

    }

    @Override
    public String toString() {
        String s = getDiaRendimento() + "\n";
        s += novoSaldo(12) + "\n";
        return s;
    }

    /**
     * @return the diaRendimento
     */
    public int getDiaRendimento() {
        return diaRendimento;
    }

    /**
     * @param diaRendimento the diaRendimento to set
     */
    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

}
