package td3;

import java.util.Scanner;

public class exercice5 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entier pour a.");
        int a = clavier.nextInt();
        System.out.println("Veuillez entrer un nombre entier pour b.");
        int b = clavier.nextInt();
        System.out.println("Veuillez entrer un nombre entier pour c.");
        int c = clavier.nextInt();
        System.out.println("a est-il pair");
        System.out.println(a%2==0);

        System.out.println("a est-il impair");
        System.out.println(a%2==1);

        System.out.println("a est-til divisble par b");
        System.out.println(a%b==0);

        System.out.println("a est-il inférieur à b");
        System.out.println(a<b);

        System.out.println(" a est égal/inférieur à b et c");
        System.out.println((a<=b)&&(a<=c));
    }
}
