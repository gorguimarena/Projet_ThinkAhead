package modeText;

import modeText.Coup;
import modeText.Grille;
import modeText.Joueur;

import java.util.LinkedList;

public class Partie {
    private Grille laGrille;
    private Joueur[] joueurs;
    private LinkedList <Coup> lesCoups;
    int [] score;

    //les methodes
    //getter de joueurs
    public Joueur getJoueur(int j){
        return joueurs[j];
    }

    Grille getGrille(){
        return this.laGrille;
    }
    void commencer(){

    }
    int [] getScore(){
        return this.score;
    }
    public void ajouterCoup(Coup coup){
        lesCoups.add(coup);
    }
    void annulerCoups(int nbr){

    }
}
