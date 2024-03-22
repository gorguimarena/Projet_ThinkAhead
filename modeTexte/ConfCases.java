package modeTexte;

import modeModele.Case;

import java.util.Random;

public class ConfCases {
    static Random al=new Random();
    public static void conf1(Case [] cases){
        System.out.println("La taille du tab = "+cases.length);
       try {
           for (int i = 0; i < cases.length; i++) {
              //cases[i]=new Case();

              cases[i].setValeur(1+al.nextInt(12));
           }
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
