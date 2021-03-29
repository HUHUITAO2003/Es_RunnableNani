/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcoloPJoin;

/**
 *
 * @author juliet
 */
public class Operazione2 implements Runnable {

    Buffer dati;

    public Operazione2(Buffer dati) {
        this.dati = dati;
    }

    @Override
    public void run() {
         dati.y=7*dati.b+3;
        //es.2 dati.y = 5 * dati.b - 7;
        //dati.y = 5 - 2*dati.c;
        System.out.println("Ho calcolato y: " + dati.y);
    }

}
