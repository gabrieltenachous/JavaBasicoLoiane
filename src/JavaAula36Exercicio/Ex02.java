package JavaAula36Exercicio;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Curso curso = new Curso();

        System.out.println("Nome do curso");
        curso.setNome(scanf.nextLine());
        System.out.println("Horario");
        curso.setHorario(scanf.nextLine());

        Professor professor = new Professor();
        System.out.println("Nome do professor");
        professor.setNome(scanf.nextLine());
        System.out.println("Departamento");
        professor.setDepartamento(scanf.nextLine());
        System.out.println("Email");
        professor.setEmail(scanf.nextLine());

        Alunos[] alunos = new Alunos[5];
        //alunos[0].setMatricula("das");
        for (int i = 0; i < alunos.length; i++) {

            Alunos aluno = new Alunos();
            System.out.println("Matricula");
            aluno.setMatricula(scanf.next());

            System.out.println("Nome do aluno");
            aluno.setNome(scanf.next());

            double[] notas = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("nota" + (j + 1));
                notas[j] = scanf.nextDouble();

            }
            aluno.setNotas(notas);
            alunos[i] = aluno;
            curso.setAlunos(alunos);
        }

        curso.setProfessor(professor);

        String resultado = curso.exibirInfo();
        System.out.println(resultado);
    }

}
