
package JavaAula46Ex;

public abstract class FiguraGeometrica {
    private String cor;

    public FiguraGeometrica() {
        cor="roxa";
    }
 
    public String getCor() {
        return cor;
    }
 
    public void setCor(String cor) {
        this.cor = cor;
    }

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() { 
        return "Cor:"+cor;
    }
    
}
