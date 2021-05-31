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
public class CavalloInCampo implements Runnable {

    Cavallo cavallo; //immagine del cavallo
    GaraCavalli campo; 
    int velocita;
    Thread t;
    int conta;  //conteggio di spostamenti
    int posizione;
    int corsia;

    public CavalloInCampo(Cavallo cavallo, GaraCavalli garacavalli, int corsia) {
        this.cavallo = cavallo;
        this.campo = garacavalli;
        this.corsia = corsia;
        conta = 0; //numero spostamenti
        velocita = 0;
        t = new Thread(this);
        t.start();
        posizione = 0;
    }

    @Override
    public void run() {//animazione del cavallo
        int dimImmagine = 70;
        int dimPista = 960;
        while ((cavallo.getCordx() + dimImmagine) < dimPista) {
            if ((conta % 5) == 0) { //ogni 5 spostamenti un cambiamento di velocita
                velocita = (int) (Math.random() * 100 + 1);
            }
            int luogo = cavallo.getCordx() + velocita;

            if (luogo + dimImmagine > dimPista) { //i cavalli si fermino sulla stessa fine
                luogo = dimPista - dimImmagine;
            }
            cavallo.setCordx(luogo); 
            conta++;

            try {
                sleep(75);
            } catch (InterruptedException ex) {
                Logger.getLogger(CavalloInCampo.class.getName()).log(Level.SEVERE, null, ex);
            }

            campo.repaint();
        }

        posizione = campo.Classifica(corsia);
    }

}
