package modeText;

import java.util.LinkedList;

public class AlignementCases {
    Orientation orientation;
    private LinkedList<Case> lesCases=new LinkedList<>();
    int position;

    public Case getCaseNum(int num){
        return lesCases.get(num);
    }
    public LinkedList<Case> getLesCasesLibre(){
        LinkedList<Case> cases=new LinkedList<>();
        for (Case cas: lesCases) {
            if (cas.estLibre()){
                cases.add(cas);
            }
        }
        return cases;
    }
    public Case getCaseLibreValeurMax(){
        int max=lesCases.getFirst().getValeur();
        Case MaxCase=null;
        for (Case cas: lesCases) {
            if (cas.estLibre() && cas.getValeur()>max){
                max=cas.getValeur();
                MaxCase=cas;
            }
        }
        return MaxCase;
    }
}
