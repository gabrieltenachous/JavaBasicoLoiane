
package JavaAula25e26;

public class Carro {
    String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
        
        void exibirAutonomia(){
            System.out.println(capCombustivel*consumoCombustivel);
        }
        
        double autonomiaComParametro(){
            return capCombustivel*consumoCombustivel;
        }
}
