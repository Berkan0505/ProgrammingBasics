package FirstModule.FirstPrograms;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isValid = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday");

        boolean isValid1 = day.equals("Saturday") || day.equals("Sunday");

        boolean isValid2 = fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange")
                || fruit.equals("grapefruit") || fruit.equals("kiwi") || fruit.equals("pineapple")
                || fruit.equals("grapes");


        double totalPrice = 0;

        if (isValid) {
            if (fruit.equals("banana")) {
                totalPrice = quantity * 2.50;
            }
            if (fruit.equals("apple")) {
                totalPrice = quantity * 1.20;
            }
            if (fruit.equals("orange")) {
                totalPrice = quantity * 0.85;
            }
            if (fruit.equals("grapefruit")) {
                totalPrice = quantity * 1.45;
            }
            if (fruit.equals("kiwi")) {
                totalPrice = quantity * 2.70;
            }
            if (fruit.equals("pineapple")) {
                totalPrice = quantity * 5.50;
            }
            if (fruit.equals("grapes")) {
                totalPrice = quantity * 3.85;
            }


        } else if (isValid1) {
            if (fruit.equals("banana")) {
                totalPrice = quantity * 2.70;
            }
            if (fruit.equals("apple")) {
                totalPrice = quantity * 1.25;
            }
            if (fruit.equals("orange")) {
                totalPrice = quantity * 0.90;
            }
            if (fruit.equals("grapefruit")) {
                totalPrice = quantity * 1.60;
            }
            if (fruit.equals("kiwi")) {
                totalPrice = quantity * 3.00;
            }
            if (fruit.equals("pineapple")) {
                totalPrice = quantity * 5.60;
            }
            if (fruit.equals("grapes")) {
                totalPrice = quantity * 4.20;
            }


        }


        if (totalPrice <= 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", totalPrice);
        }


    }
}

