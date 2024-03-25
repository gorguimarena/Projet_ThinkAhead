package modeModele;

public class AlignementCases {
    public Orientation orientation;
    public Case[] lesCases;    //variables pour le stockage des cases

    public Case getCaseNum(int num){ //recuperation d'une case par som numero ''''''''''''''''''''''''
        return this.lesCases[num];
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

    public Case getCaseLibreValeurMax(){ //methode pour recuperer la case contenant le max pour un alignment
        int max=0;
        Case MaxCase=null;
        for (Case cas:lesCases) {
            if (cas.estLibre()){
                max= cas.getValeur();
                MaxCase=cas;
                break;
            }
        }
        for (Case cas:lesCases) {
            if (cas.estLibre()){
                if (cas.getValeur()>max){
                    MaxCase=cas;
                    max=cas.getValeur();
                }
            }
        }
        return MaxCase;
    }
    public int getindicLibreValeurMax(){ //methode pour recuperer l'indic contenant le max pour un alignment
        int max=0;
        int IndicMaxCase = 0;
        for (int i = 0; i <lesCases.length ; i++) {
            if (lesCases[i].estLibre()){
                max= lesCases[i].getValeur();
                IndicMaxCase=i;
                break;
            }
        }{

        }
        for (int i = 0; i < lesCases.length; i++) {
            if (lesCases[i].estLibre()){
                if (lesCases[i].getValeur()>max){
                    IndicMaxCase=i;
                    max=lesCases[i].getValeur();
                }
            }
        }
        return IndicMaxCase;
    }
}
