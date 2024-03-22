package modeTexte;
import modeModele.Grille;

public class GestionGrille {

    public static void lign(int tail){  //methode pour la delimitation de ligne
        for (int i = 0; i < tail; i++) {
            System.out.print("+--");
        }
        System.out.println(" ");
    }
    public static void indixY(int tail){ //methode pour indique les indice des colonne
        for (int i = 0; i < tail; i++) {
            System.out.print("  "+i);
        }
        System.out.println();
    }
    public static void indixX(int i){ //methode pour indique les indices des ligne
        System.out.print(i);
    }

    public static void afficherGrille(Grille grille){  //methode pour l'affichage des grille
        indixY(grille.getTail());
        int indic=0;
        for (int i = 0; i < grille.getTail(); i++) {

            lign(grille.getTail());
            indixX(i);
            System.out.print("|");
            for (int j = 0; j < grille.getTail(); j++) {
                System.out.print(grille.lesCases[indic].getValeur()+"| ");
                indic++;
            }
            System.out.println();

        }
    }

}
