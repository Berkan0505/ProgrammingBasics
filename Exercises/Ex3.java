package FirstModule.Exam25March;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sweetType = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int dayOfMonth = Integer.parseInt(scanner.nextLine());

        double cakePrice, soufflePrice, baklavaPrice;
        if (dayOfMonth <= 15) {
            cakePrice = 24.0;
            soufflePrice = 6.66;
            baklavaPrice = 12.6;
        } else {
            cakePrice = 28.7;
            soufflePrice = 9.8;
            baklavaPrice = 16.98;
        }

        double totalPrice = 0;
        switch (sweetType) {
            case "Cake":
                totalPrice = quantity * cakePrice;
                break;
            case "Souffle":
                totalPrice = quantity * soufflePrice;
                break;
            case "Baklava":
                totalPrice = quantity * baklavaPrice;
                break;
            default:
                System.out.println("Invalid sweet type");
                break;
        }
        if (dayOfMonth <= 22) {
            double discount = 0;
            if (totalPrice >= 100 && totalPrice < 200) {
                discount = 0.15 * totalPrice;
            } else if (totalPrice >= 200) {
                discount = 0.25 * totalPrice;
            }
            totalPrice = totalPrice - discount;
            if (dayOfMonth <= 15) {
                totalPrice = totalPrice * 0.9;
            }
        }
        System.out.printf("%.2f", totalPrice);
    }
}