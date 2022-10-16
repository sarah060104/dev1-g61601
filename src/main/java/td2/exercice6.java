package td2;

import java.util.Scanner;

public class exercice6 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier..");
        int nb = clavier.nextInt();
        System.out.println("Unité:");
        System.out.println(nb%10);
        System.out.println("Dizaine:");
        System.out.println((nb/10)%10);
        System.out.println("Centaine:");
        System.out.println((nb/100)%10);
    }
}
