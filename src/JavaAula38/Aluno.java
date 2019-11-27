package JavaAula38;

public class Aluno extends Pessoa {

    private String cursos;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String cursos, double[] notas, String nome, String endereco, String cpf, String telefone) {
        super(nome, endereco, cpf, telefone);
        this.cursos = cursos;
        this.notas = notas;
        
    }

   

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    /**
     * @return the cursos
     */
    public String getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public double calcularMedia() {
        return 0;
    }

    public double verificarAprovado() {
        return 0;
    }

    public void valorVS() {
        super.setCpf("dasd");
        this.setCpf("dasda");
        
    }
}
