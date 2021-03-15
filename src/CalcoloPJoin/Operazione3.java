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
public class Operazione3 implements Runnable {

    Buffer dati;

    public Operazione3(Buffer dati) {
        this.dati = dati;
    }

    @Override
    public void run() {
        //es.1 dati.z=dati.x*dati.y;
        //es.2 dati.z = 8 - 3 * dati.c;
        dati.z = 7* dati.b*dati.y+3;
        System.out.println("Ho calcolato z: " + dati.z);
    }

}
