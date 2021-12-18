/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author A
 */
public class SanPham_main {

    public static void main(String[] args) {
        ArrayList<SanPham> arr = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri can dua vao:");
        n = sc.nextInt();
        SanPham array[] = new SanPham[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = new SanPham();
            array[i].Nhap();
            arr.add(array[i]);
        }
        System.out.println(">>DANH SACH SAN PHAM CUA NOKIA<<");
        arr.forEach(Sp -> {
            Sp.Xuat();
        });
    }
}
