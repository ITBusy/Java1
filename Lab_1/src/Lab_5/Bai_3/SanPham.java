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
import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {

    private String TenSp;
    Double DonGia;

    public SanPham() {}
    public SanPham(String TenSp, double DonGia) {
        this.TenSp = TenSp;
        this.DonGia = DonGia;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        TenSp = sc.nextLine();
        System.out.println("Nhập giá: ");
        DonGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.println(TenSp + " , " + DonGia);
    }

}
