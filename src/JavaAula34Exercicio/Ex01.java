package JavaAula34Exercicio;

public class Ex01 {

    static void exibirValor() {
        System.out.println(Contador.contador);
    }

    public static void main(String[] args) {
        //contador com new
        exibirValor();
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        exibirValor();
        //contador com
        Contador.zerar();
        exibirValor();
        Contador.decrementar();
        exibirValor();
    }

}
