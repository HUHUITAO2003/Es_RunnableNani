/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo_es5;


import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliet
 */
public class Produttore implements Runnable {
    String nome;
    private final BlockingQueue<Integer> link;

    public Produttore(String nome, BlockingQueue<Integer> link) {
        this.nome = nome;
        this.link = link;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for(int j=0;j<3;j++){
                int i=rand.nextInt(20);
                System.out.println("Scrittore: " + nome + " dato scritto :" + i);
            try {
                link.put(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
