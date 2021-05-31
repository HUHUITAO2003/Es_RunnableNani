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
public class Cavallo extends JPanel {

    int cordx;
    int cordy;
    Image img;

    public Cavallo(int y, int x) {// rappresenta un cavallo nello schermo
        cordx = 0;
        cordy = y;
        Toolkit tk = Toolkit.getDefaultToolkit();
        switch (x) {
            case 1: img = tk.getImage(this.getClass().getResource("/images/cavallo1.jpg")); break;
            case 2: img = tk.getImage(this.getClass().getResource("/images/cavallo2.jpg")); break;
            case 3: img = tk.getImage(this.getClass().getResource("/images/cavallo3.jpg")); break;
            case 4: img = tk.getImage(this.getClass().getResource("/images/cavallo4.jpg")); break;
            case 5: img = tk.getImage(this.getClass().getResource("/images/cavallo5.jpg")); break;
            case 6: img = tk.getImage(this.getClass().getResource("/images/cavallo6.jpg")); break;
            case 7: img = tk.getImage(this.getClass().getResource("/images/cavallo7.jpg")); break;
            case 8: img = tk.getImage(this.getClass().getResource("/images/cavallo8.jpg")); break;
            case 9: img = tk.getImage(this.getClass().getResource("/images/cavallo9.jpg")); break;
            case 10: img = tk.getImage(this.getClass().getResource("/images/cavallo10.jpg")); break;

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

    public void paint(Graphics g) {
        g.drawImage(img, cordx, cordy, 70, 70, null);
    }

}
