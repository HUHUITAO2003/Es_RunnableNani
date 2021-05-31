/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ippodromo;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author juliet
 */
public class Campo extends JPanel{
    int corsie; //numero corsie

    public Campo(int corsie) {
        this.corsie = corsie;
    }
    
    
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(0, 0, 1000, corsie*80); //campo generale
        g.setColor(Color.white);
        
        for(int i=0; i < corsie; i++){ //divisione delle corsie
        g.fillRect(0, i*80, 1000, 5);
        }
        
        for(int i = 0; i < 3; i++){ //fine
        g.fillRect(960+i*10, 0, 5, corsie*100);
        }
    }
    }