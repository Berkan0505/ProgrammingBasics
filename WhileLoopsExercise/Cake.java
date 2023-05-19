package FirstModule.WhileLoopsExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());

        int cakeSize = cakeWidth * cakeLength;

        String command = scanner.nextLine();
        int takenPieces = 0;

        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            takenPieces += pieces;

            if (takenPieces >= cakeSize) {
                System.out.printf("No more cake left! You need %d pieces more.", takenPieces - cakeSize);
                return;
            }

            command = scanner.nextLine();
        }

        System.out.printf("%d pieces are left.", cakeSize - takenPieces);
    }
}
