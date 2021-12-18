/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_7;

import java.util.Scanner;

/**
 *
 * @author A
 */
public abstract class SinhVienPoly_B2 {

    String nganhHoc;
    String hoTen;

    public SinhVienPoly_B2() {
    }

    public SinhVienPoly_B2(String nganhHoc, String hoTen) {
        this.nganhHoc = nganhHoc;
        this.hoTen = hoTen;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten");
        hoTen = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("-------------------------");
        System.out.println(hoTen);
        System.out.println(nganhHoc);
        System.out.println(getdiemTB());
        System.out.println(getHocLuc());
        System.out.println("-------------------------");

    }

    abstract double getdiemTB();

    String getHocLuc() {
        if (getdiemTB() >= 8.0) {
            return "Gioi";
        } else if (getdiemTB() >= 6.5) {
            return "kha";
        } else if (getdiemTB() >= 5.0) {
            return "Trung Binh";
        } else {
            return "yeu";
        }
    }
}
