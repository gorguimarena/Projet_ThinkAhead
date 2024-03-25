package modeModele;

import modeTexte.Affichage;
import modeTexte.ConfCases;
import modeTexte.GestionGrille;
import modeTexte.Saisir;

import java.util.LinkedList;
import java.util.Random;

public class Partie {


    private Grille laGrille;
    private Joueur[] joueurs;
    private Coup[] lesCoups;
    int [] score;

    //constructeur de la classe
    public Partie(int tailGril){
        this.laGrille=new  Grille(tailGril);
        this.lesCoups=new Coup[laGrille.getTail()*laGrille.getTail()];
        joueurs=new Joueur[2];
        score=new int[2];

    }

    //les methodes
    //getter de joueurs
    public Joueur getJoueur(int j){
        return joueurs[j];
    }


    public void commencer(){
        Random ran=new Random();
        boolean col=true;
        ConfCases.config1(this.laGrille);
        GestionGrille.afficherGrille(this.laGrille);
        int al= ran.nextInt(getLaGrille().getTail());
        if (al%2==0){
            System.out.println("La colonne "+al+" est choisi ");
            col=false;
        }else {
            System.out.println("La ligne "+al+" est choisi ");
        }
        while (true){

            if (col){
                Affichage.alignAJouer(al,"colone");
                Affichage.posPossible(GestionGrille.colPosPossible(this.laGrille.extractCasesColon(al)));
                col=false;
            }else {
                Affichage.alignAJouer(al,"ligne");
                Affichage.posPossible(GestionGrille.lignPosPossible(this.laGrille.extractCasesLign(al)));
                col=true;
            }
            int sais= Saisir.recuperPosJouer();
            al=sais;
        }

    }
    int [] getScore(){
        return this.score;
    }

    public void ajouterCoup(Coup coup){     //ajout de coup

    }

    void annulerCoups(int nbr){

    }

    public Grille getLaGrille() {
        return laGrille;
    }

}
