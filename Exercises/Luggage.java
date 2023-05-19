package FirstModule.ExamPreparation;

import java.util.Scanner;

public class Luggage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double luggagePriceAbove20kg = Double.parseDouble(scanner.nextLine());
        double luggageKilos = Double.parseDouble(scanner.nextLine());
        int daysTillTravel = Integer.parseInt(scanner.nextLine());
        int numberOfLuggage = Integer.parseInt(scanner.nextLine());
        double luggagePrice = 0;
        double totalResult = 0;


        if (luggageKilos < 10) {
            luggagePrice = luggagePriceAbove20kg * 0.2;
        } else if (luggageKilos <= 20) {
            luggagePrice = luggagePriceAbove20kg * 0.5;
        } else {
            luggagePrice = luggagePriceAbove20kg;
        }

        if (daysTillTravel < 7) {
            luggagePrice = luggagePrice + (luggagePrice * 0.4);
        } else if (daysTillTravel <= 30) {
            luggagePrice = luggagePrice + (luggagePrice * 0.15);
        } else {
            luggagePrice = luggagePrice + (luggagePrice * 0.1);
        }

        totalResult = luggagePrice * numberOfLuggage;
        System.out.printf("The total price of bags is: %.2f lv.", totalResult);
    }
}
