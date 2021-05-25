package Ippodromo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Cavallo extends JPanel{
    int cordx;
    int cordy;
    Image img;
    
    public Cavallo(int x, int y){// rappresenta un cavallo nello schermo
    cordx = 0;
    cordy=y;
    setSize(80, 81);
    Toolkit tk = Toolkit.getDefaultToolkit();
    switch(x){
        case 1:{img = tk.getImage("haha.jpeg"); break;}
        case 2:{img = tk.getImage("haha.jpeg"); break;}
        case 3:{img = tk.getImage("haha.jpeg"); break;}
        case 4:{img = tk.getImage("haha.jpeg"); break;}
        case 5:{img = tk.getImage("haha.jpeg"); break;}
        case 6:{img = tk.getImage("haha.jpeg"); break;}
    }
    
    MediaTracker mt = new MediaTracker(this);
    mt.addImage(img, 1);
        try {
            mt.waitForID(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cavallo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getCordx() {
        return cordx;
    }

    public void setCordx(int cordx) {
        this.cordx = cordx;
    }

    public void paint(Graphics g){
        g.drawImage(img, cordx, cordy, null);
    }
    
}