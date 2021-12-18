package Lab_6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A
 */
import java.util.ArrayList;
import java.util.Scanner;
public class SinhVien_main {
    public static void main(String[] args) {
        ArrayList<SinhVien> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin can dua vao: ");
        int a = sc.nextInt();
        SinhVien arrays[] = new SinhVien[a];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new SinhVien();
//            SinhVien s = new SinhVien();
            arrays[i].Nhap();
            arr.add(arrays[i]);
        }
        System.out.println("Danh Sach sinh vien");
        arr.forEach(sv -> {
            sv.Xuat();
        });
    }
}
