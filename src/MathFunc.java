public class MathFunc {
    public static void main(String[] args) {

        // =========================================
        // 1. Math.abs()
        // Giá trị tuyệt đối
        // =========================================

        System.out.println("===== abs() =====");

        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));


        // =========================================
        // 2. Math.max()
        // Số lớn nhất
        // =========================================

        System.out.println("\n===== max() =====");

        System.out.println(Math.max(10, 20));


        // =========================================
        // 3. Math.min()
        // Số nhỏ nhất
        // =========================================

        System.out.println("\n===== min() =====");

        System.out.println(Math.min(10, 20));


        // =========================================
        // 4. Math.pow()
        // Lũy thừa
        // =========================================

        System.out.println("\n===== pow() =====");

        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(5, 2));


        // =========================================
        // 5. Math.sqrt()
        // Căn bậc hai
        // =========================================

        System.out.println("\n===== sqrt() =====");

        System.out.println(Math.sqrt(25));
        System.out.println(Math.sqrt(100));


        // =========================================
        // 6. Math.cbrt()
        // Căn bậc ba
        // =========================================

        System.out.println("\n===== cbrt() =====");

        System.out.println(Math.cbrt(27));
        System.out.println(Math.cbrt(64));


        // =========================================
        // 7. Math.round()
        // Làm tròn
        // =========================================

        System.out.println("\n===== round() =====");

        System.out.println(Math.round(5.4));
        System.out.println(Math.round(5.6));


        // =========================================
        // 8. Math.ceil()
        // Làm tròn lên
        // =========================================

        System.out.println("\n===== ceil() =====");

        System.out.println(Math.ceil(5.1));
        System.out.println(Math.ceil(5.9));


        // =========================================
        // 9. Math.floor()
        // Làm tròn xuống
        // =========================================

        System.out.println("\n===== floor() =====");

        System.out.println(Math.floor(5.1));
        System.out.println(Math.floor(5.9));


        // =========================================
        // 10. Math.random()
        // Số ngẫu nhiên từ 0.0 đến nhỏ hơn 1.0
        // =========================================

        System.out.println("\n===== random() =====");

        System.out.println(Math.random());


        // Random từ 1 đến 10
        int randomNumber = (int)(Math.random() * 10) + 1;

        System.out.println("Random 1-10: " + randomNumber);


        // =========================================
        // 11. Math.PI
        // Số PI
        // =========================================

        System.out.println("\n===== PI =====");

        System.out.println(Math.PI);


        // =========================================
        // 12. Math.E
        // Số Euler
        // =========================================

        System.out.println("\n===== E =====");

        System.out.println(Math.E);


        // =========================================
        // 13. Các hàm lượng giác
        // =========================================

        System.out.println("\n===== TRIGONOMETRY =====");

        System.out.println(Math.sin(Math.PI / 2));
        System.out.println(Math.cos(0));
        System.out.println(Math.tan(Math.PI / 4));


        // =========================================
        // 14. Chuyển độ sang radian
        // =========================================

        System.out.println("\n===== TO RADIANS =====");

        double degree = 90;

        double radian = Math.toRadians(degree);

        System.out.println("90 degrees = " + radian + " radians");


        // =========================================
        // 15. Chuyển radian sang độ
        // =========================================

        System.out.println("\n===== TO DEGREES =====");

        double radian2 = Math.PI;

        double degree2 = Math.toDegrees(radian2);

        System.out.println(Math.PI + " radians = " + degree2 + " degrees");


        // =========================================
        // BÀI TẬP TỔNG HỢP
        // =========================================

        System.out.println("\n=================================");
        System.out.println("       BAI TAP TONG HOP");
        System.out.println("=================================");

        // Cho hình tròn có bán kính
        double radius = 5;

        // Chu vi hình tròn
        double perimeter = 2 * Math.PI * radius;

        // Diện tích hình tròn
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Ban kinh: " + radius);
        System.out.println("Chu vi: " + perimeter);
        System.out.println("Dien tich: " + area);


        // =========================================
        // Tính khoảng cách giữa 2 điểm
        // A(x1, y1)
        // B(x2, y2)
        // =========================================

        double x1 = 2;
        double y1 = 3;

        double x2 = 8;
        double y2 = 7;

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2)
                        + Math.pow(y2 - y1, 2)
        );

        System.out.println("\nKhoang cach giua 2 diem: " + distance);


        // =========================================
        // Tìm số lớn nhất và nhỏ nhất
        // =========================================

        int number1 = 15;
        int number2 = 8;
        int number3 = 25;

        int max = Math.max(number1, Math.max(number2, number3));

        int min = Math.min(number1, Math.min(number2, number3));

        System.out.println("\nSo lon nhat: " + max);
        System.out.println("So nho nhat: " + min);


        // =========================================
        // Làm tròn kết quả
        // =========================================

        double price = 125.6789;

        System.out.println("\nGia tri ban dau: " + price);
        System.out.println("Lam tron: " + Math.round(price));
        System.out.println("Lam tron len: " + Math.ceil(price));
        System.out.println("Lam tron xuong: " + Math.floor(price));


        // =========================================
        // Random
        // =========================================

        int dice = (int)(Math.random() * 6) + 1;

        System.out.println("\nKet qua xuc xac: " + dice);
    }
}