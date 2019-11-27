
package JavaAula46Ex;

public class Circulo extends Figura2D{
    private double r;

    public Circulo(double r, String cor) {
        super(cor);
        this.r = r;
    }
    
    @Override
    public double area() {
        return 3*getR()*getR();
    }

    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() { 
        return super.toString()+"Raio:"+r;
    }
   
}
