/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforo;

/**
 *
 * @author juliet
 */
public class ProdConsSem {
    static int buffer; //variabile globale da stampare
    public static void main(String args[]){
        int[] baba;
        //creare due isranze di semaforo
        Semaforo pieno = new Semaforo(0); //semaforo per consumatore
        Semaforo vuoto = new Semaforo(1); //semaforo per produttore
        
        //produttore e cons con le stesse istanze dei due semafori
        ProduciDato r1= new ProduciDato(pieno, vuoto);
        Thread t1= new Thread(r1);
        Thread t2= new Thread(new ConsumaDato(pieno, vuoto));

        t1.start();
        t2.start();
        
    }
}
