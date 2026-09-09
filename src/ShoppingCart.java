import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy? ");
        String item = scanner.next();

        System.out.print("How much for each? ");
        double price = scanner.nextDouble();

        System.out.print("How many? ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.println("You bought " + quantity + " " + item);
        System.out.println("Your total " + total + "$");

        scanner.close();
    }
}
