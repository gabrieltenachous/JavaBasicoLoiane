package JavaAula43Exercici2x01;

public class RendaFederal {

    public static void main(String[] args) {
        Fisica fisica1 = new Fisica();
        fisica1.setNome("Jonas");
        fisica1.setRendaBruta(1000);
        fisica1.setCpf("743.651.080-00");
        
        Fisica fisica2 = new Fisica();
        fisica2.setNome("Nels");
        fisica2.setRendaBruta(2000);
        fisica2.setCpf("390.412.940-66");
        
        Fisica fisica3 = new Fisica();
        fisica3.setNome("Robs");
        fisica3.setRendaBruta(321321);
        fisica3.setCpf("108.980.150-57");
        
        Juridica juridica1 = new Juridica();
        juridica1.setNome("Lucas");
        juridica1.setCnpj("249.695.650-90");
        juridica1.setRendaBruta(123);
        
        Juridica juridica2 = new Juridica();
        juridica2.setNome("Fazas");
        juridica2.setCnpj("864.802.720-99");
        juridica2.setRendaBruta(123);
        
        Juridica juridica3 = new Juridica();
        juridica3.setNome("Keulen");
        juridica3.setCnpj("249.695.650-90");
        juridica3.setRendaBruta(123);
        
        Contribuintes[] c = new Contribuintes[6];
        c[0]=fisica1;
        c[1]=fisica2;
        c[2]=fisica3;
        c[3]=juridica1;
        c[4]=juridica2;
        c[5]=juridica3;
        
        for(Contribuintes cont:c){
            System.out.println(cont);
        }
    }

}
