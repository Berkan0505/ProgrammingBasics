package FirstModule.FirstPrograms;

import java.util.Scanner;

public class BasketballQuipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taksa = Double.parseDouble(scanner.nextLine());
        double kecove = taksa - (taksa * 0.40);
        double ekip = kecove - (kecove * 0.20);
        double topka = ekip / 4;
        double aksesoar = topka / 5;
        double totalPrice = taksa + kecove + ekip + topka + aksesoar;
        System.out.println(totalPrice);
    }
}
