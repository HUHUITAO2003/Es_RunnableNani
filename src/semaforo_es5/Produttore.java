/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo_es5;

import static java.lang.Thread.currentThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author juliet
 */
public class Produttore implements Runnable {

    int i;
    String nome;
    LinkedBlockingQueue<Integer> link;

    public Produttore(String nome, LinkedBlockingQueue<Integer> link) {
        this.nome = nome;
        this.link = link;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for(int j=0;j<10;j++) {
            try {
                int i=rand.nextInt(20);
                System.out.println("Scrittore: " + nome + " dato scritto :" + i);
                link.put(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
