import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double convertedWeight;
        int choice;

        System.out.println("Weight Converter");
        System.out.println("1. Pounds → Kilograms");
        System.out.println("2. Kilograms → Pounds");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        System.out.print("Enter weight: ");
        weight = scanner.nextDouble();

        if (choice == 1) {
            convertedWeight = weight * 0.453592;
            System.out.printf("%.2f lbs = %.2f kg%n", weight, convertedWeight);
        } else if (choice == 2) {
            convertedWeight = weight * 2.20462;
            System.out.printf("%.2f kg = %.2f lbs%n", weight, convertedWeight);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}