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
        
        thr1.start();
        thr2.start();
        
        thr1.join();
        thr2.join();
        
        thr3.start();
        thr3.join();
        
        thr4.start();
        thr4.join();
        
        thr5.start();
        thr5.join();
        
    }
}
