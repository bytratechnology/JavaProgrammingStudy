import java.util.Scanner;

public class CompundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền ban đầu
        System.out.print("Nhap so tien ban dau: ");
        double principal = scanner.nextDouble();

        // Nhập lãi suất (% / năm)
        System.out.print("Nhap lai suat (%): ");
        double rate = scanner.nextDouble();

        // Nhập số lần ghép lãi mỗi năm
        System.out.print("Nhap so lan ghep lai moi nam: ");
        int times = scanner.nextInt();

        // Nhập số năm
        System.out.print("Nhap so nam: ");
        int years = scanner.nextInt();

        // Công thức lãi kép
        double amount = principal
                * Math.pow(1 + (rate / 100) / times, times * years);

        // Tiền lãi
        double interest = amount - principal;

        // Kết quả
        System.out.println("\n===== KET QUA =====");

        System.out.println("So tien ban dau: " + principal);
        System.out.println("Lai suat: " + rate + "%");
        System.out.println("So nam: " + years);
        System.out.println("Tien lai: " + interest);
        System.out.println("Tong so tien: " + amount);

        scanner.close();
    }
}