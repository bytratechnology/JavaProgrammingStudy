import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperature;
        double convertedTemperature;
        int choice;

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius → Fahrenheit");
        System.out.println("2. Fahrenheit → Celsius");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        temperature = scanner.nextDouble();

        if (choice == 1) {
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf(
                    "%.2f °C = %.2f °F%n",
                    temperature,
                    convertedTemperature
            );
        } else if (choice == 2) {
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf(
                    "%.2f °F = %.2f °C%n",
                    temperature,
                    convertedTemperature
            );
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}