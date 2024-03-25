package modeTexte;

import modeModele.Position;

import java.util.Scanner;

public class Saisir {
    static Scanner sc=new Scanner(System.in);
    public Position position(){
        return new Position(sc.nextInt(),sc.nextInt());
    }


    public static int recuperPosJouer(){   //recuperation de la position a jouer
        System.out.println();
        System.out.println("Saisissez la position ou vous jouer");
        return sc.nextInt();
    }

}
