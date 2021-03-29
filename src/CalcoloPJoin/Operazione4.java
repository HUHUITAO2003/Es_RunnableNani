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
public class Operazione4 implements Runnable{
    Buffer dati;

    public Operazione4(Buffer dati) {
        this.dati = dati;
    }

    @Override
    public void run() {
        dati.t=5*dati.z;
        //es.2 dati.t=dati.x*dati.y;
        //dati.t=dati.z*dati.y;
        System.out.println("Ho calcolato t: "+dati.t);
    }
    
    
}
