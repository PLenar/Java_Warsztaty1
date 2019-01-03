package pl.coderslab.java.workshop1.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w max. 10 próbach.");
        int min = 0;
        int max = 1000;
        int answer = 0;
        while (answer != 3) {
            int guess = ((max - min) / 2) + min;
            System.out.println("Zgaduję: " + guess);
            answer = resultOfGuessing();
            switch (answer) {
                case 1:
                    max = guess;
                    break;
                case 2:
                    min = guess;
                    break;
                case 3:
                    System.out.println("Wygrałem! :)");
                    break;
                default:
                    System.out.println("Nie oszukuj!");
            }

        }
    }

    static int resultOfGuessing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj odpowiedź: \n 1) za dużo \n 2) za mało \n 3) zgadłeś! ");
        int result = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Wybierz odpowiedź 1, 2 lub 3 : ");
            scanner.next();
        }
        result = scanner.nextInt();
        return result;
    }

}
