package td2;

import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre compris entre 100 et 999");
        int nb = clavier.nextInt();
        System.out.println("Valeur miroir:");
        System.out.println(nb%10);
        System.out.println((nb/10)%10);
        System.out.println((nb/100)%10);
    }
}