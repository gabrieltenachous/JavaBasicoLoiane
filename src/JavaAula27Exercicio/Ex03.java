package JavaAula27Exercicio;

import java.util.Scanner;

public class Ex03 {
    /* String nome;
     String matricula;
     String curso;
     String[] diciplina = new String[3];
     double[] nota = new double[3];
     */

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Seu nome:");
        aluno.nome = scanf.next();
        System.out.println("Matricula:");
        aluno.matricula = scanf.next();
        System.out.println("Seu curso:");
        aluno.nome = scanf.next();

        for (int i = 0; i < aluno.diciplina.length; i++) {
            System.out.println("digite as diciplinas");
            aluno.diciplina[i] = scanf.next();
        }
        for (int i = 0; i < aluno.nota.length; i++) {
            System.out.println("diciplina[" + aluno.diciplina[i] + "]");
            for (int j = 0; j < i; j++) {
                aluno.nota[i][j] = scanf.nextDouble();
            }
        }

    }

}
