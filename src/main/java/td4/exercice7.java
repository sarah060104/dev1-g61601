package td4;

import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer une suite de chiffres positifs et terminez par -1.");
        int valeur = clavier.nextInt();
        int sentinelle = -1;
        int prem = valeur;
        int dern = valeur;

        while (valeur>sentinelle) {
            dern = valeur;
            System.out.println("Veuillez entrer un nombre positif");
            valeur = clavier.nextInt();}
            if (prem<=sentinelle) {
                System.out.println("Aucun nombre positif entrée");
            } else {
                System.out.println("Premier : " +  prem);
                System.out.println("Dernier : " + dern);
            }
    }
}
