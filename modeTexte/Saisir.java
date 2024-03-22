package modeTexte;

import modeModele.Position;

import java.util.Scanner;

public class Saisir {
    Scanner sc=new Scanner(System.in);
    public Position position(){

        return new Position(sc.nextInt(),sc.nextInt());
    }
}
