
package JavaAula43Exercici2x01;

public class Juridica extends Contribuintes{
    private String cnpj;

    @Override
    public String toString() {
        String s="Pessoa Juridica";
        s+=super.toString();
        s+="CNPJ"+cnpj;
        s+="Imposto:"+impostoPago();
        System.out.println("");
        return s;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double impostoPago() {
        return getRendaBruta()*0.1;
    }
    
}
