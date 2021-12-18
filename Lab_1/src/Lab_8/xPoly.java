/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_8;

/**
 *
 * @author A
 */
public class xPoly {
    public static final double sum(double ...x) {
        double kq = 0;
        for (double i : x) {
            kq = kq + i;
        }
        return kq;
    }
    public static final double min(double ...x) {
        double kq = x[0];
        for (double i : x) {
            if(kq>i){
                kq = i;
            }
        }
        return kq;
    }
    public static final double max(double ...x) {
        double kq = x[0];
        for (double i : x) {
            if(kq < i){
                kq = i;
            }
        }
        return kq;
    }
    public static final String bbb(String s){
        String kq = "";
        String [] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
              kq = kq + words[i].substring(0,1).toUpperCase()+words[i].substring(1, words[i].length())+" ";
        }
        return kq;
    }
    public static void main(String[] args) {
        System.out.println("Tổng = " +sum(14 , 5, 6, 4, 8, 3, 5));
        System.out.println("Min = " +min(5, 3, 5, 6, 4, 1, 2));
        System.out.println("Max = " +max(8, 9, 10, 6, 11, 1));
        System.out.println("Max = " +bbb("dinh thanh hai"));
    }
}
