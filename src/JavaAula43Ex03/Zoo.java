package JavaAula43Ex03;
public class Zoo {

    public static void main(String[] args) {
        Animal a = new Animal();
        
        Animal camelo = new Mamifero();
        camelo.setNome("camelo");
        camelo.setComprimento(150);
        camelo.setNumeroPata(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);
        System.out.println(camelo);
        
        Animal tuba = new Peixe();
        
        System.out.println(tuba);
    }

}
