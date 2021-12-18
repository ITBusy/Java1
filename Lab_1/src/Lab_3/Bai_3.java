/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;

/**
 *
 * @author A
 */
import java.util.Arrays;
import java.util.Scanner;

public class Bai_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng mảng:");
        int n = sc.nextInt();
        int mang[] = new int[n];
        System.out.println("Nhập giá trị mảng:");
        for (int i = 0; i < mang.length; i++) {
            mang[i] = sc.nextInt();
        }
        sort(mang, n);
        min(mang);
        Odd(mang, n);
    }

    public static void sort(int mang[], int n) {
        Arrays.sort(mang);
        System.out.println("Giá trị mảng tăng dần: ");
        for (int x : mang) {
            System.out.println(x);
        }
    }

    public static void min(int mang[]) {
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (min > mang[i]) {
              min = mang[i];  
            }   
        }
        System.out.println("Giá tri nhỏ nhất trong mảng là: " + min);
    }

    public static void Odd(int mang[], int n) {
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 != 0) {
                sum += mang[i];
                count++;
            }
        }
        
        double avg = sum / count;
        System.out.println("Trung bình cộng các số lẻ của mảng là: " + avg);
    }
}
