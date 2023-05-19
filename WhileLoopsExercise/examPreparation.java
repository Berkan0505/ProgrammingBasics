package FirstModule.WhileLoopsExercise;

import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGradesLimit = Integer.parseInt(scanner.nextLine());

        int problemsSolved = 0;
        int badGradesCount = 0;
        int totalScore = 0;
        String lastProblem = "";

        while (true) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());

            problemsSolved++;
            totalScore += grade;
            lastProblem = problemName;

            if (grade <= 4) {
                badGradesCount++;
                if (badGradesCount == badGradesLimit) {
                    System.out.printf("You need a break, %d poor grades.", badGradesCount);
                    return;
                }
            }
        }

        double averageScore = (double) totalScore / problemsSolved;
        System.out.printf("Average score: %.2f%n", averageScore);
        System.out.printf("Number of problems: %d%n", problemsSolved);
        System.out.printf("Last problem: %s", lastProblem);
    }
}
