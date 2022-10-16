package td4;

import  java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entiers n");
        int n = clavier.nextInt();
        int i = 1;
        System.out.println("Nombre entre 1 et" + n);
        while (i <= n) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("Nombre pairs entre 1 et " + n);
        i = 0; //Veille à redéclarer la variable i à chaque suite de nombre demandé!!
        while (i <= n) {
            if (i%2==0);
            System.out.println(i);
            i = i +2;
        }
        System.out.println("Nombre entre -n et n");
        i = -n ;
        while (i<=n) {
            System.out.println(i);
            i=i+1;
        }
        System.out.println("multiple de 5 entre 1 et n");
        i = 0;
        while (i<=n){
            System.out.println(i);
            i=i+5;
        }
        System.out.println("multiples de n compris entre 1 et 100");
        i = 0;
        while (i<=100) {
            if (i%n==0){
                System.out.println(i);
                i=i+n;
        }
        }
    }
}