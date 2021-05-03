/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione_piloti_pista_spogliatoi;

/**
 *
 * @author juliet
 */
public class Semaforo {
    int v;

    public Semaforo(int v) {
        this.v = v;
    }
    
    synchronized public void P() throws InterruptedException{
    while(v==0){
    wait();
    }
    v--;
    }
    
    synchronized public void V(){
    v++;
    notify();
    }
}
