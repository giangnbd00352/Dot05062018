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
public class Hinhtamgiac {

    private float toaDoTam;
    private String color;
    private float chieuDaiCanh1;
    private float chieuDaiCanh2;
    private float chieuDaiCanh3;
    private List<Hinhtamgiac> listTamgiac = new ArrayList<Hinhtamgiac>();

    public Hinhtamgiac() {
    }

    public Hinhtamgiac(float toaDoTam, String color, float chieuDaiCanh1, float chieuDaiCanh2, float chieuDaiCanh3) {
        this.toaDoTam = toaDoTam;
        this.color = color;
        this.chieuDaiCanh1 = chieuDaiCanh1;
        this.chieuDaiCanh2 = chieuDaiCanh2;
        this.chieuDaiCanh3 = chieuDaiCanh3;
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

    public float getChieuDaiCanh1() {
        return chieuDaiCanh1;
    }

    public void setChieuDaiCanh1(float chieuDaiCanh1) {
        this.chieuDaiCanh1 = chieuDaiCanh1;
    }

    public float getChieuDaiCanh2() {
        return chieuDaiCanh2;
    }

    public void setChieuDaiCanh2(float chieuDaiCanh2) {
        this.chieuDaiCanh2 = chieuDaiCanh2;
    }

    public float getChieuDaiCanh3() {
        return chieuDaiCanh3;
    }

    public void setChieuDaiCanh3(float chieuDaiCanh3) {
        this.chieuDaiCanh3 = chieuDaiCanh3;
    }

    public List<Hinhtamgiac> getListTamgiac() {
        return listTamgiac;
    }

    public void setListTamgiac(List<Hinhtamgiac> listTamgiac) {
        this.listTamgiac = listTamgiac;
    }

    

    public void themHTG() {
        Scanner s = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            Hinhtamgiac htg = new Hinhtamgiac();
            System.out.println("Nhập tọa độ tâm: ");
            htg.setToaDoTam(s.nextFloat());
            System.out.println("Nhập màu sắc: ");
            htg.setColor(s.next());
            System.out.println("Nhập chiều dài cạnh 1: ");
            htg.setChieuDaiCanh1(s.nextFloat());
            System.out.println("Nhập chiều dài cạnh 2: ");
            htg.setChieuDaiCanh2(s.nextFloat());
            System.out.println("Nhập chiều dài cạnh 3: ");
            htg.setChieuDaiCanh3(s.nextFloat());
            listTamgiac.add(htg);
            System.out.println("Bạn có muốn thêm tiếp HTG? \n1. yes\n2. no");
            int choice = s.nextInt();
            if (choice == 1) {
                continue;
            } else if (choice == 2) {
                isTrue = false;
            }
        }
    }

    public void danhSachHTG() {
        int count = 1;
        System.out.println("STT\tToa Do Tam\tColor\tChieu Dai 3 Canh");
        for (Hinhtamgiac list : listTamgiac) {
            System.out.println(count + "\t" + list.getToaDoTam() + "\t\t" + list.getColor() + "\t"
                    + list.getChieuDaiCanh1() + " " + list.getChieuDaiCanh2() + " " + list.getChieuDaiCanh3());
            count++;
        }
    }

    public void hinhDienTichLonNhat() {
        double max = 0;
        Hinhtamgiac htg = new Hinhtamgiac();
        for (int i = 0; i < listTamgiac.size(); i++) {
            double S = Math.sqrt((listTamgiac.get(i).getChieuDaiCanh1()+ listTamgiac.get(i).getChieuDaiCanh2() + listTamgiac.get(i).getChieuDaiCanh3())
                    *(listTamgiac.get(i).getChieuDaiCanh1()+ listTamgiac.get(i).getChieuDaiCanh2() - listTamgiac.get(i).getChieuDaiCanh3()) 
                    *(listTamgiac.get(i).getChieuDaiCanh2()+ listTamgiac.get(i).getChieuDaiCanh3() - listTamgiac.get(i).getChieuDaiCanh1())
                    *(listTamgiac.get(i).getChieuDaiCanh3()+ listTamgiac.get(i).getChieuDaiCanh1() - listTamgiac.get(i).getChieuDaiCanh2()))/4;        
            if (S > max) {
                max = S;
                htg.setToaDoTam(listTamgiac.get(i).getToaDoTam());
                htg.setColor(listTamgiac.get(i).getColor());
                htg.setChieuDaiCanh1(listTamgiac.get(i).getChieuDaiCanh1());
                htg.setChieuDaiCanh2(listTamgiac.get(i).getChieuDaiCanh2());
                htg.setChieuDaiCanh3(listTamgiac.get(i).getChieuDaiCanh3());
            }
        }
        System.out.println("Hình có diện tích lớn nhất là: ");
        System.out.println(htg.getToaDoTam() + " " + htg.getColor() + " " + htg.getChieuDaiCanh1() + " " + htg.getChieuDaiCanh2() + " " + htg.getChieuDaiCanh3());
    }
}
