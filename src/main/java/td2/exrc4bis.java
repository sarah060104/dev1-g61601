package td2;

import java.util.Scanner;

public class exrc4bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("veuillez écrire le rayon d'un cercle");
        int r = clavier.nextInt();
        System.out.println("aire du cercle");
        System.out.println(r*r*3.141593);
        System.out.println("périmêtre du cercle");
        System.out.println(2*r*3.141593);
    }

}
