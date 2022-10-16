package td3;

import java.util.Scanner;

public class exerice1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrer votre âge.");
        int age = clavier.nextInt();
        if(age>=18) {
            System.out.println("Vous êtes majeur!!");
        } else{
            System.out.println("Vous êtes mineur!");
            }
        }
    }

