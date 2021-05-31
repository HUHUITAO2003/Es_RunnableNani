/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ippodromo;import javax.swing.*;
import java.awt.*;

/**
 *
 * @author informatica
 */
public class GaraCavalli extends JFrame{
    int posizione;
    int corsie;
    Cavallo[] cavalli;
    CavalloInCampo[] ThreadCavalli;
    Campo pista;
    Graphics offscreen;
    Image buffer_virtuale;
    JLabel[] arrivi;
    
    public GaraCavalli(int corsie){
        super("Cara Cavalli!");
        this.corsie=corsie;
        setSize(1000, 20+corsie*80);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pista = new Campo(corsie);
        cavalli = new Cavallo[corsie];
        ThreadCavalli = new CavalloInCampo[corsie];
        posizione = 1;
        for(int i=0;i<corsie;i++){
            cavalli[i]=new Cavallo(7+i*80, i+1);
            ThreadCavalli[i]= new CavalloInCampo(cavalli[i],this, i);
        }
        arrivi = new JLabel[corsie];
        this.add(pista);
        setVisible(true);
    }
    
    public synchronized int Classifica(int corsia){
        arrivi[posizione-1]= new JLabel(posizione + "° cavallo classificato nella "+(corsia+1)+"° corsia");
        if(posizione==corsie){
            visualizzaClassifica();
        }
        return posizione++;
    }
    
    public void visualizzaClassifica(){
        JFrame classifica = new JFrame("Classifica");
        classifica.setBounds(500, 200, 300, corsie*50);
        classifica.setDefaultCloseOperation(EXIT_ON_CLOSE);
        classifica.getContentPane().setLayout(new GridLayout(corsie,1));
 
        for(int j = 0; j<arrivi.length; j++){
            classifica.getContentPane().add(arrivi[j]);
        }
        classifica.setVisible(true);
    }

    
    public void paint(Graphics g){
        if(cavalli != null){
            Graphics2D screen = (Graphics2D)g;
            buffer_virtuale = createImage(1000, corsie*80);
            offscreen = buffer_virtuale.getGraphics();
            Dimension d = getSize();
            pista.paint(offscreen);
            for(int i=0;i<corsie;i++){
                cavalli[i].paint(offscreen);
            }
            screen.drawImage(buffer_virtuale, 0, 20, this);
            offscreen.dispose();
        }
    }

}   