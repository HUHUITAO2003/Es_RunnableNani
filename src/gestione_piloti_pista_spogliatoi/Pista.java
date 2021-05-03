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
public class Pista {
    public void corri(String nome){
                try {
            Gestione_piloti_pista_spogliatoi.s_pista.P();//richiede la pista
            System.out.println(nome+" è entrato nella pista");
            for(int i=1; i<=15;i++){
                System.out.println(nome+" ha fatto "+i+" giri");
                sleep(1000);//utilizza 2sec per fare un giro
            }
            System.out.println(nome+" è uscito dalla pista");
        } catch (InterruptedException ex) {
            Logger.getLogger(Piloti.class.getName()).log(Level.SEVERE, null, ex);
        }
        Gestione_piloti_pista_spogliatoi.s_pista.V();//rilascia la pista
    }
}
