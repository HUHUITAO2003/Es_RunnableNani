/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExtendSetteNani;

import RunnableSetteNani.*;

/**
 *
 * @author juliet
 */
public class Nani extends Thread {
    
    public Nani(String name) {
        super(name);
    }

    public void run(){
        for(int i=1;i<8;i++){
        System.out.println(i + " Mi chiamo " + getName());
        }
    }

}
