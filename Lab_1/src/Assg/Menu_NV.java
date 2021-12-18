/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assg;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class Menu_NV {

    public static void main(String[] args) {
        QuanLy rongViet = new QuanLy();
        Scanner sc = new Scanner(System.in);
        int options;
        do {
            System.out.println("Chon 1 so: ");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Tìm và hiển thị nhân viên theo id");
            System.out.println("4. Xóa nhân viên theo id");
            System.out.println("5. Cập nhật thông tin nhân viên theo id");
            System.out.println("6. Tìm các nhân viên theo khoảng lương");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("10. Thoat");
            options = sc.nextInt();
            switch (options) {
                case 1 -> rongViet.nhap();
                case 2 -> rongViet.xuat();
                case 3 -> {
                    if(!rongViet.hienthi()){
                        System.out.println("Khong tim thay");
                    }
                }
                case 4 -> {
                    if(!rongViet.Xoa()){
                        System.out.println("Khong tim thay");
                    }
                }
                case 5 -> {
                    if(!rongViet.capNhat()){
                        System.out.println("Khong ton tai");
                    }
                }
                case 6 -> {
                    if(!rongViet.timKiemKL()){
                        System.out.println("Khong trong khoang luong da dua");
                    }
                }
                case 7 -> rongViet.sapXep();
                case 8 -> rongViet.sapXepTL();
                case 9 -> rongViet.top5();
                case 10 -> System.exit(0);
                default -> System.out.println("Khong nam trong menu!");
            }
        } while (true);
    }
}
