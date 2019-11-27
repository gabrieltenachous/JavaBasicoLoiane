package JavaAula27Exercicio;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    int limiteEspecial;
    double saldo;
    double limite;

    boolean realizarSaque(double quantiaSaquar) {
        if (saldo <= quantiaSaquar) {
            saldo -= quantiaSaquar;
            return true;
        } else {
            
            if (especial) {
            limite = saldo + limiteEspecial;
                if (limite >= quantiaSaquar) {
                    saldo -= quantiaSaquar;
                    return true;
                } else {
                    return false;
                }
            } else {

                return false;
            }

        }
    }
    
    double depositarDinheiro(double quantiaDepositar){
       return saldo+=quantiaDepositar;
    }
    void consultarSaldo(){
        System.out.println(saldo);
    }
}
