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
import java.text.DecimalFormat;

public class Bai_1 {

    private String NameProduct;
    public double UnitPrice;
    public double Discount;

    public Bai_1(String NameProduct, double UnitPrice, double Discount) {
        this.NameProduct = NameProduct;
        this.UnitPrice = UnitPrice;
        this.Discount = Discount;
    }

    public Bai_1(String NameProduct, double UnitPrice) {
        this.NameProduct = NameProduct;
        this.UnitPrice = UnitPrice;
        this.Discount = 0;
    }

    Bai_1() {

    }

    public String getNameProduct() {
        return this.NameProduct;
    }

    public void setNameProduct(String NameProduct) {
        this.NameProduct = NameProduct;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        this.NameProduct = sc.nextLine();
        System.out.println("Nhập đơn giá: ");
        this.UnitPrice = sc.nextDouble();
        System.out.println("Nhập giảm giá: ");
        this.Discount = sc.nextDouble();

    }

    private double getImportTax() {
        return (this.UnitPrice * 0.1);
    }

    public void Checked() {
        DecimalFormat formatter = new DecimalFormat("###,###,###.00");
        System.out.println("\nTên sản phẩm/Name product: " + this.NameProduct + "\n"
                + "Đơn giá/Unit price: " + formatter.format(this.UnitPrice) + " VND" + "\n" + "Giảm giá/Discount: " + formatter.format(this.Discount) + " VND"
                + "\n" + "Thuế nhập khẩu/Import tax: " + formatter.format(getImportTax()) + " VND");
        System.out.printf("Thành tiền/Into money: " + formatter.format((this.UnitPrice - this.Discount + getImportTax())) + " VND\n");
    }

//    public static void main(String[] args) {
//        Bai_1 Prod = new Bai_1();
//        Prod.Nhap();
//        Prod.Checked();
//    }
}
