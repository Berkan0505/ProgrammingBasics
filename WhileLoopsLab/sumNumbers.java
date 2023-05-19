package FirstModule.WhileLoopsLab;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numbers = 0;

        while (numbers < n) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            numbers += currentNum;
        }
        System.out.println(numbers);
    }
}
