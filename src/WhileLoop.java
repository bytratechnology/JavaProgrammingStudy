public class WhileLoop {

    public static void main(String[] args) {

        /*
         * ==========================================
         * WHILE LOOP
         * ==========================================
         *
         * while dùng để lặp lại code khi điều kiện
         * vẫn còn đúng (true).
         *
         * Cú pháp:
         *
         * while (condition) {
         *     // code
         * }
         *
         * Quy trình:
         *
         * 1. Kiểm tra condition
         * 2. Nếu true -> chạy code
         * 3. Cập nhật biến
         * 4. Quay lại bước 1
         * 5. Nếu false -> kết thúc
         */


        // ==========================================
        // BASIC EXAMPLE
        // ==========================================

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // ==========================================
        // BÀI 1
        // In các số từ 1 đến 100
        // ==========================================

        System.out.println("\nBài 1:");

        int number1 = 1;

        while (number1 <= 100) {
            System.out.println(number1);
            number1++;
        }


        // ==========================================
        // BÀI 2
        // In các số từ 100 về 1
        // ==========================================

        System.out.println("\nBài 2:");

        int number2 = 100;

        while (number2 >= 1) {
            System.out.println(number2);
            number2--;
        }


        // ==========================================
        // BÀI 3
        // In tất cả số chẵn từ 1 đến 100
        // ==========================================

        System.out.println("\nBài 3:");

        int number3 = 1;

        while (number3 <= 100) {

            if (number3 % 2 == 0) {
                System.out.println(number3);
            }

            number3++;
        }


        // ==========================================
        // BÀI 4
        // In tất cả số lẻ từ 1 đến 100
        // ==========================================

        System.out.println("\nBài 4:");

        int number4 = 1;

        while (number4 <= 100) {

            if (number4 % 2 != 0) {
                System.out.println(number4);
            }

            number4++;
        }


        // ==========================================
        // BÀI 5
        // Tính tổng từ 1 đến 100
        // ==========================================

        System.out.println("\nBài 5:");

        int number5 = 1;
        int sum5 = 0;

        while (number5 <= 100) {
            sum5 += number5;
            number5++;
        }

        System.out.println("Sum = " + sum5);


        // ==========================================
        // BÀI 6
        // Tính tổng các số chẵn từ 1 đến 100
        // ==========================================

        System.out.println("\nBài 6:");

        int number6 = 1;
        int sum6 = 0;

        while (number6 <= 100) {

            if (number6 % 2 == 0) {
                sum6 += number6;
            }

            number6++;
        }

        System.out.println("Sum = " + sum6);


        // ==========================================
        // BÀI 7
        // In bảng cửu chương 5
        // ==========================================

        System.out.println("\nBài 7:");

        int multiplier = 1;

        while (multiplier <= 10) {

            System.out.println(
                    "5 x " + multiplier + " = " + (5 * multiplier)
            );

            multiplier++;
        }


        // ==========================================
        // BÀI 8
        // Tính giai thừa của 5
        //
        // 5! = 5 x 4 x 3 x 2 x 1
        // ==========================================

        System.out.println("\nBài 8:");

        int number8 = 5;
        int factorial = 1;

        while (number8 >= 1) {

            factorial *= number8;

            number8--;
        }

        System.out.println("5! = " + factorial);


        // ==========================================
        // BÀI 9
        // Đếm số chữ số
        //
        // number = 12345
        // Expected = 5
        // ==========================================

        System.out.println("\nBài 9:");

        int number9 = 12345;
        int digitCount = 0;

        while (number9 != 0) {

            number9 /= 10;
            digitCount++;
        }

        System.out.println("Number of digits = " + digitCount);


        // ==========================================
        // BÀI 10
        // Đảo ngược số
        //
        // 12345 -> 54321
        // ==========================================

        System.out.println("\nBài 10:");

        int number10 = 12345;
        int reversed = 0;

        while (number10 != 0) {

            int digit = number10 % 10;

            reversed = reversed * 10 + digit;

            number10 /= 10;
        }

        System.out.println("Reversed = " + reversed);


        /*
         * ==========================================
         * BONUS
         * ==========================================
         *
         * Đếm ngược năm mới
         */

        System.out.println("\nBonus:");

        int countdown = 10;

        while (countdown >= 1) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!");


        /*
         * ==========================================
         * GHI NHỚ
         * ==========================================
         *
         * Tăng:
         *
         * i++;
         *
         * Giảm:
         *
         * i--;
         *
         * Tăng một giá trị:
         *
         * sum += number;
         *
         * Kiểm tra số chẵn:
         *
         * number % 2 == 0
         *
         * Kiểm tra số lẻ:
         *
         * number % 2 != 0
         *
         * Lấy chữ số cuối:
         *
         * number % 10
         *
         * Bỏ chữ số cuối:
         *
         * number /= 10
         *
         * Thoát vòng lặp:
         *
         * break;
         *
         * Bỏ qua lần lặp:
         *
         * continue;
         */
    }
}