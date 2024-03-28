package modeTexte;
import modeModele.Case;
import modeModele.Grille;

public class GestionGrille {

    public static void lign(int tail){  //methode pour la delimitation de ligne
        for (int i = 0; i < tail; i++) {
            System.out.print("+--");
        }
        System.out.println();
    }
    public static void indixY(int tail){ //methode pour indique les indice des colonne
        System.out.println();
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
                if (grille.lesCases[indic].getValeur()==null){
                    System.out.print("x| ");
                }else {
                    System.out.print(grille.lesCases[indic].getValeur()+"| ");
                }
                indic++;
            }
            System.out.println();
        }
    }
    public static int[] lignPosPossible(Case[] cases){     //recuperation des ligne possible
        int ind=0;
        for (Case cas:cases) {
            if (cas.getValeur()!=null){
                ind++;
            }
        }
        int[] pos=new int[ind];
         ind=0;
        for (Case cas:cases) {
            if (cas.getValeur()!=null){
                pos[ind]=cas.getPosition().pos_y;
                ind++;
            }
        }
        return pos;
    }
    public static int[] colPosPossible(Case[] cases){  //recuperation des colonne possible
        int ind=0;
        for (Case cas:cases) {
            if (cas.getValeur()!=null){
                ind++;
            }
        }
        int[] pos=new int[ind];
        ind=0;
        for (Case cas:cases) {
            if (cas.getValeur()!=null){
                pos[ind]=cas.getPosition().pos_x;
                ind++;
            }
        }
        return pos;
    }

}
