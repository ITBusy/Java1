/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4;

/**
 *
 * @author A
 */
import java.util.Scanner;

public class TongHop {

    private static int Bai_1;

    public static void main(String[] args) {
        int input;
        int chon;
        Scanner sc = new Scanner(System.in);

        System.out.println("chon: ");
        chon = sc.nextInt();
        switch (chon) {
            case 1 -> {
                Bai_1 a = new Bai_1("Keo", 100, 20);
                a.Checked();
            }
            case 2 -> {
                Bai_1 b = new Bai_1("Keo", 100, 0);
                b.Checked();
            }
            default -> {
                System.out.println("Nhập số lượng sản phẩm: ");
                input = sc.nextInt();
                Bai_1 arrays[] = new Bai_1[input];
                for (int i = 0; i < input; i++) {
                    System.out.printf("=> Sản phẩm thứ %d là: \n", i + 1);
                    
                    arrays[i] = new Bai_1();
                    arrays[i] = new Bai_1();
                    arrays[i].Nhap();
                    
                }   System.out.println(
                        "\n>>Danh sách các sản được đưa vào database<<");
                for (var arrays_1 : arrays) {
                    arrays_1.Checked();
                }
            }
        }
    }

}
