package exercices.exercice02_jour_semaine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("NB: Chaque chiffres correspond a un jour de la semaine");
        System.out.println("Bienvenue ! Entrez un chiffre entre 1 et 7");
        Scanner input = new Scanner(System.in);
        int chiffre = input.nextInt();

        if (chiffre == 1) {
            System.out.println("Lundi");
        } else if (chiffre == 2) {
            System.out.println("Mardi");
        } else if (chiffre == 3) {
            System.out.println("Mercredi");
        } else if (chiffre == 4) {
            System.out.println("Jeudi");
        } else if (chiffre == 5) {
            System.out.println("Vendredi");
        } else if (chiffre == 6) {
            System.out.println("Samedi");
        } else if (chiffre == 7) {
            System.out.println("Dimanche");
        } else {
            System.out.println("Veuillez entrer un chiffre entre 1 et 7");
        }

    }
}
