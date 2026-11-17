package exercices.exercice07_pgcd_ppcm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nombre1, nombre2;
        System.out.println("Calcule du Pgcd et Ppcm  ");
        System.out.println("Entrez le premier nombre : ");
        nombre1 = input.nextInt();
        System.out.println("Entrez le second nombre : ");
        nombre2 = input.nextInt();

        int pgcd = 0;
        int ppcm = 0;

        if (nombre1 <= 0 || nombre2 <= 0) {
            System.out.println("Erreur ! Entrez des nombres Strictement positifs");
        } else {
            for (int i = 1; i <= nombre1; i++) {

                if (nombre1 % i == 0 && nombre2 % i == 0) {
                    pgcd= i;
                }
            }
            ppcm = nombre1 * nombre2 / pgcd;
            System.out.printf("le pgcd est :%d %n", pgcd);
            System.out.printf("le ppcm est :%d %n", ppcm);
        }

    }
}
