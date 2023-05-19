package FirstModule.NestedLoopsLab;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;
        int x1 = 0;
        int x2 = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    isFound = true;
                    x1 = i;
                    x2 = j;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, x1, x2, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
