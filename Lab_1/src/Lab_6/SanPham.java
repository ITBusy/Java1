/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_6;

/**
 *
 * @author A
 */
import java.util.Scanner;
public class SanPham {
    String name, theFirm;
    double price;
    
    public SanPham(){}

    public SanPham(String name, String theFirm, double price) {
        this.name = name;
        this.theFirm = theFirm;
        this.price = price;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten Sp: ");
        name = sc.nextLine();
        System.out.println("Nhap gia Sp: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap hang Sp: ");
        theFirm = sc.nextLine();  
    }
    public void Xuat(){
        String p = "Nokia";
        if(theFirm.matches(p)){
        System.out.println("Ten: "+name+"\n"+"gia: "+price+"\n"+"hang: "+theFirm);       
        }
    }
}
