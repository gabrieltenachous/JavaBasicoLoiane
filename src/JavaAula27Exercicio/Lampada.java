package JavaAula27Exercicio;


public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean ligado;
    
    void ligado(){
        ligado=true;
    }
    
    void desligado(){
        ligado=false;
    }
    
    void mostrarEstado(){
        if(ligado){
            System.out.println("Lampada Ligada");
        }else{
            System.out.println("Lampada Desligada");
        }
    }
    
    void mudarEstado(){
        if(ligado){
            desligado();
        }else{
            ligado();
        }
    }
    
}
