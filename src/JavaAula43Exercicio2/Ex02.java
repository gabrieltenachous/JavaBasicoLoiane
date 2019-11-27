package JavaAula43Exercicio2;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        ReceitaFederal p1 = new PessoaFisica();
        p1.setNome("carlos");
        p1.setImposto(500);
        
        ReceitaFederal p2 = new PessoaJuridico();
        p2.setNome("jonas");
        p2.setImposto(46456);
        
        ReceitaFederal p3 = new PessoaFisica();
        p3.setNome("carlos");
        p3.setImposto(500);
        
        ReceitaFederal p4 = new PessoaJuridico();
        p4.setNome("gabriel");
        p4.setImposto(464261);
        
        ReceitaFederal p5 = new PessoaFisica();
        p5.setNome("felipe");
        p5.setImposto(233);
        
        ReceitaFederal p6 = new PessoaJuridico();
        p6.setNome("karthis");
        p6.setImposto(3564);
        ReceitaFederal[] federal = new ReceitaFederal[6];
        federal[0]=p1;
        federal[1]=p2;
        federal[2]=p3;
        federal[3]=p4;
        federal[4]=p5;
        federal[5]=p6;
        for(ReceitaFederal c:federal){
            System.out.println(c.toString());
        }
        
        
    }

}
