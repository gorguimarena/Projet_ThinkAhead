package modeModele;

public class Grille {
    public AlignementCases alignementCases=new AlignementCases();
    private int tail;

    public Case[] lesCases;
    private void Case(int n){

    }
    public Grille(int tail){
        this.tail=tail;
        this.alignementCases.lesCases=new Case[tail];
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
    public Case[] extractCasesLign(int numLign){ //methode pour recuperer la ligne la grille

        int indic=numLign*tail;
        for (int i = 0; i < this.alignementCases.lesCases.length; i++) {
            this.alignementCases.lesCases[i]=lesCases[indic];
            indic++;
        }
        return alignementCases.lesCases;
    }
    public Case[] extractCasesColon(int numCol){    //methode pour extraire la colonne de la grille

        int indic=0;
        for (Case cas:lesCases) {
            if (cas.getPosition().pos_y == numCol){
                this.alignementCases.lesCases[indic]=cas;
                if (indic==this.tail-1){
                    break;
                }
                indic++;
            }
        }
        return alignementCases.lesCases;
    }


}
