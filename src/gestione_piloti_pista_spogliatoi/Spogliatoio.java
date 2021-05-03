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
public class Spogliatoio {
    public void indossa(String nome){
        try {
            Gestione_piloti_pista_spogliatoi.s_spogl.P();//richiede lo spogliatoio
            sleep(2000);//utilizza 2sec per indossare la tuta
        } catch (InterruptedException ex) {
            Logger.getLogger(Piloti.class.getName()).log(Level.SEVERE, null, ex);
        }
        Gestione_piloti_pista_spogliatoi.s_spogl.V();//rilascia lo spogliatoio
        System.out.println(nome+" ha indossato la tuta");
    }
    
    public void togli(String nome){
        try {
            Gestione_piloti_pista_spogliatoi.s_spogl.P();//richiede lo spogliatoio
            sleep(2000);//utilizza 2sec per togliere la tuta
        } catch (InterruptedException ex) {
            Logger.getLogger(Piloti.class.getName()).log(Level.SEVERE, null, ex);
        }
        Gestione_piloti_pista_spogliatoi.s_spogl.V();//rilascia lo spogliatoio
        System.out.println(nome+" ha tolto la tuta");
    }
}
