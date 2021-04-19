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
public class ConsumaDato implements Runnable{
    Semaforo pieno;
    Semaforo vuoto;
    int dato=0;

    public ConsumaDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    @Override
    public void run() {
        while(dato!=ProduciDato.tanti-1){
            try {
                pieno.P(); // occupa la risorsa
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsumaDato.class.getName()).log(Level.SEVERE, null, ex);
            }
            dato=ProdConsSem.buffer;
            System.out.println("Lettore: dato letto :" + dato);
            vuoto.V(); //da il verde al produttore
        }
    }
    
}
