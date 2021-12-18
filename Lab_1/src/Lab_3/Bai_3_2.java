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
public class Bai_3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng mảng:");
        int n = sc.nextInt();
        int mang[] = new int[n];
        System.out.println("Nhập giá trị mảng:");
        for (int i = 0; i < mang.length; i++) {
            mang[i] = sc.nextInt();
        }
        double avg_odd = 0, count = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 != 0) {
                avg_odd += mang[i];
                count ++;
            }
        }
        double sum = avg_odd / count;
        System.out.printf("Trung bình cộng trong mảng: %.2f", sum);
    }
}
