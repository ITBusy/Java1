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
public class NV_TiepThi extends NV_HanhChanh {

    double DoanhSo, HoaHong;

    public NV_TiepThi() {
    }

    public NV_TiepThi(double DoanhSo, double HoaHong, String maso, String hoTen, double luong) {
        super(maso, hoTen, luong);
        this.DoanhSo = DoanhSo;
        this.HoaHong = HoaHong;
    }

    @Override
    void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap doanh so ban hang: ");
        DoanhSo = sc.nextDouble();
        System.out.println("Nhap hoa hong duoc huong: ");
        HoaHong = sc.nextDouble();
    }

    @Override
    double getThuNhap() {
        return (luong + DoanhSo) * (HoaHong / 100);
    }

    Object set(String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
