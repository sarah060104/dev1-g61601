package td2;

import java.util.Scanner;

public class exercice5 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la valeur de a.");
        int a = clavier.nextInt();
        System.out.println("Entrez la valeur de b.");
        int b = clavier.nextInt();

        System.out.println("a+b=..");
        System.out.println(a+b);
        System.out.println("a-b=..");
        System.out.println(a-b);
        System.out.println("a*b");
        System.out.println(a*b);
        System.out.println("a/b");
        System.out.println(a/b);
    }
}
