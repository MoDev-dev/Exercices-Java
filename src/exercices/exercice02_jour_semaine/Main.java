package exercices.exercice02_jour_semaine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("NB: Chaque chiffre correspond a un jour de la semaine");
        System.out.println("Bienvenue ! Entrez un chiffre entre 1 et 7");
        Scanner input = new Scanner(System.in);
        int chiffre = input.nextInt();

        switch(chiffre){
            case 1:
                System.out.println("Lundi");
            break;
            case 2:
                System.out.println("Mardi");
            break;
            case 3:
                System.out.println("Mercredi");
            break;
            case 4:
                System.out.println("Jeudi");
            break;
            case 5:
                System.out.println("Vendredi");
            break;
            case 6:
                System.out.println("Samedi");
            break;
            case 7:
                System.out.println("Dimanche");
            break;
            default:
                System.out.println("Chiffre invalide veuillez entrer un nombre entre 1 et 7");
        }

    }
}
