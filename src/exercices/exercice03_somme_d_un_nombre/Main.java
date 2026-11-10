package exercices.exercice03_somme_d_un_nombre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        int nombre = input.nextInt();
        nombre = Math.abs(nombre);

        int somme = 0;
        while (nombre > 0) {
            int chiffre = nombre % 10;
            somme += chiffre;
            nombre = nombre / 10;
        }
        System.out.println("Somme: " + somme);

    }
}
