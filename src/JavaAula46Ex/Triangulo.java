
package JavaAula46Ex;

public class Triangulo extends Figura2D{
    private double l;

    public Triangulo(double l, String cor) {
        super(cor);
        this.l = l;
    }


    @Override
    public double area() {
        return (Math.sqrt(3)*Math.pow(l, 2))/4;
    }

    /**
     * @return the l
     */
    public double getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(double l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return super.toString()+"lado:"+l;
    }
    
    
}
