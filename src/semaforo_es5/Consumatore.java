/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo_es5;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliet
 */
public class Consumatore implements Runnable{
    int i;
    String nome;
    LinkedBlockingQueue<Integer> link;
    
    public Consumatore(String nome, LinkedBlockingQueue<Integer> link) {
        this.nome = nome;
        this.link=link;
    }
    
    @Override
    public void run() {
        for(int j=0;j<10;j++) {
            try {
                Object i=link.take();
                System.out.println("Lettore: "+nome+" dato letto :" + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }
}
