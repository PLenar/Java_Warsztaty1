package pl.coderslab.java.workshop1.Task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println(resultOfToss());
    }

    static int typeOfCube() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typy kostek występujących w grach: 3, 4, 6, 8, 10, 12, 20, 100 - ścienne. \nPodaj ilość ścian kostki, którą chcesz wykonać rzut : ");
        int[] typesOfCube = {3, 4, 6, 8, 10, 12, 20, 100};
        int typeOfCube = 0;
        while (!scanner.hasNextInt()) {
            System.out.print("Podaj ilość ścian kostki z zestawu 3, 4, 6, 8, 10, 12, 20, 100 : ");
            scanner.next();
        }
        typeOfCube = scanner.nextInt();
        for (int n : typesOfCube) {
            if (typeOfCube == n) {
                System.out.println("Wybrałeś kostkę typu D" + typeOfCube);
            } else {
                System.out.println("Wybrałeś kostkę zwyczajowo nie używaną w grach");
            }

            return typeOfCube;
        }
    }
    static int numberOfTosses() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Podaj ilość rzutów kostką: ");
        while (!scanner1.hasNextInt()) {
            System.out.println("Ilość rzutów musi być liczbą całkowitą dodatnią!");
            scanner1.next();
        }
        int numberOfTosses = scanner1.nextInt();
        return numberOfTosses;
    }

    static int modifier() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Podaj modyfikator: ");
        while (!scanner2.hasNextInt()) {
            System.out.println("Modyfikator musi być liczbą całkowitą! Podaj jeszcze raz: ");
            scanner2.next();
        }
        int modifier = scanner2.nextInt();
        return modifier;
    }

    static int resultOfToss() {
        int typeOfCube = typeOfCube();
        int numberOfTosses = numberOfTosses();
        int modifier = modifier();
        Random r = new Random();
        int resultOfToss = r.nextInt(typeOfCube + 1);
        int result = numberOfTosses * resultOfToss + modifier;
        return result;
    }
}

