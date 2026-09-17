package util;

import java.util.Scanner;

public class InputValidator {

    public static int getPositiveInt(Scanner scanner, String message) {

        while (true) {

            System.out.print(message);
            String input = scanner.nextLine();

            try {

                int value = Integer.parseInt(input);

                if (value > 0) {
                    return value;
                }

                System.out.println("Please enter a positive number.");

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number.");
            }
        }
    }

    public static double getPercentage(Scanner scanner, String message) {

        while (true) {

            System.out.print(message);
            String input = scanner.nextLine();

            try {

                double value = Double.parseDouble(input);

                if (value >= 0 && value <= 100) {
                    return value;
                }

                System.out.println("Value must be between 0 and 100.");

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number.");
            }
        }
    }
}