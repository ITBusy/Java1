/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai_4 {

    public static void main(String[] args) {
        String[] ten;
        double[] diem;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng: ");
        n = Integer.parseInt(sc.nextLine());
        ten = new String[n];
        diem = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập thông tin sinh viên thứ %d\n", i + 1);
            System.out.println("Tên sinh viên: ");
            ten[i] = sc.nextLine();
            System.out.println("Điểm: ");
            diem[i] = Double.parseDouble(sc.nextLine());
        }
        Xethocluc(ten, diem, n);
        
        Sapxep(ten, diem, n);
        Xethocluc(ten, diem, n);

        

    }

    public static void Xethocluc(String ten[], double diem[], int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(">>Danh sách sinh viên<<");
            System.out.printf("Họ và Tên: %s \n", ten[i]);
            System.out.printf("Điểm: %.1f \n", diem[i]);
            if (diem[i] < 5) {
                System.out.println("Học lực yếu \t");
            } else if (diem[i] < 6.5) {
                System.out.println("Học lực trung bình \t");
            } else if (diem[i] < 7.5) {
                System.out.println("Học lực khá \t");
            } else if (diem[i] < 9) {
                System.out.println("Học lực giỏi \t");
            } else {
                System.out.println("Học lực xuất sắc \t");
            }
            System.out.println();
        }
        
    }

    public static void Sapxep(String ten[], double diem[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[j] < diem[i]) {
                    double temp_1 = diem[j];
                    diem[j] = diem[i];
                    diem[i] = temp_1;
                    String temp_2 = ten[j];
                    ten[j] = ten[i];
                    ten[i] = temp_2;
                }
            }
        }
    }

    public static void Xuatthongtin(String ten[], double diem[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Thông tin sinh viên thứ %d\n", i + 1);
            System.out.printf("Họ và Tên: %s \n", ten[i]);
            System.out.printf("Điểm: %.1f \n", diem[i]);
        }
    }
}
