package FirstModule.WhileLoopsLab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();


        String passwordForAcess = scanner.nextLine();
        while (!password.equals(passwordForAcess)) {
            passwordForAcess = scanner.nextLine();
        }
        System.out.printf("Welcome %s!\n", name);
    }
}
