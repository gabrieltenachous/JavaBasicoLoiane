package JavaAula43Exercicio2;

public class PessoaJuridico extends ReceitaFederal {

    private double rendaEmpresa;

    @Override
    public String toString() {
        String s = "Pessoa Juridica[";
        s += "; " + super.toString();
        s += " Renda da Empresa: " + rendaEmpresa;
        s += "; Imposto Juridico" + impostoJuridico();

        System.out.println("");
        return s;
    }

    public double impostoJuridico() {
        return rendaEmpresa * 0.10;
    }

    /**
     * @return the rendaEmpresa
     */
    public double getRendaEmpresa() {
        return rendaEmpresa;
    }

    /**
     * @param rendaEmpresa the rendaEmpresa to set
     */
    public void setRendaEmpresa(double rendaEmpresa) {
        this.rendaEmpresa = rendaEmpresa;
    }

}
