package FirstModule.WhileLoopsLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 1;
        double sum = 0;
        int excludedAt = 0;
        boolean isExcluded = false;

        while (grade <= 12) {
            double gradeValue = Double.parseDouble(scanner.nextLine());

            if (gradeValue >= 4.00) {
                sum += gradeValue;
                grade++;
            } else {
                excludedAt = grade;
                isExcluded = true;
                break;
            }
        }

        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, excludedAt);
        } else {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
