package FirstModule.ExamPreparation;

import java.util.Scanner;

public class Jokovic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForRacket = Double.parseDouble(scanner.nextLine());
        int racketCount = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());


        double totalPriceForRackets = priceForRacket * racketCount;
        double priceForSneaker = priceForRacket / 6;
        double totalPriceForSneakers = priceForSneaker * sneakers;
        double remaningItemsPrice = (totalPriceForRackets + totalPriceForSneakers) * 0.2;
        double totalPrice = remaningItemsPrice + totalPriceForSneakers + totalPriceForRackets;
        double jokovicPrice = totalPrice / 8;
        double sponsorPrice = totalPrice * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(jokovicPrice));
        System.out.printf("Price to be paid by sponsors %.0f\n", Math.ceil(sponsorPrice));
    }
}
