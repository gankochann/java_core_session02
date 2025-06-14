import java.util.Scanner;

public class session02_baitap02 {
    public static void main(String[] args) {
        /*Yêu cầu người dùng nhập một số nguyên từ 1 đến 7.
        Dựa vào số vừa nhập, chương trình in ra tên ngày trong tuần tương ứng:
        1: Chủ nhật
        2: Thứ hai
        3: Thứ ba
        4: Thứ tư
        5: Thứ năm
        6: Thứ sáu
        7: Thứ bảy
        Nếu người dùng nhập một số không nằm trong khoảng từ 1 đến 7, hiển thị thông báo lỗi: "Số nhập vào không hợp lệ".*/


        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao mot so nguyen tu 1-7");
        int n = sc.nextInt();
        //kiem tra so n
        switch (n){
            case 1:
                System.out.println("chu nhat");
                break;
            case 2:
                System.out.println("thu hai");
                break;
            case 3:
                System.out.println("thu ba");
                break;
            case 4:
                System.out.println("thu tu");
                break;
            case 5:
                System.out.println("thu nam");
                break;
            case 6:
                System.out.println("thu sau");
                break;
            case 7:
                System.out.println("thu bay");
                break;
            default:
                System.out.println("so nhap vao khong hop le");
                break;
        }

    }
}
