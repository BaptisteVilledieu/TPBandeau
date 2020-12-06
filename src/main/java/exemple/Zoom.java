/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author bapti
 */
public class Zoom extends Effet{
    private final int taille;
    public Zoom(Bandeau b, int r, String m, int t){
        super(b,r,m);
        taille=t;
    }
    @Override
    public void executer() {
        monBandeau.setMessage(message);
        for (int j=0;j <repetition; j++){
            for (int i = 5; i < taille; i += 5) {
                monBandeau.setFont(new Font("Dialog", Font.BOLD, i + 5));
                monBandeau.sleep(100);
            }
        }
    }
    
}
