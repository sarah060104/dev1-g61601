package td2;

import java.util.Scanner;

public class exercice3 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez rentrer le côté du carré.");
        int a = clavier.nextInt();
        System.out.println("l'aire du programme est...");
        System.out.println(a*a);
    }
}
