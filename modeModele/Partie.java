package modeModele;

import modeTexte.*;

import java.util.Arrays;

import java.util.Random;

public class Partie {


    private final Grille laGrille;
    private Joueur[] joueurs=new Joueur[2];
    private Coup[] lesCoups;
    static int [] score= new int[]{0,0};

    //constructeur de la classe
    public Partie(int tailGril,Joueur joueur){
        this.laGrille=new  Grille(tailGril);
        this.lesCoups=new Coup[laGrille.getTail()*laGrille.getTail()];
        joueurs[0]=joueur;
        joueurs[1]=new JoueurOrdinateur();

    }

    //les methodes
    //getter de joueurs
    public Joueur getJoueur(int j){
        return joueurs[j];
    }

    //methode de lancement du jeu
    public void commencer(){
        Random ran=new Random();
        boolean col=true;
        ConfCases.config1(this.laGrille);
        boolean joue=false;
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
                    Affichage.affichScore(getScore(),joueurs[0]);
                    break;
                }
                Affichage.posPossible(align);
                col=false;

            }else {
                Affichage.alignAJouer(al,"ligne");
                 alignCase=this.laGrille.extractCasesLign(al);
                 align=GestionGrille.lignPosPossible(alignCase);
                 if (Regles.alignVide(align)){
                     Affichage.affichScore(getScore(),joueurs[0]);
                     break;
                 }
                Affichage.posPossible(align);
                col=true;

            }

            if (joue){
                this.laGrille.selectionCase(laGrille.alignementCases.getCaseLibreValeurMax().getPosition(), joueurs[1]);

                annulerCoups(alignCase,laGrille.alignementCases.getindicLibreValeurMax(),col);
                joue=false;
            }else {

                int sais;
                do {

                    System.out.println("\n"+joueurs[0].nom);
                    sais= Saisir.recuperPosJouer();
                }while (sais<0 || sais>= this.laGrille.getTail() || laGrille.alignementCases.getCaseNum(sais).getValeur()==null);
                al=sais;
                this.laGrille.selectionCase(laGrille.alignementCases.getCaseNum(al).getPosition(), joueurs[0]);
                annulerCoups(alignCase,al,col);
                joue=true;
            }

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

    public static void setScore(int score,int i) {
        Partie.score [i]+= score;
    }
}
