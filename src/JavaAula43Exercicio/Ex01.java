package JavaAula43Exercicio;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {
//o saldo nao pode ser negativo

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();
        ContaBancaria poupanca = new ContaPoupanca();
        ContaBancaria especial = new ContaEspecial();
        conta.setNomeClasse("15161221");
        conta.setNumConta(151212);
       

        conta.setSaldo(1500);
       
        System.out.println("poupanca");
        
        System.out.println(conta);
        System.out.println("Depositar:");
        conta.depositar(scanf.nextDouble());

        saque(conta, 500);
        System.out.println(conta.getSaldo());

        saque(conta, 16000);
        System.out.println(conta.getSaldo());
        
        
        System.out.println(especial);
        System.out.println("amopstrar conta Especial");
        saque(conta, 152);
        saque(conta, 1521146514);

    }
    
    public static void saque(ContaEspecial especial, double sacar) {
        if (especial.sacar(sacar)) {
            System.out.println("saque com sucesso");
        } else {
            System.out.println("não é possivel saquar");
        }
    } 
    
    public static void saque(ContaBancaria conta, double sacar) {
        if (conta.sacar(sacar)) {
            System.out.println("saque com sucesso");
        } else {
            System.out.println("não é possivel saquar");
        }
    }

}
