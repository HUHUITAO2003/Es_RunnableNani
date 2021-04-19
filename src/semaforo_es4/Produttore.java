/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo_es4;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliet
 */
public class Produttore implements Runnable{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti=0;
    final int attesa = 500;

    public Produttore(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    @Override
    public void run() {
        while(true){
            
            try {
                vuoto.P(); // occupa la risorsa
            } catch (InterruptedException ex) {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Semaforo_Es4.buffer[tanti]=(int) (Math.random()*10);
            System.out.println("Scrittore: dato scritto :" + Semaforo_Es4.buffer[tanti]);
            tanti=(tanti+1)%10;
            Semaforo_Es4.conta++;
            pieno.V(); // da il verde al consumatore
            
            try {
                sleep(attesa);
            } catch (InterruptedException ex) {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

