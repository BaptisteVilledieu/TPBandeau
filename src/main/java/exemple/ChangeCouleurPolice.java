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
public class ChangeCouleurPolice extends Effet{
    private Color nouvelleCouleur;

    public ChangeCouleurPolice(Bandeau b,int r, String m, Color n) {
        super(b,r,m);
        nouvelleCouleur = n;
    }

    @Override
    public void executer() {
        monBandeau.setMessage(message);
        monBandeau.sleep(1000);
        monBandeau.setForeground(nouvelleCouleur);
    }
    
}
