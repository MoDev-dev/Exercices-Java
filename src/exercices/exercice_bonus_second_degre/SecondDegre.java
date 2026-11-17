package exercices.exercice_bonus_second_degre;

import java.util.Scanner;

public class SecondDegre {
    static void main() {
        //equation du second degre
        Scanner clavier = new Scanner(System.in);
        double a, b, c;
        double x;
        double x0;
        double x1;
        double x2;
        double delta;
        System.out.println("Equation du second degre");

        System.out.println("Entrer la valeur de a");
        a= clavier.nextDouble();

        System.out.println("Entrer la valeur de b");
        b= clavier.nextDouble();

        System.out.println("Entrer la valeur de c");
        c= clavier.nextDouble();

        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("Infinite de solution");
                } else {
                    System.out.println("Pas de solution");
                }
            }else {
                System.out.println("Equation du premier degre");
                 x = -c/b;
                 System.out.printf("la solution est: x= %.2f",x);
            }
        }else {
            System.out.println("Equation du second degre");
            delta = b*b -4*a*c;
            if (delta > 0){
                x1 = (-b - Math.sqrt(delta))/(2*a);
                x2 = (-b + Math.sqrt(delta))/(2*a);
                System.out.printf("La solution est: x= %.2f ",x1);
                System.out.printf("La solution est: x= %.2f ",x2);

            } else if (delta == 0) {
                System.out.println("Une solution double");
                x0 = -b/(2*a);
                System.out.printf("La solution est: x0= %.2f",x0);
            } else {
                System.out.println("Pas solution dans R");
            }
        }
    clavier.close();
    }
}
