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
public class Decremento implements Runnable {

    private Integer c;

    public Decremento(Integer c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (1 == 1) {
            if (c > 0) {
                System.out.println(c--);
            }
        }
    }
}
