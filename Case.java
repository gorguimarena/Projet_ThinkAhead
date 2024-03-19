public class Case {
    int valeur;
    Joueur joueurPar;
    Position position;

    //les methodes
    boolean estLibre(){
        return true;
    }
    int getValeur(){
        return this.valeur;
    }
    Joueur getJoueurPar(){
        return this.joueurPar;
    }
    void setJoueurPar(Joueur joueur){
        this.joueurPar=joueur;
    }
    void setValeur(int newVal){
        this.valeur=newVal;
    }
    Position getPosition(){
        return this.position;
    }

}
