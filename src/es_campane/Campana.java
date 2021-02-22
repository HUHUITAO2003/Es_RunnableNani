/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_campane;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliet
 */
public class Campana implements Runnable{
    String suono;
    int volte;

    public Campana(String suono, int volte) {
        this.suono = suono;
        this.volte = volte;
    }

    public void run() {
        for(int i=0;i<volte;i++){
            try {
                System.out.println((i+1)+suono+"");
                sleep(7000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Campana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
