/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunnableSetteNani;

/**
 *
 * @author juliet
 */
public class Run implements Runnable {
    private String name;
    
    public Run(String name) {
        this.name=name;
    }
    
    @Override
    public void run(){
        for(int i=1;i<8;i++){
        System.out.println(i + " Mi chiamo " + name);
        }
    }

}
