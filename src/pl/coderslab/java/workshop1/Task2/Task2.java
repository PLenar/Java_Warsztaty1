package pl.coderslab.java.workshop1.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> lottoResult = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i< 6; i++) {
            Integer randomNumber;
            do {
                randomNumber = Integer.valueOf(random.nextInt(49) + 1);
            } while (lottoResult.contains(randomNumber));
            lottoResult.add(randomNumber);
            System.out.print(randomNumber + " ");
        }
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
    static ArrayList<Integer> getLottoNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 6){
           Integer number = Integer.valueOf(getNumber("Podaj liczbę z zakresu 1-49"));
           if (number >= 1 && number <= 49 && !numbers.contains(number)) {
               numbers.add(number);
           }
        }
return numbers;
    }
}
