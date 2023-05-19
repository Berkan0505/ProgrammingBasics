package FirstModule.Exam25March;

import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfLocations = scanner.nextInt();
        for (int i = 0; i < countOfLocations; i++) {
            double expectedGoldPerDay = scanner.nextDouble();
            int days = scanner.nextInt();
            double realAverage = 0;
            for (int p = 0; p < days; p++) {
                double goldPerDay = scanner.nextDouble();
                realAverage += goldPerDay;
            }
            realAverage /= days;
            if (realAverage < expectedGoldPerDay) {
                System.out.printf("You need %.2f gold. \n", expectedGoldPerDay - realAverage);
            } else {
                System.out.printf("Good job! Average gold per day: %.2f. \n", realAverage);
            }
        }
    }
}
