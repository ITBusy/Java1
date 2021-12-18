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
import java.util.Scanner;

public class Bai_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<>();

        while (true) {
            System.out.println("nhap 1 so");
            double d = sc.nextDouble();
            if (d == -1) {
                break;
            } else {
                arr.add(d);
            }

        }
        double sum = 0;
        for (double x : arr) {
            System.out.println(x);
            sum += x;
        }
        
        System.out.println("sum = " + sum);
        //hoac
//        double sum = 0;
//        sum = arr.stream().map(x -> {
//            System.out.println(x);
//            return x;
//       }).map(x -> x).reduce(sum, (accumulator, _item) -> accumulator + _item);
//        System.out.println("sum" + sum);
    }
}
