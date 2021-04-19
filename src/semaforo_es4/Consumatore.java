/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo_es4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliet
 */
public class Consumatore implements Runnable{
    Semaforo pieno;
    Semaforo vuoto;
    String nome;
    int dato=0;

    public Consumatore(Semaforo pieno, Semaforo vuoto, String nome) {
        this.pieno = pieno;
        this.vuoto = vuoto;
        this.nome = nome;
    }
    
    @Override
    public void run() {
        while(true){
            try {
                pieno.P(); // occupa la risorsa
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
            }
            Semaforo_Es4.buffer[dato]=0;
            dato=(dato+1)%10;
            System.out.println("Lettore "+nome+": dato letto :" + Semaforo_Es4.conta);
            vuoto.V(); //da il verde al produttore
        }
    }
    
}