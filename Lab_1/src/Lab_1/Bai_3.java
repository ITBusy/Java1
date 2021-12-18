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

public class Bai_3 {

    public static void main(String[] args) {
        Float Edge;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh khoi lap phuong: ");
        Edge = sc.nextFloat();
//        Float Volume= Edge*Edge*Edge;
        System.out.println("Volume= " + Math.pow(Edge, 3));
    }
}
