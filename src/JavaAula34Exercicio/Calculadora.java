
package JavaAula34Exercicio;

public class Calculadora {
    
    static private double num1;
    static private double num2;
    
    public static double somar(double num1 , double num2){
        return num1+num2;
    }
    
    public static double subtrair(double num1 , double num2){
        return num1-num2;
    }
    
    public static double dividir(double num1 , double num2){
        return num1/num2;
    }
    
    public static double multiplicar(double num1 , double num2){
        return num1*num2;
    }
    
    public static double potencia(double num1,double num2){
        return Math.pow(num2, num2);
    }
    
}
