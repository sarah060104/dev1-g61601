package td2;

import java.util.Scanner;

public class exerc3bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer une valeur pour les côtés d'un carré.");
        int cote = clavier.nextInt();
        System.out.println("L'aire du carré est…");
        System.out.println(cote*cote);
    }

}
