
package JavaAula44;

public class Cachorro extends Mamifero implements AnimalDomestico,AnimalEstimacao{
    private String tamanho;
    private String raca;

    @Override
    public String amamentar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    public String getTamanho() {
        return tamanho;
    } 
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    } 
    public String getRaca() {
        return raca;
    } 
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void levarVeterinario() {
    }

    @Override
    public void chamarVeterinario() {
    }

    @Override
    public void brincar() {
    }

    @Override
    public void levarPassear() {
    }
    
}
