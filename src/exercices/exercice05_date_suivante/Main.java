package exercices.exercice05_date_suivante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jour;
        int mois;
        int annee;

        System.out.println("Veuillez saisir le numéro de jour");
        jour = input.nextInt();
        System.out.println("Veuillez saisir le numéro de mois");
        mois = input.nextInt();
        System.out.println("Veuillez saisir l'année");
        annee = input.nextInt();
        System.out.printf("la date saisie est: %02d/%02d/%d %n", jour, mois, annee);

        int nbrjour;

        switch (mois) {
            case 1, 3, 5, 7, 8, 10, 12 -> nbrjour = 31;
            case 4, 6, 9, 11 -> nbrjour = 30;
            case 2 -> {
                if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0)) {
                    nbrjour = 29;
                } else {
                    nbrjour = 28;
                }
            }
            default -> nbrjour = 0;

        }
        if (jour == 31 && mois == 12) {
            jour = 1;
            mois = 1;
            annee++;
            System.out.printf("La date suivante est: %02d/%02d/%d%n", jour, mois, annee);

        } else {
            if (mois >= 1 && mois <= 12 && jour >= 1 && jour <= nbrjour) {
                jour++;

                if (jour > nbrjour) {
                    jour = 1;
                    mois++;

                }
                System.out.printf("La date suivante est: %02d/%02d/%d%n", jour, mois, annee);
            } else {
                System.out.println("Date invalide. Veuillez vérifier le jour et le mois saisis.");
            }
        }

    }
}