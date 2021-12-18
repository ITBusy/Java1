package Lab_3;

import java.util.Scanner;

public class Bai_1 {

    boolean KiemTraSoNguyenTo(int n) {
        if (n <= 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Kiem tra so nguyen to \n");
        int n = s.nextInt();
        Bai_1 snt = new Bai_1();
        if (snt.KiemTraSoNguyenTo(n)) {
            System.out.println("So : " + n + " la so nguyen to");
        } else {
            System.out.println("So : " + n + " khong phai la so nguyen to");
        }
    }
}
