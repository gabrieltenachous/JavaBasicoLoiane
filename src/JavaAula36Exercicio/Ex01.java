package JavaAula36Exercicio;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Agenda agenda = new Agenda();
        System.out.println("Nome da agenda");
        agenda.setNome(scanf.nextLine());

        //lista de 3 contato
        Contato[] result = new Contato[3];
        for (int i = 0; i < 3; i++) {
            Contato contato = new Contato();
            System.out.println(agenda.getNome() + ": " + (i + 1));
            System.out.println("email");
            contato.setEmail(scanf.nextLine());
            System.out.println("nome");
            contato.setNome(scanf.nextLine());
            System.out.println("telefone");
            contato.setTelefone(scanf.nextLine());
            result[i] = contato;
        }
        agenda.setContato(result);
        agenda.obterResultado();
    }

}
