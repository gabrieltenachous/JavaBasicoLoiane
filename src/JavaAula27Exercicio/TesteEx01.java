package JavaAula27Exercicio;

public class TesteEx01 {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.cor = "amarela";
        lampada.tipoLuz = "amarela";
        lampada.garantiaMeses = 36;
        lampada.tipos = new String[5];
        
        lampada.ligado();
        lampada.mostrarEstado();
        
        lampada.desligado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
    }

}
