/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliet
 */
public class ProduciDato implements Runnable{
    Semaforo pieno;
    Semaforo vuoto;
    static int tanti=5;
    final int attesa = 500;

    public ProduciDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    @Override
    public void run() {
        for(int i=0;i<tanti;i++){
            
            try {
                vuoto.P(); // occupa la risorsa
            } catch (InterruptedException ex) {
                Logger.getLogger(ProduciDato.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ProdConsSem.buffer=i;
            System.out.println("Scrittore: dato scritto :" + i);
            pieno.V(); // da il verde al consumatore
            
            try {
                sleep(attesa);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProduciDato.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
