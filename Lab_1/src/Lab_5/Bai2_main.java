package Lab_5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author A
 */
import java.util.Scanner;

public class Bai2_main {

    public static void main(String[] args) {
        Bai_2 Prod = new Bai_2();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhập data");
            System.out.println("2. Xuất data");
            System.out.println("3. Xuất data ngau ngien");
            System.out.println("4. Sắp xếp data");
            System.out.println("5. Tìm và xóa");
            System.out.println("0. Thoat\n");
            System.out.println("Nhập yêu cầu: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    Prod.nhap();
                    break;
                case 2:
                    Prod.xuat();
                    break;
                case 3:
                    Prod.xuatNgauNhien();
                    break;
                case 4:
                    Prod.sapxep();
                    break;
                case 5:
                    Prod.xoa();
                    break;
                case 0:
                    System.exit(c);
                default:
                    System.out.println("Bạn nhập sai giá đưa vào");
            }
        } while (true);

    }
}
