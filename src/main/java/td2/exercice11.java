package td2;

import java.util.Scanner;

public class exercice11 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer le prix unitaire d’un produit hors TVA.");
        int pr = clavier.nextInt();
        System.out.println("Veuillez entrer le taux de TVA en %");
        int TVA = clavier.nextInt();
        System.out.println("Veuillez entrer la quantité de produit vendue à un client.");
        int prod = clavier.nextInt();
        System.out.println((prod*pr)+((prod*pr)/100)*TVA);
        System.out.println();

    }
}
