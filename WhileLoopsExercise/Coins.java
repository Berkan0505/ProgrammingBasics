package FirstModule.WhileLoopsExercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine()) * 100;
        int coins = 0;
        int[] coinValues = {200, 100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < coinValues.length; i++) {
            int coinCount = (int) (change / coinValues[i]);
            coins += coinCount;
            change -= coinCount * coinValues[i];
        }

        System.out.println(coins);
    }
}