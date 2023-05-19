package FirstModule.ExamPreparation;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String cinemaType = scanner.nextLine();
        int boughtTickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;


        if (movieName.equals("A Star Is Born")) {
            switch (cinemaType) {
                case "normal": {
                    ticketPrice = boughtTickets * 7.50;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
                case "luxury": {
                    ticketPrice = boughtTickets * 10.50;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
                case "ultra luxury": {
                    ticketPrice = boughtTickets * 13.50;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
            }
        } else if (movieName.equals("Bohemian Rhapsody")) {
            switch (cinemaType) {
                case "normal": {
                    ticketPrice = boughtTickets * 7.35;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
                case "luxury": {
                    ticketPrice = boughtTickets * 9.45;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
                case "ultra luxury": {
                    ticketPrice = boughtTickets * 12.75;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
            }
        } else if (movieName.equals("Green Book")) {
            switch (cinemaType) {
                case "normal": {
                    ticketPrice = boughtTickets * 8.15;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
                case "luxury": {
                    ticketPrice = boughtTickets * 10.25;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
                case "ultra luxury": {
                    ticketPrice = boughtTickets * 13.25;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
            }
        } else {
            switch (cinemaType) {
                case "normal": {
                    ticketPrice = boughtTickets * 8.75;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
                case "luxury": {
                    ticketPrice = boughtTickets * 11.55;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
                case "ultra luxury": {
                    ticketPrice = boughtTickets * 13.95;
                    System.out.printf("%s -> %.2f lv.", movieName, ticketPrice);
                    break;
                }
            }
        }
    }
}
