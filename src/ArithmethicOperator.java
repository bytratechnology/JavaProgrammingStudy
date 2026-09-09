public class ArithmethicOperator {
    public static void main(String[] args) {
        // =========================================
        // 1. TOÁN TỬ SỐ HỌC
        // Arithmetic Operators
        // =========================================

        System.out.println("===== TOÁN TỬ SỐ HỌC =====");

        int a = 10;
        int b = 3;

        // Cộng
        System.out.println("a + b = " + (a + b));

        // Trừ
        System.out.println("a - b = " + (a - b));

        // Nhân
        System.out.println("a * b = " + (a * b));

        // Chia
        System.out.println("a / b = " + (a / b));

        // Chia lấy dư
        System.out.println("a % b = " + (a % b));


        // =========================================
        // 2. TOÁN TỬ SO SÁNH
        // Comparison Operators
        // =========================================

        System.out.println("\n===== TOÁN TỬ SO SÁNH =====");

        // Bằng
        System.out.println("a == b: " + (a == b));

        // Khác
        System.out.println("a != b: " + (a != b));

        // Lớn hơn
        System.out.println("a > b: " + (a > b));

        // Nhỏ hơn
        System.out.println("a < b: " + (a < b));

        // Lớn hơn hoặc bằng
        System.out.println("a >= b: " + (a >= b));

        // Nhỏ hơn hoặc bằng
        System.out.println("a <= b: " + (a <= b));


        // =========================================
        // 3. TOÁN TỬ LOGIC
        // Logical Operators
        // =========================================

        System.out.println("\n===== TOÁN TỬ LOGIC =====");

        boolean x = true;
        boolean y = false;

        // AND - Và
        System.out.println("x && y = " + (x && y));

        // OR - Hoặc
        System.out.println("x || y = " + (x || y));

        // NOT - Phủ định
        System.out.println("!x = " + (!x));
        System.out.println("!y = " + (!y));


        // =========================================
        // 4. TOÁN TỬ GÁN
        // Assignment Operators
        // =========================================

        System.out.println("\n===== TOÁN TỬ GÁN =====");

        int number = 10;

        // Gán
        System.out.println("number = " + number);

        // Cộng rồi gán
        number += 5;
        System.out.println("number += 5 → " + number);

        // Trừ rồi gán
        number -= 3;
        System.out.println("number -= 3 → " + number);

        // Nhân rồi gán
        number *= 2;
        System.out.println("number *= 2 → " + number);

        // Chia rồi gán
        number /= 4;
        System.out.println("number /= 4 → " + number);

        // Chia lấy dư rồi gán
        number %= 3;
        System.out.println("number %= 3 → " + number);
    }
}