//public class Main {
//    public static void main(String[] args) {
//    // CÂU LỆNH IN THÔNG TIN RA MÀN HÌNH
//        System.out.println("Hello Kien!!!");
//
//        int x = 10;
//
//        double y = 12.9;
//        double price = 39.99;
//        double score  = 9.8;
//
//        char a = 'A';
//        char symbol = '!';
//
//
//        boolean isStudent = true;
//        boolean isOnline = false;
//        boolean forSale = true;
//
//        String name = "Duong Trung Kien";
//        System.out.println("My name is " + name);
//
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(price);
//        System.out.println(score);
//        System.out.println(symbol);
//
//        if(isOnline){
//            System.out.println("This iot system is online!");
//        } else {
//            System.out.println("This iot system is not online!");
//        }
//
//    }
//}
public class Main{
    public static void main(String[] args){
//        CarOOP car =  new CarOOP();
//        System.out.println(car);
//        System.out.println(car.model);
//        System.out.println(car.make);
//
//        car.start();
//        car.stop();
        BankAccount bank = new BankAccount("Kien", 99);

        bank.getBalance();
        bank.deposit(22);
        bank.getBalance();

        bank.withdraw(22);
        bank.getBalance();
    }
}