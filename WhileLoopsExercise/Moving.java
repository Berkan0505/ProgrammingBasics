package FirstModule.WhileLoopsExercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeVolume = width * length * height;
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int boxVolume = Integer.parseInt(input);
            freeVolume -= boxVolume;

            if (freeVolume < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeVolume));
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%d Cubic meters left.", freeVolume);
    }
}