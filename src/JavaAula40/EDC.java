package JavaAula40;
public class EDC {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        pessoa.setEndereco("rua 1, num 1");
        aluno.setEndereco("rua 2, num 2");
        professor.setEndereco("rua 3, num 3");
        
        System.out.println(aluno.obterEndereco());
        System.out.println(professor.obterEndereco());
    }

}
