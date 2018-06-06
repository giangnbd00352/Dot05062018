/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author B.Rengg
 */
public class ShapeManage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hinhchunhat hcn = new Hinhchunhat();
        Hinhtamgiac htg = new Hinhtamgiac();
        Hinhtron ht = new Hinhtron();
        while (true) {
            System.out.println("Chọn loại hình vẽ cần nhập:");
            System.out.println("1. Hình chữ nhật\n2. Hình tròn\n3. Hình tam giác");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Thêm HCN\n2. Danh sách HCN\n3. Diện tích hình lớn nhất");
                    int c = s.nextInt();
                    if (c == 1) {
                        hcn.themHCN();
                    } else if (c == 2) {
                        hcn.danhSachHCn();
                    } else if (c == 3) {
                        hcn.hinhDienTichLonNhat();
                    }
                    break;
                case 2:
                    System.out.println("1. Thêm hình tròn\n2. Danh sách hình tròn\n3. Diện tích hình lớn nhất");
                    int c1 = s.nextInt();
                    if (c1 == 1) {
                        ht.themHT();
                    } else if (c1 == 2) {
                        ht.danhSachHT();
                    } else if (c1 == 3) {
                        ht.hinhDienTichLonNhat();
                    }
                    break;
                case 3:
                    System.out.println("1. Thêm hình tam giác\n2. Danh sách hình tam giác\n3. Diện tích hình lớn nhất");
                    int c2 = s.nextInt();
                    if (c2 == 1) {
                        htg.themHTG();
                    } else if (c2 == 2) {
                        htg.danhSachHTG();
                    } else if (c2 == 3) {
                        htg.hinhDienTichLonNhat();
                    }
                    break;
                default:
                    System.out.println("Bạn nhập sai !");
                    System.out.println("---------------");
            }
        }
    }

}
