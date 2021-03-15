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
public class Operazione1 implements Runnable {

    Buffer dati;

    public Operazione1(Buffer dati) {
        this.dati = dati;
    }

    @Override
    public void run() {
        //es.1 dati.x = 2 * dati.a + 4;
        //es.2 dati.x = 3 + 2 * dati.a;
        dati.x = 3 +dati.a;
        System.out.println("Ho calcolato x: " + dati.x);
    }

}
