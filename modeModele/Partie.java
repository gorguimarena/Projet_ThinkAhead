package modeModele;

import modeTexte.*;

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

        int al= ran.nextInt(getLaGrille().getTail());
        if (al%2==0){
            System.out.println("La colonne "+al+" est choisi ");
            col=false;
        }else {
            System.out.println("La ligne "+al+" est choisi ");
        }
        while (true){
            Case [] alignCase;
            int [] align;
            GestionGrille.afficherGrille(this.laGrille);
            if (col){
                Affichage.alignAJouer(al,"colone");
                alignCase=this.laGrille.extractCasesColon(al);
                align=GestionGrille.colPosPossible(alignCase);
                if (Regles.alignVide(align)){
                    break;
                }
                Affichage.posPossible(align);
                col=false;
            }else {
                Affichage.alignAJouer(al,"ligne");
                 alignCase=this.laGrille.extractCasesLign(al);
                 align=GestionGrille.lignPosPossible(alignCase);
                 if (Regles.alignVide(align)){
                     break;
                 }
                Affichage.posPossible(align);
                col=true;
            }
            int sais= Saisir.recuperPosJouer();
            al=sais;
            annulerCoups(alignCase,al,col);



        }

    }
    int [] getScore(){
        return this.score;
    }

    public void ajouterCoup(Coup coup){     //ajout de coup

    }

    void annulerCoups(Case[] cas,int nbr,boolean iscol){
        for (Case ca:cas) {
            if (iscol && ca.getPosition().pos_y==nbr){
                ca.setValeur(null);
            }else if (!iscol && ca.getPosition().pos_x==nbr){
                ca.setValeur(null);
            }
        }
    }

    public Grille getLaGrille() {
        return laGrille;
    }

}
