/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Priorita;

import static java.lang.Thread.sleep;

/**
 *
 * @author juliet
 */
public class Es_Priorita {
    public static void main(String[] args) throws InterruptedException{
        
        Thread thr1 = new Thread(new Conta("Conta1 ",0));

        thr1.setPriority(10);

        Thread thr2 = new Thread(new Conta("Conta2 ",0));
        thr2.setPriority(5);

        Thread thr3 = new Thread(new Conta("Conta3 ",0));
        thr3.setPriority(1);
        
        thr1.start();
        thr2.start();
        thr3.start();
        sleep(5000);
        Soluzione2.bool=false;
        /* soluzione 1
        thr1.stop();
        thr2.stop();
        thr3.stop();
        */
    }
}