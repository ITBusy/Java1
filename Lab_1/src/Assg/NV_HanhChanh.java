/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assg;

/**
 *
 * @author A
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class NV_HanhChanh {

    String maso;
    String hoTen;
    double luong;

    public NV_HanhChanh() {
    }

    public NV_HanhChanh(String maso, String hoTen, double luong) {
        this.maso = maso;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        maso = sc.next();
        System.out.println("Nhap ho va ten: ");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.println("Nhap luong: ");
        luong = sc.nextDouble();
    }

    void xuat() {
        System.out.println("-------------------------");
        System.out.println("mã số: " + maso);
        System.out.println("Họ và Tên: " + hoTen);
        System.out.println("Lương căn bản: " + luong);
        System.out.println("Thu Nhập: " + getThuNhap());
        System.out.println("Thuế: " + getThue());
        System.out.println("-------------------------");

    }

    double getThuNhap() {
        return luong;
    }

    double getThue() {
        if (getThuNhap() <= 9000000) {
            return 0;
        } else if (getThuNhap() <= 15000000) {
            return (getThuNhap() - 9000000) * 0.1;
        } else {
            return (getThuNhap() - 15000000) * 0.12 + 6000000 * 0.1;
        }
    }
}
