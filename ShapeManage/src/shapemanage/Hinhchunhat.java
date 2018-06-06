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
public class Hinhchunhat {

    private float toaDoTam;
    private String color;
    private float chieuDai;
    private float chieuRong;
    private List<Hinhchunhat> listHCN = new ArrayList<Hinhchunhat>();

    ;

    public Hinhchunhat() {
    }

    public Hinhchunhat(float toaDoTam, String color, float chieuDai, float chieuRong) {
        this.toaDoTam = toaDoTam;
        this.color = color;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
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

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void themHCN() {
        Scanner s = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            Hinhchunhat hcn = new Hinhchunhat();
            System.out.println("Nhập tọa độ tâm: ");
            hcn.setToaDoTam(s.nextFloat());
            System.out.println("Nhập màu sắc: ");
            hcn.setColor(s.next());
            System.out.println("Nhập chiều dài: ");

            hcn.setChieuDai(s.nextFloat());
            System.out.println("Nhập chiều rộng: ");
            hcn.setChieuRong(s.nextFloat());
            listHCN.add(hcn);
            System.out.println("Bạn có muốn thêm tiếp HCN? \n1. yes\n2. no");
            int choice = s.nextInt();
            if (choice == 1) {
                continue;
            } else if (choice == 2) {
                isTrue = false;
            }
        }
    }

    public void danhSachHCn() {
        int count = 1;
        System.out.println("STT\tToa Do Tam\tColor\tChieu Dai\tChieu Rong");
        for (Hinhchunhat list : listHCN) {
            System.out.println(count + "\t" + list.getToaDoTam() + "\t\t" + list.getColor() + "\t"
                    + list.getChieuDai() + "\t\t" + list.getChieuRong());
            count++;
        }
    }

    public void hinhDienTichLonNhat() {
        float max = 0;
        Hinhchunhat hcn = new Hinhchunhat();
        for (int i = 0; i < listHCN.size(); i++) {
            if (listHCN.get(i).getChieuDai() * listHCN.get(i).getChieuRong() > max) {
                max = listHCN.get(i).getChieuDai() * listHCN.get(i).getChieuRong();
                hcn.setToaDoTam(listHCN.get(i).getToaDoTam());
                hcn.setColor(listHCN.get(i).getColor());
                hcn.setChieuDai(listHCN.get(i).getChieuDai());
                hcn.setChieuRong(listHCN.get(i).getChieuRong());
            }
        }
        System.out.println("Hình có diện tích lớn nhất là: ");
        System.out.println(hcn.getToaDoTam() + " " + hcn.getColor() + " " + hcn.getChieuDai() + " " + hcn.getChieuRong());
    }

}
