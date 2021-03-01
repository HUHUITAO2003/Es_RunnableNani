/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Priorita;

import es_campane.*;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliet
 */
public class Conta implements Runnable{
    public String nome;
    public int num;

    public Conta(String nome,int num) {
        this.nome=nome;
        this.num = num;
    }

    public void run() {
        /* soluzione 1
        while(1==1){
        */
        while(Soluzione2.bool){
        num ++;
        System.out.println(nome+num);}
        }
    }
