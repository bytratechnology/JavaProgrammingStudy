import java.util.Random;


public class UtilRandom {
    public static void main(String[] args){
        Random random = new Random();

        int number;
        number =  random.nextInt(1, 6);

        double a = random.nextDouble(8, 10);

        System.out.println("You bought " + number);
        System.out.println("Your total " + a + "$");

    }
}




