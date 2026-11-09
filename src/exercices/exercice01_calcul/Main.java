package exercices.exercice01_calcul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier nombre : ");
        double a = sc.nextDouble();

        System.out.println("Veuillez saisir le second nombre : ");
        double b = sc.nextDouble();

        double somme = a + b;
        System.out.printf("la somme est : %.2f %n", somme);

        double soustraction = a - b;
        System.out.printf("la soustraction donne : %.2f %n", soustraction);

        double multiplication = a * b;
        System.out.printf("la multiplication donne : %.2f %n", multiplication);

        if (b == 0) {
            System.out.println("Echec de la << division et reste >>, le second nombre ne doit pas etre 0 ! ");
        } else {
            double division = a / b;
            System.out.printf("la division donne : %.2f %n", division);
            double reste = a % b;
            System.out.printf("le reste de la division est : %.2f %n", reste);
        }
    }
}