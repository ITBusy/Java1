/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author A
 */
public class main_sv {

    public static void main(String[] args) {
        int n;
        ArrayList<QL_SV_B4> arr = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số lượng SV đưa vào: ");
            n = sc.nextInt();
            QL_SV_B4 array[] = new QL_SV_B4[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = new QL_SV_B4();
                array[i].Nhap();
//            array[i].Xuat();
                arr.add(array[i]);
            }
            arr.forEach(arr1 -> {
                arr1.SapXep();
            });
        } while (true);

    }
}
