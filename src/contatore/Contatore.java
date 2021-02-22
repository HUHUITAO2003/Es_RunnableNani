/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatore;

/**
 *
 * @author informatica
 */
public class Contatore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer c=5;
        Runnable r1=new Decremento(c);
        Runnable r2=new Incremento(c);
        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);
        t1.start();
        t2.start();
    }
    
}
