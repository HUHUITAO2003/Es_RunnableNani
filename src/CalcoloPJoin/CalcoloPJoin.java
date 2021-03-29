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
public class CalcoloPJoin {
    public static void main(String[] args) throws InterruptedException{
        double a=1, b=2, c=3;
        System.out.println("Devo calcolare: 5*((2a+4)*(7b+3))-10c");
        Buffer dati= new Buffer(a, b, c);
        Thread thr1= new Thread(new Operazione1(dati));
        Thread thr2= new Thread(new Operazione2(dati));
        Thread thr3= new Thread(new Operazione3(dati));
        Thread thr4= new Thread(new Operazione4(dati));
        Thread thr5= new Thread(new Operazione5(dati));
        
        /*saluzione1*/
        thr1.start(); //x=2a+4
        thr2.start(); //y=7b+3
        thr1.join(); 
        thr2.join();
        thr3.start(); //z=x*y
        thr3.join();
        thr4.start(); //t=5*z
        thr4.join();
        thr5.start(); //k=t-10c
        thr5.join();
        
        /* soluzione2
        thr1.start();
        thr2.start();
        thr3.start();
        thr1.join();
        thr2.join();
        thr3.join();
        thr4.start();
        thr4.join();
        thr5.start();
        thr5.join();*/
        
        /*
        thr1.start();
        thr2.start();
        thr3.start();
        thr1.join();
        thr2.join();
        thr3.join();
        thr4.start();
        thr4.join();
        thr5.start();
        thr5.join();*/
        
    }
}
