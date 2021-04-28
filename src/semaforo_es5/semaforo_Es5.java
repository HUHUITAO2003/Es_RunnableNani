/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo_es5;

import static java.lang.Thread.sleep;
import java.util.concurrent.*;

/**
 *
 * @author juliet
 */
public class semaforo_Es5 {
    static boolean t=true;
    public static void main(String args[]) throws InterruptedException{
        BlockingQueue<Integer> link = new LinkedBlockingQueue<Integer>();
        //produttore e cons con le stesse istanze dei due semafori
        Thread t1= new Thread(new Produttore("Produttore1",link));
        Thread t2= new Thread(new Produttore("Produttore2",link));
        Thread t3= new Thread(new Consumatore("Consumatore1",link));
        Thread t4= new Thread(new Consumatore("Consumatore2",link));
        Thread t5= new Thread(new Consumatore("Consumatore3",link));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        sleep(500);
        t=false;
        t1.join();
        t2.join();
        t3.stop();
        t4.stop();
        t5.stop();
        
        
    }
}
