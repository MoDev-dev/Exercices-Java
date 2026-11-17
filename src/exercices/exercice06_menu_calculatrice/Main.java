package exercices.exercice06_menu_calculatrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choix;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Sustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Quitter");
            choix = input.nextInt();

            switch (choix) {
                case 1 -> {
                    System.out.println("Entrez le premier nombre --> ");
                    double nombre1 = input.nextDouble();
                    System.out.println("Entrez le second nombre --> ");
                    double nombre2 = input.nextDouble();
                    double resultat = nombre1 + nombre2;
                    System.out.printf("Résultat : %.2f %n", resultat);
                }
                case 2 -> {
                    System.out.println("Entrez le premier nombre --> ");
                    double nombre1 = input.nextDouble();
                    System.out.println("Entrez le second nombre --> ");
                    double nombre2 = input.nextDouble();
                    double resultat = nombre1 - nombre2;
                    System.out.printf("Résultat : %.2f %n", resultat);
                }
                case 3 -> {
                    System.out.println("Entrez le premier nombre --> ");
                    double nombre1 = input.nextDouble();
                    System.out.println("Entrez le second nombre --> ");
                    double nombre2 = input.nextDouble();
                    double resultat = nombre1 * nombre2;
                    System.out.printf("Résultat : %.2f %n", resultat);
                }
                case 4 -> {
                    System.out.println("Entrez le premier nombre --> ");
                    double nombre1 = input.nextDouble();
                    System.out.println("Entrez le second nombre --> ");
                    double nombre2 = input.nextDouble();
                    if(nombre2 == 0){
                        System.out.println("Le second nombre doit etre different de 0");
                    }else {
                        double resultat = nombre1 / nombre2;
                        System.out.printf("Résultat : %.2f %n", resultat);
                    }
                }
                case 0 -> {
                    System.out.println("Fin du Programme !");
                }
                default -> {
                    System.out.println("Choix invalide.");
                }
            }
        } while (choix != 0);
    }
}
