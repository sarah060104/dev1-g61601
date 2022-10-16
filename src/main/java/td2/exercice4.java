package td2;

import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre décimal pour le rayon d'un cercle");
        double r = clavier.nextDouble();
        System.out.println("Le périmetre du cercle est....");
        double p = 3.141593;
        System.out.println(2*p*r);
        System.out.println("L'aire du cercle est...");
        System.out.println(p*r*r);
    }


}
