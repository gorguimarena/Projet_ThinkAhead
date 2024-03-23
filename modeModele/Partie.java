package modeModele;

import java.util.LinkedList;

public class Partie {
    private Grille laGrille;
    private Joueur[] joueurs;
    private Coup[] lesCoups;
    int [] score;

    //constructeur de la classe
    public Partie(){
        this.lesCoups=new Coup[laGrille.getTail()*laGrille.getTail()];
        joueurs=new Joueur[2];
        score=new int[2];
    }

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

    public void ajouterCoup(Coup coup){     //ajout de coup

    }

    void annulerCoups(int nbr){
        laGrille.lesCases[nbr]=null;
    }
}
