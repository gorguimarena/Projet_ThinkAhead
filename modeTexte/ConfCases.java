package modeTexte;
import modeModele.Case;
import modeModele.Grille;
import modeModele.Position;

import java.util.Random;

public class ConfCases {
    static Random al=new Random();

    public static void config1(Grille grille){  //configuration de la grille avec la premier methode
        int indic=0;
        for (int i = 0; i < grille.getTail(); i++) {
            for (int j = 0; j < grille.getTail(); j++) {
                grille.lesCases[indic]=new Case(new Position(i,j));
                grille.lesCases[indic].setValeur(al.nextInt(9));
                grille.lesCases[indic].getPosition().pos_x=i;
                grille.lesCases[indic].getPosition().pos_y=j;
                indic++;
            }
        }
    }

    public static void config2(Grille grille){ //a revoir '''''''''''''''''''''''''''''

    }
}
