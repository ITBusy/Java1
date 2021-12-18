/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_6;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class FullName {
    public static void main(String[] args) {
        String fullName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        fullName = sc.nextLine();
        String last = fullName.substring(0, fullName.indexOf(" ")).toUpperCase();
        String middleName = fullName.substring(fullName.indexOf(" "),fullName.lastIndexOf(" ")).trim();
        String name = fullName.substring(fullName.lastIndexOf(" "),fullName.length()).trim().toUpperCase();
        System.out.println("Ho: "+last+"\n"+"Ten dem: "+middleName+"\n"+"Ten: "+ name);
    }
}

   