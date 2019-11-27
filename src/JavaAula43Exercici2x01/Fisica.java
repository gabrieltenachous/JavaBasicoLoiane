package JavaAula43Exercici2x01;

public class Fisica extends Contribuintes {

    private String cpf;

    @Override
    public String toString() {
        String s = "Pessoa Fisica";
        s += super.toString();
        s += "CPF:" + cpf;
        s += "Imposto Fisico:" + impostoPago();
        System.out.println("");
        return s;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double impostoPago() {
        if (getRendaBruta() <= 1400) {
            return getRendaBruta();
        } else if (getRendaBruta() >= 1400.01 && getRendaBruta() <= 2100) {
            return 0.1 * 100 + getRendaBruta();
        } else if (getRendaBruta() >= 2100.01 && getRendaBruta() <= 2800) {
            return 0.15 * 270 + getRendaBruta();
        } else if (getRendaBruta() >= 2800.01 && getRendaBruta() <= 3600) {
            return 0.25 * 500 + getRendaBruta();
        } else {
            return 0.30 * 700 + getRendaBruta();
        }

    }

}
