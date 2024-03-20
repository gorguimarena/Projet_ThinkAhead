package modeText;

public class Coup {
    Joueur joueur;
    Position positionCase;
    Orientation orientation;
    //constructeur Coup

    public Coup(Joueur joueur,Position position,Orientation orientation){
        this.joueur=joueur;
        this.positionCase=position;
        this.orientation=orientation;
    }
}
