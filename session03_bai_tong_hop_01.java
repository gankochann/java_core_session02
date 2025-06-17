import java.util.Scanner;

public class session03_bai_tong_hop_01 {
    public static void main(String[] args) {
        /*Viết chương trình Java Console cho phép người dùng nhập:

·        Tên khách hàng

·        Tên sản phẩm

·        Giá sản phẩm

·        Số lượng mua

·        Khách có thẻ thành viên hay không (true/false)

        Chương trình thực hiện tính:

·        Thành tiền = giá * số lượng mua

·        Nếu là thành viên giảm 10%

·        Tính tiền VAT 8%

·        Tổng tiền thanh toán = Thành tiền – Giám giá + VAT

·        In thông tin khách hàng gồm các thông tin: Khách hàng, sản phẩm, số lượng, Đơn giá, thành tiền, giảm giá, tiền VAT,
        tổng thanh toán theo định dạng yêu cầu*/

        //khai bao bien cho nguoi dung nhap du lieu

        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao ten khach hang");
        String name = sc.nextLine();
        System.out.println("moi nhap vao ten san pham");
        String sanPham = sc.nextLine();
        System.out.println("moi nhap vao gia san pham");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("moi nhap vao so luong san pham");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("khach co the thanh vien khong");
        boolean car =  sc.nextBoolean();
        //hien thi ra man hinh

        System.out.println("============hoa don===========");
        System.out.println("khach hang: "+ name);
        System.out.println("san pham: "+ sanPham);
        System.out.println("so luong: "+ soLuong);
        System.out.println("don gia: "+ price);
        System.out.println("thanh tien: "+ (soLuong*price));

        if(car) {
            int giamGia =  (soLuong*price)/10;
            System.out.println("giam gia thanh vien (10%) : " + giamGia);
        }else
            System.out.println(" gai gia: 0");
        System.out.println("tien VAT (8%):" + ((soLuong*price)*0.08));
        System.out.println("tong thanh toan:" + ((soLuong*price) - (soLuong*price)/10 + (soLuong*price)*0.08) );

    }
}
