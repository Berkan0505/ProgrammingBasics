package FirstModule.ForLoopsExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toysCount = 0;
        double moneyCount = 0;
        double allMoney = 0;
        int brother = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyCount = moneyCount + 10;
                allMoney = allMoney + moneyCount;
                brother++;
            } else {
                toysCount++;
            }
        }
        double toysSum = toyPrice * toysCount - brother;
        double totalMoney = allMoney + toysSum;
        double diff = Math.abs(washMachinePrice - totalMoney);
        if (totalMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
