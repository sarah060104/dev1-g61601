package td4;

import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int somme = 0;
        int nbValeurs = 0;

        System.out.println("Veuillez entrez 5 valeurs.");
        while (nbValeurs<5) { //déclarer valeur dans boucle while sinon on ne peut pas faire boucle
            int valeur = clavier.nextInt();
            somme = somme + valeur;
            nbValeurs = nbValeurs + 1;
        }
        System.out.println("La somme de toutes ces valeurs est" + somme);
        System.out.println("moyenne de toutes ces valeurs =" + somme/5);
    }
}
