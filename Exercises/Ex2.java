package FirstModule.Exam25March;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int processorsToProduce = Integer.parseInt(scanner.nextLine());
        int employeesCount = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int totalWorkHours = employeesCount * workDays * 8;
        int producedProcessors = (int) Math.floor(totalWorkHours / 3.0);

        double expectedIncome = processorsToProduce * 110.10;
        double actualIncome = producedProcessors * 110.10;

        if (producedProcessors >= processorsToProduce) {
            double profit = actualIncome - expectedIncome;
            System.out.printf("Profit: -> %.2f BGN", profit);
        } else {
            double losses = expectedIncome - actualIncome;
            System.out.printf("Losses: -> %.2f BGN", losses);
        }
    }
}