
package JavaAula46Ex;

public class Quadrado extends Figura2D{
    private double l;

    public Quadrado(double l, String cor) {
        super(cor);
        this.l = l;
    }

     
    public double getLado() {
        return l;
    }

    
    public void setLado(double l) {
        this.l = l;
    }

    @Override
    public double area() {
        return l*l;
    }

    @Override
    public String toString() { 
        return super.toString()+"Lado:"+l;  
    }
    
    
}
