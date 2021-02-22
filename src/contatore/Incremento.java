/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatore;

/**
 *
 * @author informatica
 */
public class Incremento implements Runnable{
    int c;
    
    public Incremento(int c){
        this.c=c;
    }
    
    @Override
    public void run(){
        while (1 == 1) {
            if (c < 100) {
                System.out.println(c++);
            }
        }
    }
}
