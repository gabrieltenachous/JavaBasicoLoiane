    package JavaAula27Exercicio;

import java.util.Scanner;

public class TesteEx05 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.agencia = "1235";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 100;
        contaCorrente.numero = "d45d49";
        contaCorrente.saldo = 200;
        //100+200

        boolean conta = contaCorrente.realizarSaque(123132);

        if (conta) {
            System.out.println("Pode realizar saldo");
            contaCorrente.consultarSaldo();
        } else {
            System.out.println("nao é possivel");
        }
        
        contaCorrente.depositarDinheiro(200);
        contaCorrente.consultarSaldo();
        
        

    }

}
