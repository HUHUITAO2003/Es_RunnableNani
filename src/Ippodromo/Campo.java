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
    
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(0, 0, 1000, 600);
        g.setColor(Color.white);
        for(int i=0; i < 6; i++){
        g.fillRect(0, i*100, 1000, HEIGHT);
        }
        
        for(int i = 0; i < 3; i++){
        g.fillRect(960+i*10, 0, 5, 600);
        }
    }
    }