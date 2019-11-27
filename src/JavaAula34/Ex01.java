package JavaAula34;

public class Ex01 {

    static int resultSoma;

    public static void main(String[] args) {
       // MinhaCalculadora calc = new MinhaCalculadora();
       //calc.soma(1, 0);
        resultSoma = MinhaCalculadora.soma(1,2);
        MinhaCalculadora.soma(1, 2);
        soma2Valorews(24, 13);
    }

    static int soma2Valorews(int num1, int num2) {
        return MinhaCalculadora.soma(num1, num2);
    }
}
