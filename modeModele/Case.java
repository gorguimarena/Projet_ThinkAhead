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

    boolean estLibre(){     //methode pour verifier si une case est libre ou pas
        if (this.valeur!=null){
            return true;
        }
        return false;
    }

    public Integer getValeur(){      //getter pour valeur
        return this.valeur;
    }

    public Joueur getJoueurPar(){   //getter pour l'attribut jouerPar
        return this.joueurPar;
    }

   public void setJoueurPar(Joueur joueur){     //setter pour jouerPar
        this.joueurPar=joueur;
    }

    public void setValeur(int newVal){   //setter valeur
        this.valeur=newVal;

    }

    public Position getPosition(){  //getter position
        return this.position;
    }

}
