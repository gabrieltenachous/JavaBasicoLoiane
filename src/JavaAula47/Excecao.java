/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAula47;

/**
 *
 * @author gabri
 */
public class Excecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        int val[] = new int[6];
        val[6]=2;   
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("deu bosta");
        }
        
        
    }
    
}
