/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author bapti
 */
public class ChangerCouleurFond extends Effet{
    private final Color nouvelleCouleur;

    public ChangerCouleurFond(Bandeau b, int r, String m, Color n) {
        super(b,r,m);
        nouvelleCouleur = n;
    }

    @Override
    public void executer() {
        monBandeau.setMessage(message);
        monBandeau.sleep(1000);
        monBandeau.setBackground(nouvelleCouleur);
    }
}
    

