package modeTexte;

import modeModele.Joueur;
import modeModele.JoueurHumain;

import java.util.Arrays;

public class Affichage {

   /* coup n°1 (Alain)
    Vous devez jouer dans la colonne n°2
    Les positions possibles sont : [0, 1, 3] Saisissez
    la position où vous jouez :*/
    public static void posPossible(int[] align){   //affichage des position possible a jouer
        System.out.print("Les position possibles sont : "+ Arrays.toString(align));

    }
    public static void alignAJouer(int col,String align){  //affichage de l'alignement a jouer
        System.out.println("Vous devez jouer dans la "+align+" num "+col);
    }
    public static void affichScore(int [] score, Joueur joueur){
        System.out.println("Le score est  "+score[1]+" vs "+score[0]+"( pour "+joueur.nom+")");
    }

}
