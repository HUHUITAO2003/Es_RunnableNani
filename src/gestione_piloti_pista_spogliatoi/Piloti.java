/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione_piloti_pista_spogliatoi;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliet
 */
public class Piloti implements Runnable{
    String nome;

    public Piloti(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void run() {
        Gestione_piloti_pista_spogliatoi.spogl.indossa(nome);
        Gestione_piloti_pista_spogliatoi.pista.corri(nome);
        Gestione_piloti_pista_spogliatoi.spogl.togli(nome);
    }
    
}
