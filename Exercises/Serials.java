package FirstModule.ExamPreparation;

import java.util.Scanner;

public class Serials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double neededMoney = 0;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String movieName = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (movieName) {
                case "Thrones": {
                    price = price * 0.50;
                    break;
                }
                case "Protector": {
                    price = price * 0.70;
                    break;
                }
                case "TotalDrama": {
                    price = price * 0.80;
                    break;
                }
                case "Lucifer": {
                    price = price * 0.60;
                    break;
                }
                case "Area": {
                    price = price * 0.90;
                    break;
                }
            }
            neededMoney += price;
        }
        if (budget >= neededMoney) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - neededMoney);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", neededMoney - budget);
        }
    }
}
