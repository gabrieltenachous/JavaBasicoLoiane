
package JavaAula43Ex03;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero() {
        super();
        
        this.setAmbiente("Terra");
    }
    
    
    /**
     * @return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s="";
        s+=super.toString();
        s+="\nalimento: "+alimento;
        return s;
    }
    
}
