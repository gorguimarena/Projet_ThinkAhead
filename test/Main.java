package test;

import modeModele.Case;
import modeTexte.*;
import modeModele.Grille;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Grille grille=new Grille(5);
        ConfCases.config1(grille);
        GestionGrille.afficherGrille(grille);

        /*System.out.println(grille.lesCases[3].getValeur());
        System.out.println(grille.lesCases[3].getPosition().pos_x);*/

        Case[] tabCase= grille.extractCasesLign(0);
       int[] pos =GestionGrille.lignPosPossible(tabCase);
       Affichage.posPossible(pos);

    }
}
