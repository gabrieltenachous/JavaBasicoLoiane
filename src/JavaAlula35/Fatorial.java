package JavaAlula35;

public class Fatorial {

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);
    }

}
// um metodo fatorial (num) é a mesma coisa q 
// fatorial(num)  ==  for(int i=0;i<num;i++)
