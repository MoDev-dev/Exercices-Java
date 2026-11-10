package exercices.exercice04_nombres_pairs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre :");
        int nombre = sc.nextInt();

        if(nombre <= 1){
            System.out.println("Il n'existe aucun nombre pair entre 1 et " + nombre);
        }
        for (int i = 1; i <= nombre; i++) {
            int reste = i % 2;
            if (reste == 0) {
                System.out.println(i);
            }
        }
    }
}
