package FirstModule.FirstPrograms;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daljina = Integer.parseInt(scanner.nextLine());
        int shirocina = Integer.parseInt(scanner.nextLine());
        int visocina = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int obem = daljina * shirocina * visocina;
        double litri = obem * 0.001;
        double neobhodimiLitri = litri - (litri * percent / 100);
        System.out.println(neobhodimiLitri);
    }
}