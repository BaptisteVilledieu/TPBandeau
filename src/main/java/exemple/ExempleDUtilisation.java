package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    
    /*public static void main(String[] args) {
	    new ExempleDUtilisation().exemple();
    }
    

   }
	monBandeau.sleep(1000);

	monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
	monBandeau.setMessage("On va tourner");
	monBandeau.sleep(1000);
	monBandeau.setMessage("On tourne...");
	for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(100);
}

	monBandeau.setMessage("On va changer de couleur de fond");
	monBandeau.sleep(1000);
	monBandeau.setBackground(Color.DARK_GRAY);
	monBandeau.setMessage("On va changer de couleur");
	monBandeau.sleep(1000);
	monBandeau.setForeground(Color.YELLOW);
	monBandeau.sleep(1000);
	monBandeau.setFont(font);
	monBandeau.setForeground(fore);
	monBandeau.setBackground(back);
	monBandeau.setMessage("Terminé");
	monBandeau.sleep(3000);
	monBandeau.close();
   }*/
    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Scenario monScenario = new Scenario(monBandeau);
        monScenario.ajouterEffet(new Zoom(monBandeau,5,"on zoome",60));
        monScenario.ajouterEffet(new Tourner(monBandeau,4,"on tourne"));
        monScenario.ajouterEffet(new ChangerCouleurFond(monBandeau, 1, "Le fond change de couleur",Color.BLUE));
        monScenario.ajouterEffet(new ChangeCouleurPolice(monBandeau,1,"La police change de couleur" ,Color.RED));
        
        monScenario.jouerScenario();

    }
}
