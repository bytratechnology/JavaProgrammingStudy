import java.util.Scanner;

public class MadLibGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.println("\n--- Your Story ---");

        System.out.println(
                "One day, " + name +
                        " saw a " + adjective + " " + animal +
                        " at " + place + "."
        );

        System.out.println(
                "The " + animal +
                        " started to " + verb + " everywhere!"
        );

        scanner.close();
    }
}
