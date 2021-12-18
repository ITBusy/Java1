/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_5;

/**
 *
 * @author A
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai_2 {

    ArrayList<String> name;// Thuộc tính

    public Bai_2() {//Khởi tạo
        name = new ArrayList<>();
    }

    //Nhập
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap ten: ");
            String s = sc.nextLine();
            if (s.equals("-1")) {
                break;
            }else
            {
                name.add(s);
            }
        } while (true);
        
    }
    public void xuat(){
        System.out.println("danh sach ten");
        for(String x : name){
            System.out.println(x);
        }
    }
    public void sapxep(){
        Collections.sort(name);//sx tang dan
        Collections.reverse(name);//dao nguoc mang
        xuat();
    }
    public void xuatNgauNhien(){
        Collections.shuffle(name);
        System.out.println("ds duoc sap xep ngau nhien");
        xuat();
    }
    public void xoa(){
        String x;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten can xoa");
        x = sc.nextLine();
        for (int i = 0; i < name.size(); i++) {
            if(name.get(i).equalsIgnoreCase(x)){
                name.remove(i);
                break;
            }
        }
    }
}
