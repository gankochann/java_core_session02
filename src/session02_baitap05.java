import java.util.Scanner;

public class session02_baitap05 {
    public static void main(String[] args) {
        /*Sinh viên cần viết một chương trình Java thực hiện các nhiệm vụ sau:
        Yêu cầu người dùng nhập một số nguyên từ 1 đến 12 (tương ứng với tháng)
        Sử dụng cấu trúc switch-case để:
        Hiển thị tên tháng
        Hiển thị số ngày của tháng:
        Tháng 1, 3, 5, 7, 8, 10, 12: có 31 ngày
        Tháng 4, 6, 9, 11: có 30 ngày
        Tháng 2: có 28 hoặc 29 ngày
        Xử lý trường hợp người dùng nhập số không hợp lệ (không nằm trong khoảng 1-12) và hiển thị thông báo: "Tháng không hợp lệ.”*/

        Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap vao 1 so tu 1-12");
        int thang = sc.nextInt();

        switch(thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang ban nhap " + thang + " la thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang ban nhap " + thang + " la thang co 30 ngay");
                break;
            case 2:{
                System.out.println("moi nhap vao nam ban muon tim");
                int nam = sc.nextInt();
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)){
                    System.out.println("thang: " + thang + " nam: " + nam + " la thang co 29 ngay" );
                }else {
                    System.out.println("thang: " + thang + " nam: " + nam + " la thang co 28 ngay");
                }
                break;
                }
            default:
                System.out.println("thang ban nhap khong dung, vui long nhap lai");
                break;
            }

        }
    }

