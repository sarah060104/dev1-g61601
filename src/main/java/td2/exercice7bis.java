package td2;

import java.util.Scanner;

public class exercice7bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entre 100 et 999,la valeur miroir sera affichée.");
        int nb = clavier.nextInt();
        System.out.println(nb%10);
        System.out.println((nb/10)%10);
        System.out.println((nb/100)%10);
    }

}
