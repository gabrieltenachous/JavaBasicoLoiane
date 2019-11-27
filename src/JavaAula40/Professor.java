package JavaAula40;


public class Professor extends Pessoa {

    private String departamento;
    private String nomeCurso;
    private double salario;

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void verefcarAcesso(){
        this.nomeVisibilidade="sdasd";
        super.nome="KKK";
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
    @Override
    public String obterEndereco(){
        String s = "Endereco do professor";
        return s+=endereco;
    }
}
