/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo_es4;

import static java.lang.Thread.sleep;


/**
 *
 * @author juliet
 */
public class Semaforo_Es4 {

static int[] buffer = new int[10]; //buffer circolare
static int conta; //variabile contatore

    public static void main(String args[]) throws InterruptedException{
        //creare due isranze di semaforo
        Semaforo pieno = new Semaforo(0); //semaforo per consumatore
        Semaforo vuoto = new Semaforo(1); //semaforo per produttore
        
        //produttore e cons con le stesse istanze dei due semafori
        Thread t1= new Thread(new Produttore(pieno, vuoto));
        Thread t2= new Thread(new Consumatore(pieno, vuoto,"Consumatore1"));
        Thread t3= new Thread(new Consumatore(pieno, vuoto,"Consumatore2"));
        Thread t4= new Thread(new Consumatore(pieno, vuoto,"Consumatore3"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        sleep(10000);
        t1.stop();
        t2.stop();
        t3.stop();
        t4.stop();
    }
    
}
