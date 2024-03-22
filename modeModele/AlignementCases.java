package modeModele;

public class AlignementCases {
    Orientation orientation;
    private Case[][] lesCases;
    int position;

    public Case getCaseNum(int lign,int col){
        return lesCases[lign][col];
    }
    public Case [] getLesCasesLibre(){
        Case[] tabreturn;
        int tail=0;
        for (int i = 0; i < lesCases.length; i++) {
            for (int j = 0; j < lesCases.length; j++) {
                if (lesCases[i][j].estLibre()){
                    tail++;
                }
            }
        }
        tabreturn=new Case[tail];
        tail=0;
        for (int i = 0; i < lesCases.length; i++) {
            for (int j = 0; j < lesCases.length; j++) {
                if (lesCases[i][j].estLibre()){
                    tabreturn[tail]=lesCases[i][j];
                    tail++;
                }
            }
        }
        return tabreturn;
    }
    public Case getCaseLibreValeurMax(int lign,int col){
        int max;
        Case MaxCase=null;
        if (orientation.estHorizontale()){
            max=lesCases[lign][0].getValeur();
            for (int i = 0; i < lesCases.length; i++) {
                for (int j = 0; j < lesCases.length; j++) {
                    if (lesCases[i][j].estLibre() && lesCases[i][j].getValeur()>max){
                        max=lesCases[i][j].getValeur();
                        MaxCase=lesCases[i][j];
                    }
                }
            }
        }
        return MaxCase;
    }
}
