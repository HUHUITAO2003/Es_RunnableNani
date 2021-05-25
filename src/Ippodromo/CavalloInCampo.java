/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ippodromo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class CavalloInCampo implements Runnable{
    Cavallo cavallo;
    GaraCavalli campo;
    int velocita;
    Thread t;
    int conta;
    int posizione;
    
    public CavalloInCampo(Cavallo c,GaraCavalli ca){
        cavallo=c;
        campo=ca;
        conta=0;
        velocita=2;
        t=new Thread(this);
        t.start();
        posizione=0;
    
    }
    @Override
    public void run() {//animazione del cavallo
        int dimImmagine = 79;
        int dimPista = 960;
        while((cavallo.getCordx() + dimImmagine) < dimPista){
            if((conta % 10)==0){
                velocita=(int) (Math.random()*4 + 1);
            }
            cavallo.setCordx(cavallo.getCordx()+velocita);
            conta++;

            try {sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CavalloInCampo.class.getName()).log(Level.SEVERE, null, ex);
            }

            campo.repaint();
        }
        
        posizione = campo.getPosizione();
        campo.ControlloArrivi();
    }
    
}