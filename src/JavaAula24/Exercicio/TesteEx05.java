package JavaAula24.Exercicio;

import java.util.Scanner;

public class TesteEx05 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.agencia = "1235";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 100;
        contaCorrente.numero = "d45d49";
        contaCorrente.saldo = 400;
    }

}
