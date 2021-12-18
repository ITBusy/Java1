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
public class SinhVienBiz_B3 extends SinhVienPoly_B2 {
    double marketting, sales;

    public SinhVienBiz_B3() {
        nganhHoc = "Biz";
    }

    public SinhVienBiz_B3(double marketting, double sales) {
        nganhHoc = "Biz";
        this.marketting = marketting;
        this.sales = sales;
    }

    @Override
    double getdiemTB() {
        return (2 * marketting + sales) / 3;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 diem marketting, sales: ");
        marketting = sc.nextDouble();
        sales = sc.nextDouble();
    }
}
