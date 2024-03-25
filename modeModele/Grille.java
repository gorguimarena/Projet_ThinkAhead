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
    public Case[] extractCasesLign(int numLign){ //methode pour recuperer la ligne la grille
        Case [] cases=new Case[tail];
        int indic=numLign*tail;
        for (int i = 0; i < cases.length; i++) {
            cases[i]=lesCases[indic];
            indic++;
        }
        return cases;
    }
    public Case[] extractCasesColon(int numCol){    //methode pour extraire la colonne de la grille
        Case [] cases=new Case[tail];
        int indic=0;
        for (Case cas:this.lesCases) {
            if (cas.getPosition().pos_y == numCol){
                cases[indic]=cas;
                if (indic==tail-1){
                    break;
                }
                indic++;
            }
        }
        return cases;
    }


}
