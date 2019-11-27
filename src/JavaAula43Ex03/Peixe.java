
package JavaAula43Ex03;

public final class Peixe extends Animal{
    private String caracteristica;

    public Peixe() {
        super();
        this.setNumeroPata(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.setCaracteristica("barbatana e cauda");
        
    }

    
    
    @Override
    public String toString() {
        String s="\n";
        s+="\n"+super.toString();
        
        s+="\n"+caracteristica;
        return s;
    }

    /**
     * @return the caracteristica
     */
    public String getCaracteristica() {
        return caracteristica;
    }

    /**
     * @param caracteristica the caracteristica to set
     */
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    
}
