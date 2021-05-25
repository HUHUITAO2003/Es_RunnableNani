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
    Cavallo[] cavalli;
    CavalloInCampo[] ThreadCavalli;
    Campo pista;
    Graphics offscreen;
    Image buffer_virtuale;
    
    public GaraCavalli(){
        super("Cara Cavalli!");
        setSize(1000, 600);
        setLocation(10, 40);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pista = new Campo();
        cavalli = new Cavallo[6];
        ThreadCavalli = new CavalloInCampo[6];
        posizione = 1;
        int partenza = 15;
        for(int xx=0;xx<6;xx++){
            cavalli[xx]=new Cavallo(partenza, xx+1);
            ThreadCavalli[xx]= new CavalloInCampo(cavalli[xx],this);
            partenza += 100;
        }
        this.add(pista);
        setVisible(true);
    }
    
    public synchronized int getPosizione(){
        return posizione++;
    }
    
    public synchronized void ControlloArrivi(){
        boolean arrivati = true;
        for(int xx=0;xx<6;xx++){
            if(ThreadCavalli[xx].posizione==0){
                arrivati = false;
            }
        }
        if(arrivati){
            visualizzaClassifica();
        }
    }
    
    public void visualizzaClassifica(){
        JLabel[] arrivi = new JLabel[4];
        JFrame classifica = new JFrame("Classifica");
        classifica.setBounds(260, 110, 500, 500);
        classifica.setBackground(Color.BLUE);
        classifica.setDefaultCloseOperation(EXIT_ON_CLOSE);
        classifica.getContentPane().setLayout(new GridLayout(6,1));
        
        for(int i = 0; i < 7 ; i++){
            for(int j = 0; j<6 ; j++){
                arrivi[j]= new JLabel(i + "Classificato cavallo in "+(j+1)+" corsia");
                classifica.getContentPane().add(arrivi[j]);
            }
        }
        
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        if(cavalli != null){
            Graphics2D screen = (Graphics2D)g;
            buffer_virtuale = createImage(1000, 645);
            offscreen = buffer_virtuale.getGraphics();
            Dimension d = getSize();
            pista.paint(offscreen);
            for(int i=0;i<6;i++){
                cavalli[i].paint(offscreen);
            }
            screen.drawImage(buffer_virtuale, 0, 20, this);
            offscreen.dispose();
        }
    }
    
    public static void main(String[] a){
        GaraCavalli m = new GaraCavalli();
    }
}   