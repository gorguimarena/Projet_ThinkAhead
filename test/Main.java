package test;

import modeTexte.*;
import modeModele.Grille;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Grille grille=new Grille(5);

        ConfCases.config1(grille);
        GestionGrille.afficherGrille(grille);

    }
}
