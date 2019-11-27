package JavaAula36;

public class Ex01 {

    public static void main(String[] args) {
        Contato contato = new Contato();

        //criar obejeto endereco
        Endereco end = new Endereco();
        end.setCep("156216");

        contato.setEndereco(end);
        System.out.println(contato.getEndereco().getCep());

        Telefone send2 = new Telefone();
        send2.setDdd("13");
        send2.setNumero("65156");

        Telefone send1 = new Telefone();
        send1.setDdd("14");
        send1.setNumero("65156");

        Telefone[] telefones = new Telefone[1];

        for (Telefone t : contato.getTelefones()) {
            System.out.println(t.getDdd()+"! "+t.getNumero());
        }
    }

}
