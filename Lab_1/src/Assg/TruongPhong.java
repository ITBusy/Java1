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
import java.util.Scanner;

public class TruongPhong extends NV_HanhChanh {

    double luongTrachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double luongTrachNhiem, String maso, String hoTen, double luong) {
        super(maso, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong trach nhiem: ");
        luongTrachNhiem = sc.nextDouble();
    }

    @Override
    double getThuNhap() {
        return luong + luongTrachNhiem;
    }
}
