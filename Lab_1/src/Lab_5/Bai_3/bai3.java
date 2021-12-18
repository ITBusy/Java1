/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_5.Bai_3;
//Comparator : săp xếp theo tiêu chí

/**
 *
 * @author A
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai3 {

    ArrayList<SanPham> ds;

    public bai3() {
        ds = new ArrayList<>();
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            SanPham Sp = new SanPham();
            Sp.nhap();
            ds.add(Sp);
            String c;
            System.out.println("Ban co muon nhap them khong(y/n): ");
            c = sc.nextLine();
            if ("N".equalsIgnoreCase(c)) {
                break;
            }
        } while (true);
    }

    public void Xuat() {
//        for (SanPham s : ds) {
//            s.xuat();
//        }
        ds.forEach(s -> {
            s.xuat();
        });
    }
//    Comparator<SanPham> tieuChi = new Comparator<SanPham>() {
//        @Override
//
//        public int compare(SanPham o1, SanPham o2) {
//            return (int)(o1 .DonGia - o2  .DonGia);
//        }
//    }; hoặc
    Comparator<SanPham> tieuChi = new Comparator<SanPham>() {
        public int compare(SanPham o1, SanPham o2) {
            return (int) (o1.DonGia.compareTo(o2.DonGia));
        }
    };
   
    public void sapXep() {
        Collections.sort(ds, tieuChi);
    }

    public void timVaXoa() {
        String x;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten can xoa: ");
        x = sc.nextLine();
        for (SanPham del : ds) {
            if (del.getTenSp().equals(x)) {
                ds.remove(del);
                break;
            }
        }
    }

    public void trungBinhCong() {
        double avg = 0, sum = 0;
        for (SanPham sp1 : ds) {
            sum += sp1.getDonGia();
        }
        avg = sum / ds.size();
        System.out.println("Trung binh cong cua san pham: " + avg);
    }

}
