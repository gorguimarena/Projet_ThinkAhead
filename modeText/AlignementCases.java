package modeText;

import java.util.LinkedList;

public class AlignementCases {
    Orientation orientation;
    private LinkedList<Case> lesCases=new LinkedList<>();
    int position;

    public Case getCaseNum(int num){
        return lesCases.get(num);
    }
    public Case[] getLesCasesLibre(){
        return null;
    }
    Case getCaseLibreValeurMax(){
        return null;
    }
}
