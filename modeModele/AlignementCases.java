package modeModele;

public class AlignementCases {
    Orientation orientation;
    private Case[] lesCases;    //variables pour le stockage des cases
    int position;   //le position a jouer

    public Case getCaseNum(int num){ //recuperation d'une case par som numero ''''''''''''''''''''''''
        return lesCases[num];
    }

    public Case [] getLesCasesLibre(){  //recherche des cases libre
        Case[] tabreturn;
        int tail=0;
        for (int i = 0; i < lesCases.length; i++) {
                if (lesCases[i].estLibre()){
                    tail++;
                }
        }
        tabreturn=new Case[tail];
        tail=0;
        for (int i = 0; i < lesCases.length; i++) {
                if (lesCases[i].estLibre()){
                    tabreturn[tail]=lesCases[i];
                    tail++;
                }
        }
        return tabreturn;
    }

    public Case getCaseLibreValeurMax(){ //a revoir ''''''''''''''''''
        int max;
        Case MaxCase=null;

        return MaxCase;
    }
}
