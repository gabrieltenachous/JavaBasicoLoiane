package JavaAula43Exercicio2;

public class PessoaFisica extends ReceitaFederal {

    private double rendaBruta;

    @Override
    public String toString() {
        String s = "Pessoa Fisica[";
        s += super.toString();
        s += ";Renda Bruta: " + rendaBruta;
        s+= ";Imposto: " +  rendarBrut();
        System.out.println("");
        return s;
    }

    public double rendarBrut() {
        if (rendaBruta < 1400) {
            return 0;
        } else if (rendaBruta >= 1400.01 && rendaBruta <= 2100) {
            return 0.10 * 100 + rendaBruta;
        } else if (rendaBruta >= 2100.01 && rendaBruta <= 2800) {
            return 0.15 * 270 + rendaBruta;
        } else if (rendaBruta >= 2800.01 && rendaBruta <= 3600) {
            return 0.25 * 500 + rendaBruta;
        } else {
            return 0.30 * 700 + rendaBruta;
        }

    }
}
