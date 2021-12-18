/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_thi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author A
 */
public class Bai_1 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mang");
        n = sc.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < ar.length; i++) {
            System.out.printf("Arrays[%d] = ", i);
            ar[i] = sc.nextInt();
        }
        giamDan(ar);
        Odd(ar, n);
    }

    public static void giamDan(int ar[]) {
        int temp = ar[0];
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        System.out.println(">>Danh sach cac phan tu<<");
//        for(double xuat : ar){
//            System.out.println(xuat);
//        } cach 1

        System.out.println("ar"+Arrays.toString(ar)); //cach 2
    }

    public static void Odd(int ar[], int n) {
        double sum = 0, count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] >= 5) {
                sum += ar[i];
                count++;
            }
        }

        double avg = sum / count;
        System.out.printf("Trung bình cộng các số lớn hơn 5 của mảng là: %.1f\n", avg);
    }
}
