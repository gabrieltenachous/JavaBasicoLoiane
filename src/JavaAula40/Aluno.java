
package JavaAula40;

public class Aluno extends Pessoa{
    
    private String curso;
    private double[] notas;
    public void verificarAcesso(){
        //por que é protected 
        super.nome = "maria";
        //por que é default
        super.nomeVisibilidade = "DKLASDJKLAS";
    }

    public Aluno() {
    }

    

    @Override
    public String obterEndereco(){
        String s = "Endereco do aluno";
        return s+= super.endereco;
    }
      
    
}
