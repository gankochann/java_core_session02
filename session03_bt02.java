import java.util.Scanner;

public class session03_bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khai bao cac bien tong sv, tong diem , min , max
        int totalStudents = 0;
        float totalMarks = 0;
        float maxMark = 0;
        float minMark = 10;
        do {
            System.out.println("********MENU nhap diem sinh vien*******");
            System.out.println("1. nhap diem hoc vien");
            System.out.println("2. hien thi thong ke");
            System.out.println("3. thoat");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println("lua chon cua ban la: " + choice);
            switch (choice) {
                case 1: {
                    System.out.println("vui long nhap vao diem cua ban");

                    boolean isExit = true;
                    //xu ly cac truong hop nhap vao
                    do {
                        float mark = Float.parseFloat(sc.nextLine());


                        if (mark == -1) {
                            isExit = false;
                        } else {
                            if (mark >= 0 && mark <= 10) {
                                if (mark < 5) {
                                    System.out.println("xep loai : yeu");
                                } else if (mark < 7) {
                                    System.out.println("xep loai : trung binh");
                                } else if (mark < 8) {
                                    System.out.println("xep loai : kha");
                                } else if (mark < 9) {
                                    System.out.println("xep loai : gioi");
                                } else {
                                    System.out.println("xep loai : xuat sac");
                                }

                                //tinh tong diem va tong so hs
                                totalStudents++;
                                totalMarks += mark;
                                //diem min va max
                                if (maxMark < mark) {
                                    maxMark = mark;
                                }
                                if (minMark > mark) {
                                    minMark = mark;
                                }
                            } else {
                                System.err.println("diem phai nam trong khoang 0 - 10 , vui long nhap lai");

                            }
                        }
                    } while (isExit);
                }
                break;

                case 2: {
                    //in ra thong tin
                    System.out.printf("so sinh vien : %d , tong diem : %f , diem lon nhat : %f , diem nho nhat: %f\n", totalStudents, totalMarks, maxMark, minMark);
                    break;
                }
                case 3: {
                    System.exit(0);
                }
                default:
                    System.err.println("vui long nhap lai tu 0-3");
            }
        } while (true);
    }
}
