public class ConditionStatement {
    public static void main(String args[]) {
        int age = 20;

        if (age < 18) {
            System.out.println("Ban chua du tuoi xem phim");
        } else {
            System.out.println("Ban da du tuoi xem phim");
        }

        int score = 8;

        if (score >= 9) {
            System.out.println("Xuat sac");
        } else if (score >= 8) {
            System.out.println("Gioi");
        } else if (score >= 6.5) {
            System.out.println("Kha");
        } else if (score >= 5) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Yeu");
        }
    }
}
