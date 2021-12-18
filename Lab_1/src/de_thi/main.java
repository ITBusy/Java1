/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_thi;

import java.util.ArrayList;

/**
 *
 * @author A
 */
public class main {

    public static void main(String[] args) {
        ArrayList<sanpham> arrays = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            sanpham nv = new sanpham();
            nv.Nhap();
            arrays.add(nv);
        }
        for (sanpham x : arrays) {
            System.out.println("----------------------------");
            x.xuat();
        }
        System.out.println("----------------------------");

    }
}
