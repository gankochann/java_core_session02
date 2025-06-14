import java.util.Scanner;

public class session02_baitap01 {
    public static void main(String[] args) {
        /*Nhập một số nguyên từ bàn phím.
        Sử dụng câu lệnh if-else để xác định số đó là chẵn hay lẻ.
        Trường hợp số là 0, hiển thị thông báo: "Số không phải chẵn cũng không phải lẻ".*/

        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap vao mot so nguyen n:");
        int n = sc.nextInt();
        //kiem tra dieu kien

        if(n == 0) {
            System.out.println("so ban nhap vao khong la so chan cung khong la so le");
        } else if (n % 2 == 0) {
            System.out.println("so ban nhap " + n + " la so chan");
        } else {
            System.out.println("so ban nhap " + n + " la so le");
        }

    }
}
