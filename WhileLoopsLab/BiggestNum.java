package FirstModule.WhileLoopsLab;

import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int numbers = Integer.parseInt(input);
            if (maxNumber < numbers) {
                maxNumber = numbers;
            }

            input = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
