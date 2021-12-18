/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

/**
 *
 * @author A
 */
import java.util.Scanner;

public class Bai_4 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Nhap c: ");
        c = sc.nextInt();
        double Delta = Math.pow(b,2) - (4 * a * c);
//        Double Sqrt = Math.sqrt(Delta);
//        System.out.println("Delta= " + Delta);
        System.out.printf("Delta= %.2f\n" , Delta);
        
        System.out.println("Sqrt= " + (Math.sqrt(Delta)));

    }
}
