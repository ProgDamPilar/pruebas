/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author dam
 */
public class Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c = new Calculadora(4,2);
        System.out.println(c.suma());
        System.out.println(c.resta());
    }
    
    
}
