package FirstModule.WhileLoopsLab;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int numbers = Integer.parseInt(input);
            if (minNumber > numbers) {
                minNumber = numbers;
            }

            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
