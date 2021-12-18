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
public class SinhVien {
    String ten;
    String email;
    String dienThoai;
    String cmnd;
    
    public SinhVien(){};

    public SinhVien(String ten, String email, String dienThoai, String cmnd) {
        this.ten = ten;
        this.email = email;
        this.dienThoai = dienThoai;
        this.cmnd = cmnd;
    }

   
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        String mau1 = "\\w+@\\w+\\.\\w+";//email
        String mau2 = "0[0-9]{9}";//phone
        String mau3 = "[0-9]{9}";//cmnd
        
        do {            
            System.out.println("Nhap ten: ");
            ten  = sc.nextLine();
            if(ten.length()>0)break;
        } while (true);
        do {            
            System.out.println("Nhap email: ");
            email  = sc.nextLine();
            if(email.matches(mau1))break;
            else{
                System.out.println("Nhap email khong dung! Nhap lai");
            }
        } while (true);
        do {            
            System.out.println("Nhap dien thoai: ");
            dienThoai  = sc.nextLine();
            if(dienThoai.matches(mau2))break;
            else{
                System.out.println("Nhap phone khong dung! Nhap lai");
            }
        } while (true);
        do {            
            System.out.println("Nhap cmnd: ");
            cmnd  = sc.nextLine();
            if(cmnd.matches(mau3))break;
            else{
                System.out.println("Nhap cmnd khong dung! Nhap lai");
            }
        } while (true);
    }
    public void Xuat(){
        System.out.println("Ten: "+ ten+"\n"+"Email: "+email+"\n"+"Dien Thoai: "+dienThoai+"\n"+"Cmnd: "+cmnd);
    }
}
