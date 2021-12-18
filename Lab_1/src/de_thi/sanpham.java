/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_thi;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class sanpham {

    String maSP, tenSP;
    double donGia;

    public sanpham() {
    }

    public sanpham(String maSP, String tenSP, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma Sp: ");
        maSP = sc.nextLine();
        System.out.println("Nhap ten Sp: ");
        tenSP = sc.nextLine();
        System.out.println("Nhap don gia Sp: ");
        donGia = sc.nextDouble();
    }

    private double getThue() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("ma san pham: " + maSP);
        System.out.println("ten san pham: " + tenSP);
        System.out.println("don gia: " + donGia);
        System.out.println("thue: " + getThue());
    }
}
