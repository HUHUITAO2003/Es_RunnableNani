/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo_es4;

/**
 *
 * @author juliet
 */
public class Semaforo{
    int valore; //valore per determinare se è occupato
    public Semaforo(int v){
        valore=v;
    }
    
    //se valore=0 risorsa non disponibile, se valore=1 occupa la risorsa 
    synchronized public void P() throws InterruptedException{
        while(valore==0){
            wait();
        }
        valore--; //mette il semaforo al rosso
    }
    
    //si rilascia la risorsa von valore++ e si risveglia il P se precedentemente era in wait
    synchronized public void V(){
        valore++;
        notify();
    }
}
