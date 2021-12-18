/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

/**
 *
 * @author A
 */
import java.util.Scanner;
public class Bai_1 {
    public static void main(String[] args) {
        Float a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextFloat();
        System.out.println("Nhap b: ");
        b = sc.nextFloat();
        if (a==0) {
            if (b==0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Co nghiem x= " + (-b/a));
        }
    }
}
