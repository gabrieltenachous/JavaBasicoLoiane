package JavaAula34Exercicio;

public class Contador {

    static int contador;

    public Contador() {
        contador++;
    }

    public static void zerar() {
        contador = 0;
    }

    public static void decrementar() {
        contador = contador -1;
    }
}
