package modeText;

import modeText.AlignementCases;
import modeText.Case;

public class Grille {
    private AlignementCases alignementCases;
    private Case[] lesCases;
    private void Case(int n){

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
}
