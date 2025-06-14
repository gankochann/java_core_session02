import java.util.Scanner;

public class session02_baitap03 {
    public static void main(String[] args) {
    /*Viết chương trình Java để tính tổng các số từ 1 đến một số nguyên dương N được nhập vào từ người dùng.
     Chương trình sẽ sử dụng vòng lặp for để tính tổng, sau đó in kết quả ra màn hình.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao 1 so nguyen duong");
        int n = sc.nextInt();
        int tong = 0;

        //su dung vong lap for de tinh tong cac so
        for (int i = 1 ; i <= n ; i++){
            tong += i;
        }
        System.out.println("tong cac so tu 1 den " + n + " la: " + tong);
    }
}
