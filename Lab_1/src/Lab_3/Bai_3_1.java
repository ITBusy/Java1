/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class Bai_3_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng mảng:");
        int n = sc.nextInt();
        int mang[] = new int[n];
        System.out.println("Nhập giá trị mảng:");
        for (int i = 0; i < mang.length; i++) {
            mang[i] = sc.nextInt();
        } 
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (min > mang[i]) {
                min = mang[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang: "+min);
    }
    
}
