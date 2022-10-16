package td4;

import java.util.Scanner;

public class exercice6 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez le nombre de valeurs que vous voulez introduire.");
        int nbValeursTotal = clavier.nextInt();
        int nbValeurs= 0;
        int pos = 0;
        int neg = 0;
        int nul= 0;

        System.out.println("Entrez les valeurs.");
        while (nbValeurs<nbValeursTotal) {
            int valeur = clavier.nextInt();
            if (valeur>0){
                pos = pos + 1;
            }
            else if(valeur<0) {
                neg = neg +1;
            } else {
                nul = nul +1;
            }
            nbValeurs=nbValeurs+1;
        }
        System.out.println("Nombres positifs : " + pos);
        System.out.println("Nombres négatifs : " + neg);
        System.out.println("Nombre nul : " + nul);
    }
}
