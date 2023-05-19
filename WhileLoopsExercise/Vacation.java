package FirstModule.WhileLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int consecutiveSpendDays = 0;
        int totalDays = 0;

        while (currentMoney < neededMoney && consecutiveSpendDays < 5) {
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            totalDays++;

            if (action.equals("save")) {
                currentMoney += amount;
                consecutiveSpendDays = 0;
            } else {
                currentMoney -= amount;
                consecutiveSpendDays++;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
            }
        }

        if (consecutiveSpendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}