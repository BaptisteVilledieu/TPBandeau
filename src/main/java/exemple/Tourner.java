/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author bapti
 */
public class Tourner extends Effet{
    public Tourner(Bandeau b, int r, String m){
        super(b,r,m);
    }
    @Override
    public void executer(){
        monBandeau.setMessage(message);
        for (int i = 0; i < repetition; i++) {
            for (int j = 0; j <= 100; j++) {
                monBandeau.setRotation(2 * Math.PI * j / 100);
                monBandeau.sleep(30);
            }
        }
    }
    
}
