public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
            System.out.println("Nap tien thanh cong!!!");
        }
    }

    public void withdraw(double amount){
        if (amount > 0){
            balance = balance - amount;
            System.out.println("Rut tien thanh cong!!!");
        }
    }

    public void getBalance(){
        System.out.println("So du hien tai: "  + balance);
    }
}
