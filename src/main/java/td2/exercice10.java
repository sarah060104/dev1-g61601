package td2;

import java.util.Scanner;

public class exercice10 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un montant");
        int i = clavier.nextInt();
        System.out.println("Intérêt reçu après 1 an pour un montant placé en banque à du 2% d’intérêt");
        System.out.println((i*2)/100);
    }
}
