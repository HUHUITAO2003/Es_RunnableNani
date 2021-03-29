/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BagniRistorante;

/**
 *
 * @author juliet
 */
public class BagniRistorante {
    public static void main(String[] args) throws InterruptedException{
    Bagno bagnouomo= new Bagno();
    Bagno bagnodonna= new Bagno();
    Thread thr1= new Thread(new Persona("uomo",bagnouomo));
    thr1.setName("Franco");
    Thread thr2= new Thread(new Persona("uomo",bagnouomo));
    thr2.setName("Giulio");
    
    Thread thr3= new Thread(new Persona("donna",bagnodonna));
    thr3.setName("Maria");
    Thread thr4= new Thread(new Persona("donna",bagnodonna));
    thr4.setName("Marta");
    
    
    thr1.start();
    thr2.start();
    thr3.start();
    thr4.start();
    }
}
