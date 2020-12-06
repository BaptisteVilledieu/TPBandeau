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
public abstract class Effet {
    public Bandeau monBandeau;
    protected int repetition;
    protected String message;
    public Effet(Bandeau b, int r, String m){
        monBandeau=b;
        repetition=r;
        message=m;
    }
    
    public abstract void executer();
}
