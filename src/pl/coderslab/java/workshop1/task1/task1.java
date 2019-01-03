package pl.coderslab.java.workshop1.task1;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int number = -1;
        int attempts = 0;

        if (args.length > 0 && args[0].equals("iddqd")) { //== "GOOD MODE"
            System.out.println(String.format("*** wylosowana liczba: %d", random));
        }

        do {
            number = getNumber("Podaj liczbe: ");

            if (number > randomNumber) {
                System.out.println("Za dużo!");
            } else if (number < randomNumber) {
                System.out.println("Za mało!");
            }
            attempts++;
        } while (randomNumber != number);
        System.out.println(String.format("Zgadłeś w %d próbach!", attempts));

    }

    static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("To nie jest liczba!");
            System.out.print(prompt);
        }
        return scanner.nextInt();

    }
}
