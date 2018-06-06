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
public class Hinhtron {
    private float toaDoTam;
    private String color;
    private float banKinh;
    private List<Hinhtron> listHinhtron = new ArrayList<Hinhtron>();

    public Hinhtron() {
    }

    public Hinhtron(float toaDoTam, String color, float banKinh) {
        this.toaDoTam = toaDoTam;
        this.color = color;
        this.banKinh = banKinh;
    }

    

    public float getToaDoTam() {
        return toaDoTam;
    }

    public void setToaDoTam(float toaDoTam) {
        this.toaDoTam = toaDoTam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public void themHT() {
        Scanner s = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            Hinhtron ht = new Hinhtron();
            System.out.println("Nhập tọa độ tâm: ");
            ht.setToaDoTam(s.nextFloat());
            System.out.println("Nhập màu sắc: ");
            ht.setColor(s.next());
            System.out.println("Nhập bán kính: ");
            ht.setBanKinh(s.nextFloat());
            listHinhtron.add(ht);
            System.out.println("Bạn có muốn thêm tiếp hình tròn? \n1. yes\n2. no");
            int choice = s.nextInt();
            if (choice == 1) {
                continue;
            } else if (choice == 2) {
                isTrue = false;
            }
        }
    }

    public void danhSachHT() {
        int count = 1;
        System.out.println("STT\tToa Do Tam\tColor\tBán kính");
        for (Hinhtron list : listHinhtron) {
            System.out.println(count + "\t" + list.getToaDoTam() + "\t\t" + list.getColor() + "\t"
                    + list.getBanKinh());
            count++;
        }
    }

    public void hinhDienTichLonNhat() {
        double max = 0;
        Hinhtron hcn = new Hinhtron();
        for (int i = 0; i < listHinhtron.size(); i++) {
            if (Math.pow(listHinhtron.get(i).getBanKinh(), 2) * 3.14  > max) {
                max = Math.pow(listHinhtron.get(i).getBanKinh(), 2) * 3.14 ;
                hcn.setToaDoTam(listHinhtron.get(i).getToaDoTam());
                hcn.setColor(listHinhtron.get(i).getColor());
                hcn.setBanKinh(listHinhtron.get(i).getBanKinh());
            }
        }
        System.out.println("Hình có diện tích lớn nhất là: ");
        System.out.println(hcn.getToaDoTam() + " " + hcn.getColor() + " " + hcn.getBanKinh());
    }
    
    
}
