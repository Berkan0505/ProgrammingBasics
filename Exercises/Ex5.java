package FirstModule.Exam25March;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boughtFood = scanner.nextInt() * 1000;
        boolean isAdopted = false;
        while (!isAdopted) {
            if (scanner.hasNextInt()) {
                int dogMealForTheDay = scanner.nextInt();
                boughtFood -= dogMealForTheDay;
            } else {
                String input = scanner.nextLine();
                if (input.equals("Adopted")) isAdopted = true;
            }
        }
        if (boughtFood >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.\n", boughtFood);
        } else
            System.out.printf("Food is not enough. You need %d grams more.\n", Math.abs(boughtFood));
    }
}
