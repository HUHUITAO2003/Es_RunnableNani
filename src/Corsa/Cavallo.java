/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corsa;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juliet
 */
public class Cavallo implements Runnable{
    String nome;
    public Cavallo(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void run() {
        try {
            sleep((long) (Math.random()*1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Cavallo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            GUI.s.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Cavallo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(GUI.primo==null){
            System.out.println("Il primo cavallo ad essere arrivato è: " + nome);
            GUI.primo=nome;
        }
        GUI.s.release();
        
    }
    
}
