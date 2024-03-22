package modeModele;

public class Grille {
    private AlignementCases alignementCases;
    private int tail;

    public Case[] lesCases;
    private void Case(int n){

    }
    public Grille(int tail){
        this.tail=tail;

        this.lesCases=new Case[tail*tail];
    }
    public Case getCase(Position pos){
        int indi=0;
        for (int i = 0; i < lesCases.length; i++) {
            if (lesCases[i].getPosition()==pos){
                 indi=i;
            }
        }
        return this.lesCases[indi];
    }
    public boolean selectionCase(Position pos, Joueur joueur){

        return true;
    }
   public void setAlignementactif(int num, Orientation orientation){

    }

    public void setTail(int tail) {
        this.tail = tail;
    }
    public int getTail(){
        return tail;
    }
    public void extractAlign(int lign){

    }
    public void extractCases(){ //methode pour recuperer la ligne ou les colonne de la grille '''''''''''''''''''''''''''''

    }

}
