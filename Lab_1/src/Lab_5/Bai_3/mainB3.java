/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_5.Bai_3;

/**
 *
 * @author A
 */
import java.util.Scanner;
public class mainB3 {
    public static void main(String[] args) {
        bai3 DSSP = new bai3();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhập data");
            System.out.println("2. Xuất data");
            System.out.println("3. Sắp xếp data");
            System.out.println("4. Tìm và xóa");
            System.out.println("5. Trung bình cộng");
            System.out.println("0. Thoat\n");
            System.out.println("Nhập yêu cầu: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    DSSP.Nhap();
                    break;
                case 2:
                    DSSP.Xuat();
                    break;
                case 3:
                    DSSP.sapXep();
                    break;
                case 4:
                    DSSP.timVaXoa();
                    break;
                case 5:
                    DSSP.trungBinhCong();
                    break;
                case 0:
                    System.exit(c);
                default:
                    System.out.println("Bạn nhập sai giá đưa vào");
            }
        } while (true);
    }
}
