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
public class SinhVienIT_B3 extends SinhVienPoly_B2 {

    double java, html, css;

    public SinhVienIT_B3() {
        nganhHoc = "CNTT";
    }

    public SinhVienIT_B3(double java, double html, double css) {
        nganhHoc = "CNTT";
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    double getdiemTB() {
        return (2 * java + html + css) / 4;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 diem java, html, css: ");
        java = sc.nextDouble();
        html = sc.nextDouble();
        css = sc.nextDouble();
    }
}
