package td3;

import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre.");
        double a = clavier.nextDouble();
        System.out.println("Veuillez entrer un autre");
        double b = clavier.nextInt();
        System.out.println(Math.max(a, b));
    }
}
