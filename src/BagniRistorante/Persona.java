/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BagniRistorante;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliet
 */
public class Persona implements Runnable {
    public String sesso;
    private Bagno bagno;
    
    public Persona(String sesso, Bagno bagno) {
        this.sesso=sesso;
        this.bagno = bagno;
    }
    
    @Override
    public void run() {
        try {
            bagno.Occupato();
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
