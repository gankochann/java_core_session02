import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            /*  Dưới 5 triệu: Thu nhập thấp
            5-15 triệu: Thu nhập trung bình
            15-50 triệu: Thu nhập khá
            Trên 50 triệu: Thu nhập cao*/
        double count = 0;
        double tongLuong = 0;
        double min = 500000001;
        double max = 0;
        double bonus = 0;
        double tongThuong = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("********MENU********");
            System.out.println("1. nhap luong nhan vien");
            System.out.println("2. hien thi thong ke");
            System.out.println("3. tinh tong tien thuong nhan vien");
            System.out.println("4. thoat");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println("lua chon cua ban la :" + choice);
            switch (choice) {
                case 1: {
                    while (true) {
                        System.out.println("moi nhap vao luong nhan vien (nhap -1 de thoat");
                        double luong = Double.parseDouble(sc.nextLine());

                        if(luong == -1) {
                            break;
                        }
                        if (luong < 0 || luong > 500000000) {
                            System.out.println("luong ban nhap vao khong dung, vui loing nhap lai:");

                        }else {
                            if(luong < 5000000) {
                                System.out.println("luong cua ban: " + luong + " la thu nhap thap");
                                bonus = luong * 0.05;
                            }else if (luong >= 5000000 && luong < 15000000) {
                                System.out.println("luong cua ban: " + luong + " o muc trung binh");
                                bonus = luong * 0.1;
                            }else if (luong >= 15000000 && luong < 50000000) {
                                System.out.println("luong cua ban: " + luong + " o muc kha");
                                bonus = luong * 0.15;
                            }else if(luong>=50000000 && luong < 100000000){
                                System.out.println("luong cua ban: " + luong + " o muc cao");
                                bonus = luong * 0.2;
                            }else if(luong>=100000000){
                                System.out.println("luong cua ban: " + luong + " o muc cao");
                                bonus = luong * 0.25;
                            }
                            count++;
                            tongLuong += luong;
                            tongThuong += bonus;
                            if(max < luong) {
                                max = luong;
                            };
                            if(min > luong){
                                min = luong;
                            };
                        }
                    }
                    break;

                }
                case 2: {
                    System.out.println("*****thong ke*****");
                    System.out.println("so nhan vien: " + count);
                    System.out.println("tong luong bang : " + tongLuong);
                    System.out.println("luong trung binh :" + (tongLuong / count));
                    System.out.println("luong cao nhat: " + max);
                    System.out.println("luong thap nhat: " + min);
                    break;
                }
                case 3 : {
                    System.out.println("****ting tong tien thuong cho nhan vien*****");
                    System.out.println("tong tien thuong cho nhan vien : " + tongThuong);
                    break;
                }
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}