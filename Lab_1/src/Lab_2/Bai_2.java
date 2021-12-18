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

public class Bai_2 {

    public static void main(String[] args) {
        Float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextFloat();
        System.out.println("Nhap b: ");
        b = sc.nextFloat();
        System.out.println("Nhap c: ");
        c = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem: " + (-c / b));
            }
        } else {
            Double Delta = Math.pow(b, 2) - (4 * a * c);
            if (Delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (Delta == 0) {
                System.out.println("Phuong trinh co nghiem kep la x = " + (-b / (2 * a)));
            } else {
                Double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
                Double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
                System.out.printf("Phuong trinh co 2 nghiem la:\nx1 = %.2f\nx2 = %.2f\n", x1, x2);
            }
        }
    }
}
