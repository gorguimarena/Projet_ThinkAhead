package modeModele;

public class Case {
    private Integer valeur;
    private Joueur joueurPar;
    private Position position;

    //constructeur
    public Case(Position position){
        this.position=position;
    }

    //les methodes
    //methode pour verifier si une case est libre ou pas
    boolean estLibre(){
        if (this.valeur!=null){
            return true;
        }
        return false;
    }
    //getter pour valeur
    public int getValeur(){
        return this.valeur;
    }
    //getter pour l'attribut jouerPar
    public Joueur getJoueurPar(){
        return this.joueurPar;
    }
    //setter pour jouerPar
   public void setJoueurPar(Joueur joueur){
        this.joueurPar=joueur;
    }
    //setter valeur
    public void setValeur(int newVal){
        this.valeur=newVal;

    }
    //gtter position
    public Position getPosition(){
        return this.position;
    }

}
