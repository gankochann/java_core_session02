import java.util.Scanner;

public class session02_baitap06 {
    public static void main(String[] args) {
        /*Đầu vào:
        Một số nguyên N, có thể âm hoặc dương, được nhập từ bàn phím.
        Xử lý:
        Nếu số là âm, chuyển nó thành số dương.
        Sử dụng vòng lặp để tách từng chữ số của N (lấy phần dư khi chia 10).
        Cộng các chữ số lại để tính tổng.
        In ra tổng của các chữ số.
        Đầu ra:
        Hiển thị tổng các chữ số của N.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap vao mot so nguyen");
        int n = sc.nextInt();

        int sum = 0;

        while (n % 10 != 0){
            sum = sum + (n % 10);
            n = n / 10;
        }

        System.out.println("tong cac so ban nhap " + n + " bang : " + sum);
    }
}
