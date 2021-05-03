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
public class Gestione_piloti_pista_spogliatoi {
    public static Semaforo s_spogl = new Semaforo(2);
    public static Semaforo s_pista = new Semaforo(4);
    public static Spogliatoio spogl = new Spogliatoio();
    public static Pista pista = new Pista();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Thread uno = new Thread (new Piloti("1"));
        Thread due = new Thread (new Piloti("2"));
        Thread tre = new Thread (new Piloti("3"));
        Thread qua = new Thread (new Piloti("4"));
        Thread cin = new Thread (new Piloti("5"));
        Thread sei = new Thread (new Piloti("6"));
        Thread set = new Thread (new Piloti("7"));
        Thread ott = new Thread (new Piloti("8"));

        
        uno.start();
        due.start();
        tre.start();
        qua.start();
        cin.start();
        sei.start();
        set.start();
        ott.start();
        
        
    }
    
}
