/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corsa;

import java.awt.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author juliet
 */
public class GUI extends JFrame {

    Container c = new Container();
    public JPanel panel = new JPanel();

    public JLabel l = new JLabel("Quanti cavalli devono gareggiare? ");
    public JTextField t = new JTextField();
    public JButton conferma = new JButton("Conferma");
    public JButton ok = new JButton("ok");
    ArrayList<Thread> a = new ArrayList<Thread>();
    ArrayList<JLabel> al = new ArrayList<JLabel>();
    
    static Semaphore s = new Semaphore(1);
    static String primo = null;
    static ArrayList<Thread> ca = new ArrayList<Thread>(11);
    
    public GUI() {
        
        c = this.getContentPane();
        panel.setLayout(null);
        this.setTitle("Ippodromo");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);

        l.setBounds(60, 20,300,20);
        t.setBounds(60, 60, 140, 20);
        conferma.setBounds(60, 100, 140, 20);
        
        for(int i = 1; i <= 11; i++){
                JLabel cavallo = new JLabel("Cavallo"+i);
                cavallo.setBounds(60, 120+i*20, 140, 20);
                al.add(cavallo);
                cavallo=al.get(i-1);
        }            

        panel.add(l);
        panel.add(t);
        panel.add(conferma);

        c.add(panel);
        conferma.addMouseListener(new EventoMouse());
        ok.addMouseListener(new EventoMouse());
    }

    private class EventoMouse implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            
            JButton evento = (JButton) e.getComponent();
            switch (evento.getText()) {
                case "Conferma":
                    int i=0;
                    int n=Integer.valueOf(t.getText());
                    if(n>2 && n<11){
                    for(i=0;i<n;i++){
                        panel.add(al.get(i));
                    }
                    ok.setBounds(al.get(i).getBounds());
                    for(i=1; i<=n;i++){
                        String st = "Cavallo"+i;
                        Thread t = new Thread (new Cavallo(st));
                        ca.add(t);
                    }
                    for(i=0;i<n;i++){
                        ca.get(i).start();
                    }
                    for(i=0;i<n;i++){
                try {
                    ca.get(i).join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }
                    
                    JOptionPane.showMessageDialog(null, "Il primo cavallo ad essere arrivato è: " + primo);
                    panel.add(ok);
                    }else{
                    JOptionPane.showMessageDialog(null, "numero di cavalli errato, scegli tra 2 e 10");
                    }
                    break;

                case "ok":
                    for(i=0;i<Integer.valueOf(t.getText());i++){
                        panel.remove(al.get(i));
                    }
                    panel.remove(ok);
                    break;
            }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
}
