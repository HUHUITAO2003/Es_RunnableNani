/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settenani;

/**
 *
 * @author juliet
 */
public class SetteNani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable r1=new Run("Brontolo");
        Runnable r2=new Run("Cucciolo");
        Runnable r3=new Run("Dotto");
        Runnable r4=new Run("Eolo");
        Runnable r5=new Run("Gongolo");
        Runnable r6=new Run("Mammolo");
        Runnable r7=new Run("Pisolo");
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);
        Thread t4=new Thread(r4);
        Thread t5=new Thread(r5);
        Thread t6=new Thread(r6);
        Thread t7=new Thread(r7);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
    
}
