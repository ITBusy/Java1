/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_7;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author A
 */
public class hinhChuNhat_B1 {

    double chieuDai;
    double chieuRong;

    public hinhChuNhat_B1() {
        chieuDai = 2;
        chieuRong = 1;
    }

    public hinhChuNhat_B1(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu dai: ");
        chieuDai = sc.nextDouble();
        System.out.println("Chieu rong: ");
        chieuRong = sc.nextDouble();
    }

    double getChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    double getDienTich() {
        return chieuDai * chieuRong;
    }

    public void Xuat() {
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Dien tich: " + getDienTich());
    }
}
