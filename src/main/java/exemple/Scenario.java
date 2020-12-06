/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author bapti
 */
public class Scenario {
    private Bandeau monBandeau;
    private ArrayList<Effet> lesEffets = new ArrayList<>();
    public Scenario(Bandeau b){
        monBandeau=b;
    }

    public void ajouterEffet(Effet e) {
        lesEffets.add(e);
    }

    public void jouerScenario() {
        for (Effet e : lesEffets) {
            e.executer();
            monBandeau.sleep(1000);
        }
        monBandeau.close();
    }
}
