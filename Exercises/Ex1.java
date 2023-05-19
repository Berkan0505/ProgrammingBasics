package FirstModule.Exam25March;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBoxes = Integer.parseInt(scanner.nextLine());
        int numRolls = Integer.parseInt(scanner.nextLine());
        double glovesPrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());

        int numGloves = (int) Math.ceil(0.35 * numRolls);
        int numBrushes = (int) Math.floor(0.48 * numBoxes);

        double total = numBoxes * 21.50 + numRolls * 5.20 + numGloves * glovesPrice + numBrushes * brushPrice;
        double deliveryCost = total / 15.0;

        System.out.printf("This delivery will cost %.2f lv.", deliveryCost);
    }
}