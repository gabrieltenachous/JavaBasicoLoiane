package JavaAula34Exercicio;

public class Ex03 {
    
    public static void main(String[] args) {
        imprimirTela(Fatorial.potencia(2,6));
        imprimirTela(Fatorial.dividir(2,6));
        imprimirTela(Fatorial.subtrair(2,6));
        imprimirTela(Fatorial.somar(2,6));
        imprimirTela(Fatorial.patorial(0));
        
    }
    
    static void imprimirTela(double num) {
        System.out.println(num);
    }
    
}
