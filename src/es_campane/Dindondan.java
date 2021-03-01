/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_campane;

/**
 *
 * @author juliet
 */
public class Dindondan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        /*Thread thr4 = new Thread(new Campana("dun",3));
        Thread thr5 = new Thread(new Campana("dun",3));
        Thread thr6 = new Thread(new Campana("dun",3));*/
        Thread thr1 = new Thread(new Campana("din", 3));
        thr1.start();
        thr1.sleep(500);
        //thr4.start();
        //thr4.sleep(600);
        Thread thr2 = new Thread(new Campana("don", 3));
        thr2.start();
        thr2.sleep(1500);
        //thr5.start();
        //thr5.sleep(1600);
        Thread thr3 = new Thread(new Campana("dan", 3));
        thr3.start();
        thr3.sleep(2500);
        //thr6.start();
        //thr6.sleep(2600);

    }

}
