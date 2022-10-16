package td2;

import java.util.Scanner;

public class exercice9 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre d'heures");
        int h = clavier.nextInt();
        System.out.println("Veuillez entrer un nombre de minutes");
        int m = clavier.nextInt();
        System.out.println("Veuillez entrer un nombre de secondes");
        int s = clavier.nextInt();
        System.out.println(h*60*60);
        System.out.println(m*60);
        System.out.println(s);
        System.out.println((h*60*60)+(m*60)+s);
    }
}
