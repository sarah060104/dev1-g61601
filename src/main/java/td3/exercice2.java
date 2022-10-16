package td3;

import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entre un nombre entier");
        int a = clavier.nextInt();
        if(a % 2 == 0) {
            System.out.println("Ce nombre est pair.");
        } else {
            System.out.println("Ce nombre est impair.");
        }
    }
}
