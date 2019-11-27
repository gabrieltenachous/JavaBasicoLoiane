/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAula36Exercicio;

/**
 *
 * @author loiane
 */
public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Alunos[] alunos;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the alunos
     */
    public Alunos[] getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public String exibirInfo() {
        double[] somar = new double[5];
        String info;

        info = "Nome do curso:  " + getNome() + ";\n";
        info += "Horas: " + horario + ";\n";
        info += "Nome do professor: " + professor.getNome() + ";\n";
        for (int i = 0; i < 5; i++) {
            info += "\n";
            info += alunos[i].getNome() + "\n";
            info += alunos[i].getMatricula() + "\n";
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                info += alunos[i].getNotas()[j] + "\t";
                somar[i] += alunos[i].getNotas()[j];

            }
            info += "\n resultado:" + somar[i] / 4;
            if (somar[i] / 4 >= 7) {
                info += "\n Aprovado";
            } else {
                info += "\n Reprovado";
            }
        }

        return info;
    }
}
