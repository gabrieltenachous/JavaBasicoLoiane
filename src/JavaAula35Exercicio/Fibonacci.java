
package JavaAula35Exercicio;

public class Fibonacci {
    
    public static int fiboNrecursivo(int num){
       int aux=0,n1=1;
       for(int i=0;i<num+1;i++){
           aux=n1+aux;
           n1=aux-n1;
       }
        return n1;
    }
    
    public static int fiboRecursivo(int num){
        if(num<2){
            return 1;
        }
        return fiboRecursivo(num-1)+fiboRecursivo(num-2);
    }
}
