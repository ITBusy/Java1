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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLy {

    ArrayList<NV_HanhChanh> list;
    Scanner sc;

    public QuanLy() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }
// Nhập dữ liệu nhân viên Rồng Việt

    void nhap() {
        System.out.println("Chon loai nhan vien ");
        System.out.println("1. Nhan vien hanh chinh ");
        System.out.println("2. Nhan vien tiep thi ");
        System.out.println("3. Truong phong ");
        int type = sc.nextInt();
        switch (type) {
            case 1 -> {
                NV_HanhChanh nv = new NV_HanhChanh();
                nv.nhap();
                list.add(nv);
            }
            case 2 -> {
                NV_TiepThi nv2 = new NV_TiepThi();
                nv2.nhap();
                list.add(nv2);
            }
            case 3 -> {
                TruongPhong nv3 = new TruongPhong();
                nv3.nhap();
                list.add(nv3);
            }
        }
    }
// Xuất danh sách nhân viên Rồng Việt

    void xuat() {
        System.out.println("DANH SACH NHAN VIEN RONG VIET");

        for (NV_HanhChanh nv : list) {
            nv.xuat();
        }
    }

    /* public int timkiem(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).maso.equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }*/
// Tìm và hiện thị kết quả theo mã số nhân viên
    public boolean hienthi() {
        System.out.print("Nhap ma so can tim: ");
        String TK = sc.next();
        boolean flag = false;
        for (NV_HanhChanh sv : list) {
            if (sv.maso.equalsIgnoreCase(TK)) {
                flag = true;
                sv.xuat();
            }
        }
        return flag;
    }
// Tìm kiếm vvà xuất khoảng lương của nhân viên

    public boolean timKiemKL() {
        System.out.print("Nhap luong min: ");
        Double min = sc.nextDouble();
        System.out.print("Nhap luong max: ");
        Double max = sc.nextDouble();
        boolean flag = false;
        for (NV_HanhChanh sv : list) {
            if (sv.luong >= min && sv.luong <= max) {
                flag = true;
                System.out.println("danh sach luong tu " + min + " den " + max + " la: ");
                sv.xuat();
            }
        }
        return flag;
    }
// Tìm và cập nhật theo mã số nhân viên

    public boolean capNhat() {
        System.out.println("Nhap ma nhan vien chinh sua: ");
        String x = sc.next();
        boolean flag = false;
        for (NV_HanhChanh sv : list) {
            if (sv.maso.equalsIgnoreCase(x)) {
                flag = true;
                System.out.println("Nhap thong tin moi: ");
                System.out.println("Chon loai nhan vien: ");
                System.out.println("1. Nhan vien hanh chinh: ");
                System.out.println("2. Nhan vien tiep thi: ");
                System.out.println("3. Truong phong: ");
                int type = sc.nextInt();
                switch (type) {
                    case 1 ->
                        sv.nhap();
                    case 2 ->
                        sv.nhap();
                    case 3 ->
                        sv.nhap();
                }
            }
        }
        return flag;
    }
// Tìm và xóa theo mã số nhân viên

    public boolean Xoa() {
        System.out.println("Nhap Id nhan vien can xoa: ");
        String x = sc.next();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).maso.equalsIgnoreCase(x)) {
                flag = true;
                list.remove(i);
                System.out.println("Xoa thanh cong");
            }
        }
        return flag;
    }
// Sắp xếp theo tên nhân viên
    Comparator<NV_HanhChanh> ssTheoTen = new Comparator<NV_HanhChanh>() {
        @Override
        public int compare(NV_HanhChanh o1, NV_HanhChanh o2) {
            return o1.hoTen.compareToIgnoreCase(o2.hoTen);
        }
    };

    void sapXep() {
        Collections.sort(list, ssTheoTen);
        xuat();
    }
// Sắp xếp theo luong nhân viên
    Comparator<NV_HanhChanh> ssTheoLuong = new Comparator<NV_HanhChanh>() {
        @Override
        public int compare(NV_HanhChanh o1, NV_HanhChanh o2) {
            return (int) (o2.getThuNhap() - o1.getThuNhap());
        }
    };
    Comparator<NV_HanhChanh> ssTheoLuong1 = new Comparator<NV_HanhChanh>() {
        @Override
        public int compare(NV_HanhChanh o1, NV_HanhChanh o2) {
            return (int) (o1.getThuNhap() - o2.getThuNhap());
        }
    };

    void sapXepTL() {
        System.out.println("1. Sắp xếp tăng dần");
        System.out.println("2. Sắp xếp giảm dần");
        int options = sc.nextInt();
        switch (options) {
            case 1 -> {
                Collections.sort(list, ssTheoLuong1);
                xuat();
            }
            case 2 -> {
                Collections.sort(list, ssTheoLuong);
                xuat();
            }
            default ->
                System.out.println("Nhap sai!!");
        }

    }
// Top 5 theo thu nhập của nhân viên

    void top5() {
        int top = 5;
        if (top > list.size()) {
            top = list.size();
        }
        for (int i = 0; i < top; i++) {
            Collections.sort(list, ssTheoLuong);
            NV_HanhChanh nv = list.get(i);
            nv.xuat();
        }
    }
}
