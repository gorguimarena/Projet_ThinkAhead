package modeTexte;
import modeModele.Case;
import modeModele.Grille;
import modeModele.Position;

import java.util.*;

public class ConfCases {
    static Random al=new Random();

    public static void config1(Grille grille){  //configuration de la grille avec la premier methode
        int indic=0;
        for (int i = 0; i < grille.getTail(); i++) {
            for (int j = 0; j < grille.getTail(); j++) {
                grille.lesCases[indic]=new Case(new Position(i,j));
                grille.lesCases[indic].setValeur(al.nextInt(9));
                indic++;
            }
        }
    }
    public Integer[] lesIndic(int debut, int fin){
        List<Integer> indic=new ArrayList<>();
        for (int i = debut; i < fin; i++) {
            indic.add(i);
        }
        Collections.shuffle(indic);
        return indic.toArray(new Integer[0]);
    }
    public void config2(Grille grille){ //a revoir '''''''''''''''''''''''''''''
        Integer[] indic=this.lesIndic(0, grille.getTail());
        int val=1;
        for (int i = 0; i < 9; i++) {
            grille.lesCases[indic[i]].setValeur(val);

        }
    }
}
