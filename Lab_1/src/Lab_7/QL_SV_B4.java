/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_7;

/**
 *
 * @author A
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QL_SV_B4 {

    ArrayList<SinhVienPoly_B2> list;
    Scanner sc;

    public QL_SV_B4() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void Nhap() {
        System.out.println("Nhap sinh vien poly, chon loai sv");
        System.out.println("1. Sinh vien CNTT");
        System.out.println("2. Sinh vien kinh te");
        int options = sc.nextInt();
        switch (options) {
            case 1:
                SinhVienIT_B3 sv = new SinhVienIT_B3();
                sv.Nhap();
                list.add(sv);
                break;
            case 2:
                SinhVienBiz_B3 sv2 = new SinhVienBiz_B3();
                sv2.Nhap();
                list.add(sv2);
                break;
        }
    }

    public void Xuat() {
        System.out.println("Danh sach sinh vien");
        for (SinhVienPoly_B2 sv : list) {
            sv.Xuat();
        }
    }
    Comparator<SinhVienPoly_B2> ss = new Comparator<SinhVienPoly_B2>(){
        @Override
        public int compare(SinhVienPoly_B2 o1, SinhVienPoly_B2 o2) {
            return (int) (o2.getdiemTB() - o1.getdiemTB());
        }   
    };


    public void SapXep() {
        Collections.sort(list, ss);
        Xuat();
    }

}
