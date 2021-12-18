/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author A
 */
public class Bai_4 {

    public static void main(String[] args) {
        System.out.println("===================LAB_2=====================");
        Menu();
    }

    /**
     *
     */
    public static void Menu() {
        System.out.println("+----------------- MENU --------------------+");
        System.out.println("|    1. Giai phuong trinh bac nhat          |");
        System.out.println("|    2. Giai phuong trinh bac hai           |");
        System.out.println("|    3. Tien dien                           |");
        System.out.println("|    4. Ket thuc chung trinh                |");
        System.out.println("+-------------------------------------------+");
        System.out.println("Chon so: ");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        switch (chon) {
            case 1 -> {
                System.out.print("Nhap a: ");
                Float a = sc.nextFloat();
                System.out.print("Nhap b: ");
                Float b = sc.nextFloat();
                giaiPhuongTrinhBacNhat(a, b);
            }
            case 2 -> {
                System.out.print("Nhap a: ");
                Float a = sc.nextFloat();
                System.out.print("Nhap b: ");
                Float b = sc.nextFloat();
                System.out.print("Nhap c: ");
                Float c = sc.nextFloat();
                giaiPhuongTrinhBacHai(a, b, c);
            }
            case 3 -> {
                System.out.print("Nhap kWh: ");
                Float kWh = sc.nextFloat();

                tienDien(kWh);
            }
            default ->
                System.exit(0);
        }
        System.out.println("Good bye! See you again");
    }

    public static void giaiPhuongTrinhBacNhat(Float a, Float b) {

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Co nghiem x= " + (-b / a));
        }
    }

    public static void giaiPhuongTrinhBacHai(Float a, Float b, Float c) {
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

    public static void tienDien(Float kWh) {

        Float TienDien;

        if (kWh < 50) {
            TienDien = kWh * 1000;
        } else {
            TienDien = 50 * 1000 + (1200 * (kWh - 50));
        }
//        System.out.printf("So tien dien can thanh toan la: %.2f VND\n", TienDien);
        DecimalFormat formatter = new DecimalFormat("###,###,###.00");
        System.out.println("So tien dien can thanh toan la: " + formatter.format(TienDien) + " VND\n");
    }

}
