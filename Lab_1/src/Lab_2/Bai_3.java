//Locale loc = Locale.getDefault();
//NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
//
//System.out.println(nf.format(1000000)+" VNĐ");
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

import java.text.DecimalFormat; // decimaFormat la dinh dang tien te
import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args) {
        Float kWh, TienDien;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap kWh: ");
        kWh = sc.nextFloat();
        if (kWh<50) {
            TienDien=kWh*1000;
        } else {
            TienDien=50*1000+(1200*(kWh-50));
        }
        DecimalFormat formatter = new DecimalFormat("###,###,###.00");
        System.out.printf("So tien dien can thanh toan la: " + formatter.format(TienDien) +" VND\n");
    }
}
