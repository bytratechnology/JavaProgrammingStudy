public class StringMethods {
    public static void main(String[] args) {

        String text = "Hello Java";
        // =========================================
        // 1. LENGTH
        // Độ dài chuỗi
        // =========================================

        System.out.println("===== LENGTH =====");

        System.out.println(text.length());


        // =========================================
        // 2. CHARAT
        // Lấy ký tự tại vị trí
        // =========================================

        System.out.println("\n===== CHARAT =====");

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(6));


        // =========================================
        // 3. TO UPPER CASE
        // Chuyển thành chữ hoa
        // =========================================

        System.out.println("\n===== TO UPPER CASE =====");

        System.out.println(text.toUpperCase());


        // =========================================
        // 4. TO LOWER CASE
        // Chuyển thành chữ thường
        // =========================================

        System.out.println("\n===== TO LOWER CASE =====");

        System.out.println(text.toLowerCase());


        // =========================================
        // 5. EQUALS
        // So sánh chuỗi
        // =========================================

        System.out.println("\n===== EQUALS =====");

        String language = "Java";

        System.out.println(language.equals("Java"));
        System.out.println(language.equals("Python"));


        // =========================================
        // 6. EQUALS IGNORE CASE
        // Không phân biệt hoa thường
        // =========================================

        System.out.println("\n===== EQUALS IGNORE CASE =====");

        System.out.println(language.equalsIgnoreCase("java"));
        System.out.println(language.equalsIgnoreCase("JAVA"));


        // =========================================
        // 7. CONTAINS
        // Kiểm tra chuỗi có chứa hay không
        // =========================================

        System.out.println("\n===== CONTAINS =====");

        System.out.println(text.contains("Java"));
        System.out.println(text.contains("Python"));


        // =========================================
        // 8. STARTS WITH
        // Kiểm tra chuỗi bắt đầu bằng
        // =========================================

        System.out.println("\n===== STARTS WITH =====");

        System.out.println(text.startsWith("Hello"));
        System.out.println(text.startsWith("Java"));


        // =========================================
        // 9. ENDS WITH
        // Kiểm tra chuỗi kết thúc bằng
        // =========================================

        System.out.println("\n===== ENDS WITH =====");

        System.out.println(text.endsWith("Java"));
        System.out.println(text.endsWith("Hello"));


        // =========================================
        // 10. INDEX OF
        // Tìm vị trí xuất hiện
        // =========================================

        System.out.println("\n===== INDEX OF =====");

        System.out.println(text.indexOf("Java"));
        System.out.println(text.indexOf("a"));


        // =========================================
        // 11. LAST INDEX OF
        // Tìm vị trí cuối cùng
        // =========================================

        System.out.println("\n===== LAST INDEX OF =====");

        System.out.println(text.lastIndexOf("a"));


        // =========================================
        // 12. SUBSTRING
        // TƯƠNG ĐƯƠNG SLICING
        // =========================================

        System.out.println("\n===== SUBSTRING =====");

        // Python:
        // text[0:5]

        // Java:
        // substring(0, 5)

        System.out.println(text.substring(0, 5));


        // Python:
        // text[6:]

        // Java:
        // substring(6)

        System.out.println(text.substring(6));


        // =========================================
        // 13. SLICING TỪ ĐẦU CHUỖI
        // =========================================

        System.out.println("\n===== SLICING FROM START =====");

        String name = "Nguyen Van An";

        // Lấy từ vị trí 0 đến 6
        System.out.println(name.substring(0, 6));

        // Lấy từ vị trí 7 đến hết
        System.out.println(name.substring(7));


        // =========================================
        // 14. SLICING KÝ TỰ CUỐI
        // =========================================

        System.out.println("\n===== SLICING FROM END =====");

        String word = "Programming";

        // Lấy 3 ký tự cuối
        System.out.println(
                word.substring(word.length() - 3)
        );


        // =========================================
        // 15. SLICING 2 KÝ TỰ ĐẦU
        // =========================================

        System.out.println("\n===== FIRST 2 CHARACTERS =====");

        System.out.println(
                word.substring(0, 2)
        );


        // =========================================
        // 16. SLICING 3 KÝ TỰ CUỐI
        // =========================================

        System.out.println("\n===== LAST 3 CHARACTERS =====");

        System.out.println(
                word.substring(word.length() - 3)
        );


        // =========================================
        // 17. REPLACE
        // Thay thế chuỗi
        // =========================================

        System.out.println("\n===== REPLACE =====");

        String message = "I love Java";

        System.out.println(
                message.replace("Java", "Python")
        );


        // =========================================
        // 18. TRIM
        // Xóa khoảng trắng đầu và cuối
        // =========================================

        System.out.println("\n===== TRIM =====");

        String username = "   Nguyen Van An   ";

        System.out.println(username.trim());


        // =========================================
        // 19. ISEMPTY
        // Kiểm tra chuỗi rỗng
        // =========================================

        System.out.println("\n===== ISEMPTY =====");

        String emptyText = "";

        System.out.println(emptyText.isEmpty());
        System.out.println(text.isEmpty());


        // =========================================
        // 20. ISBLANK
        // Kiểm tra rỗng hoặc chỉ có khoảng trắng
        // Java 11+
        // =========================================

        System.out.println("\n===== ISBLANK =====");

        String blankText = "   ";

        System.out.println(blankText.isBlank());
        System.out.println(text.isBlank());


        // =========================================
        // 21. CONCAT
        // Nối chuỗi
        // =========================================

        System.out.println("\n===== CONCAT =====");

        String firstName = "Nguyen";
        String lastName = "An";

        System.out.println(
                firstName.concat(" ").concat(lastName)
        );


        // =========================================
        // 22. SPLIT
        // Tách chuỗi
        // =========================================

        System.out.println("\n===== SPLIT =====");

        String fruits = "Apple,Banana,Orange";

        String[] fruitList = fruits.split(",");

        for (String fruit : fruitList) {
            System.out.println(fruit);
        }


        // =========================================
        // 23. TO CHAR ARRAY
        // String -> char[]
        // =========================================

        System.out.println("\n===== TO CHAR ARRAY =====");

        String word2 = "Java";

        char[] characters = word2.toCharArray();

        for (char character : characters) {
            System.out.println(character);
        }


        // =========================================
        // 24. BÀI TẬP TỔNG HỢP
        // =========================================

        System.out.println("\n=================================");
        System.out.println("       BAI TAP TONG HOP");
        System.out.println("=================================");

        String fullName = "   Nguyen Van An   ";

        // 1. Xóa khoảng trắng
        fullName = fullName.trim();

        System.out.println("Ten: " + fullName);


        // 2. Độ dài
        System.out.println(
                "Do dai: " + fullName.length()
        );


        // 3. Chuyển thành chữ hoa
        System.out.println(
                "Chu hoa: " + fullName.toUpperCase()
        );


        // 4. Lấy tên "Nguyen"
        System.out.println(
                "Ho: " + fullName.substring(0, 6)
        );


        // 5. Lấy phần "Van An"
        System.out.println(
                "Ten dem + ten: " + fullName.substring(7)
        );


        // 6. Kiểm tra có chứa "Van"
        System.out.println(
                "Co chua Van: "
                        + fullName.contains("Van")
        );


        // 7. Kiểm tra bắt đầu bằng "Nguyen"
        System.out.println(
                "Bat dau bang Nguyen: "
                        + fullName.startsWith("Nguyen")
        );


        // 8. Kiểm tra kết thúc bằng "An"
        System.out.println(
                "Ket thuc bang An: "
                        + fullName.endsWith("An")
        );


        // 9. Tìm vị trí "Van"
        System.out.println(
                "Vi tri Van: "
                        + fullName.indexOf("Van")
        );


        // 10. Thay "An" bằng "Kien"
        System.out.println(
                "Ten moi: "
                        + fullName.replace("An", "Kien")
        );


        // =========================================
        // 25. BÀI TẬP SLICING
        // =========================================

        System.out.println("\n===== BAI TAP SLICING =====");

        String email = "student@gmail.com";

        // Lấy username
        int atPosition = email.indexOf("@");
        String username2 = email.substring(0, atPosition);

        // Lấy domain
        String domain = email.substring(atPosition + 1);

        System.out.println("Username: " + username2);
        System.out.println("Domain: " + domain);
    }
}