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
public class Bai_2 {
    public static void main(String[] args) {
        Float Height;
        Float Width;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        Width= sc.nextFloat();
        System.out.println("Nhap chieu rong: ");
        Height= sc.nextFloat();
        Float Perimeter= (Height+Width)*2;
        Float Acreage= (Height*Width);
        Float SmallestEdge= Math.min(Height, Width);
        System.out.printf("%.1f %.1f %.1f", Perimeter, Acreage, SmallestEdge);
    }
}
