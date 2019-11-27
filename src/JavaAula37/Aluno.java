package JavaAula37;


public class Aluno extends Pessoa{

    private String cursos;
    private double[] notas;

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public double calcularMedia(){
        return 0;
    }
    
    public double verificarAprovado(){
        return 0;
    }
    

}
