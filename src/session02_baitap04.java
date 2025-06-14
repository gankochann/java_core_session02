import java.util.Scanner;

public class session02_baitap04 {
    public static void main(String[] args) {
    /*Bài toán yêu cầu tạo biến age để lưu giá trị nhập vào từ người dùng ,
     nếu người dùng nhập một chuỗi , một số âm  hoặc để trống ,
     tóm lại là không phải một số nguyên thì cho người dùng nhập lại đến khi nào nhập đúng một số nguyên thì thôi
     và sau đó in ra dòng chữ : “ Tuổi của bạn là [age] ! “*/

        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao so tuoi cua ban");
        int age = sc.nextInt();
        while (age <= 0 ){
            System.out.println("vui long nhap vao so nguyen duong");
            age = sc.nextInt();
        }
        System.out.println("tuoi cua ban la : " + age);
    }
}
