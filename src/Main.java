import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //bai tap 1: in ra man hinh dong cua hello java;
        System.out.println("Hello Java");

        //bai tap 2: in ten tuoi len man hinh;
        System.out.printf("Xin chao, toi ten la %s , toi %s tuoi , hien dang hoc tai PTIT-HCM, que quan o %s" , "nguyen van a" , "22" , "ca mau");
        System.out.println("");


        //bai tap 3: tinh dien tich hinh tron

        //khoi tao doi tuong Scanner
        Scanner sc = new Scanner(System.in);

        //cho nguoi dung nhap du lieu
        System.out.println("moi nhap vao ban kinh hinh tron");
        double banKinh = sc.nextDouble();
        //tinh dien tich hinh tron
        double dienTich = Math.PI*banKinh*banKinh;
        //in ket qua ra man hinh
        System.out.println("dien tich hinh tron bang: " + dienTich);
        System.out.printf("dien tich hinh tron co ban kinh %.2f la : %.2f%n" , banKinh, dienTich);


        //bai tap 4: ap dung toan tu
        //khai bao 2 bien so nguyen
        int a = 5;
        int b = 10;

        //thuc hien tinh toan;
        int kqSum = a + b;
        System.out.println("kqSum: " + kqSum);
        System.out.println("gia tri cua a + b la : " + (a + b));

        int kqHieu = a - b;
        System.out.println("kqHieu: " + kqHieu);
        System.out.println("gia tri cua a - b la : " + (a - b) );

        int kqTich = a * b;
        System.out.println("kqThuong: " + kqTich);
        System.out.println("gia tri cua a * b la : " + (a * b) );

        double kqThuong =  ((double) a / b);
        System.out.println("kqThuong: " + kqThuong);
        System.out.println("gia tri cua a / b la : " + ((double)a / b) );

        int kq = a % b;
        System.out.println("kq: " + kq);

        //bai 6 tinh dien tich hcn
        System.out.println("nhap chieu dai hcn : ");
        double chieuDai =  sc.nextDouble();
        System.out.println("nhap chieu rong hcn : ");
        double chieuRong =  sc.nextDouble();

        //tinh dien tich hcn

        double dienTichHCN = chieuDai * chieuRong;
        double chuViHCn = 2 * (chieuRong + chieuRong);
        //in ket qua ra man hinh

        System.out.printf("chieu dai : %.2f va chieu rong : %.2f%n", chieuDai , chieuRong);
        System.out.printf("chu vi : %.2f va dien tich : %.2f" , chuViHCn, dienTichHCN);
        System.out.println("");

        //bai tap 5 Viết chương trình yêu cầu người dùng nhập vào hai phân số và tính tổng của chúng.
         //khai bao bien
        int x = 1;
        int y = 2;
        int z = 3;
        int w = 5;
        //phan so x/y + z/w
        int tuSo = (x * w) + (y * z);
        int mauSo = y * w ;
        //in ket qua ra man hinh

        System.out.printf("ket qua cua %d/%d + %d/%d la : %d/%d ", x, y , z, w , tuSo, mauSo );
    }
}