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
public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String HoVaTen;
        Float Diem_TB;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap HoVaTen: ");
        HoVaTen= sc.nextLine();
        //Scanner sc= new Scanner(System.in);
        System.out.println("Nhap Diem_TB: ");
        Diem_TB= sc.nextFloat();
        System.out.printf("%s %.1f Diem", HoVaTen,Diem_TB);
    }
    
}
