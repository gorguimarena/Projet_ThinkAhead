package modeTexte;
import modeModele.Case;
import modeModele.Grille;
import modeModele.Position;

import java.util.Random;

public class ConfCases {
    static Random al=new Random();

    public static void config1(Grille grille){  //configuration de la grille avec la premier methode

        for (int i = 0; i < grille.getTail(); i++) {
            for (int j = 0; j < grille.getTail(); j++) {
                grille.lesCases[i]=new Case(new Position(i,j));
                grille.lesCases[i].setValeur(al.nextInt(9));
                grille.lesCases[i].getPosition().pos_x=i;
                grille.lesCases[i].getPosition().pos_y=j;
            }
        }
    }

    public static void config2(Grille grille){ //a revoir '''''''''''''''''''''''''''''

    }
}
