package test.bt_them.control;

import test.bt_them.service.Oto;
import test.bt_them.service.XeMay;
import test.bt_them.service.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienManager {
    XeTai xeTai = new XeTai();
    Oto oto = new Oto();
    XeMay xeMay = new XeMay();
    WriterAndRead writerAndRead = new WriterAndRead();
    Scanner input = new Scanner(System.in);

    public void mainAdd() {
        System.out.println("Chọn: ");
        System.out.println("1.Thêm Xe Tải" + "\n" + "2.Thêm Xe Oto" + "\n" + "3.Thêm Xe Máy");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose) {
            case 1:
                addXeTai();
                break;
            case 2:
                addOto();
                break;
            case 3:
                addXeMay();
                break;
        }
    }

    public void mainShow() {
        System.out.println("Chọn: ");
        System.out.println("1.Hiển thị xe tải" + "\n" + "2.Hiển thị xe oto" + "\n" + "3.Hiển thị xe máy");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose) {
            case 1:
                showXeTai();
                break;
            case 2:
                showOto();
                break;
            case 3:
                showXeMay();
                break;
        }
    }
    public void mainDelete(){
        System.out.println("Chọn: ");
        System.out.println("1.Xóa xe tải"+"\n"+"2.Xóa xe oto"+"\n"+"3.Xóa xe máy"+"\n");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose){
            case 1:
                deleteXeTai();
                break;
            case 2:
                deleteOto();
                break;
            case 3:
                deleteXeMay();
                break;
        }
    }

    public void addXeTai() {
        List<XeTai> xeTaiList = new ArrayList<>();
        System.out.println("Nhập Biển Kiểm Số: ");
        String bks = input.nextLine();
        xeTai.setBks(bks);
        System.out.println("Nhập Tên Hảng: ");
        String name = input.nextLine();
        xeTai.setNameHang(name);
        System.out.println("Nhập Năm: ");
        String year = input.nextLine();
        xeTai.setYear(year);
        System.out.println("Chủ Sở Hửu: ");
        String chu = input.nextLine();
        xeTai.setChuSoHuu(chu);
        System.out.println("Nhập Trọng Tải: ");
        String trongTai = input.nextLine();
        xeTai.setTrongTai(trongTai);
        xeTaiList.add(xeTai);
        writerAndRead.WriterXeTai(xeTaiList, true);
    }

    public void addOto() {
        List<Oto> otoList = new ArrayList<>();
        System.out.println("Nhập Biển Kiểm Số: ");
        String bks = input.nextLine();
        oto.setBks(bks);
        System.out.println("Nhập Tên Hảng: ");
        String name = input.nextLine();
        oto.setNameHang(name);
        System.out.println("Nhập Năm: ");
        String year = input.nextLine();
        oto.setYear(year);
        System.out.println("Chủ Sở Hửu: ");
        String chu = input.nextLine();
        oto.setChuSoHuu(chu);
        System.out.println("Số Chổ Ngồi: ");
        String cho = input.nextLine();
        oto.setSoChoNgoi(cho);
        System.out.println("Kiểu Xe");
        String kieuXe = input.nextLine();
        oto.setKieuXe(kieuXe);
        otoList.add(oto);
        writerAndRead.WriterOto(otoList, true);
    }

    public void addXeMay() {
        List<XeMay> xeMayList = new ArrayList<>();
        System.out.println("Nhập Biển Kiểm Số: ");
        String bks = input.nextLine();
        xeMay.setBks(bks);
        System.out.println("Nhập Tên Hảng: ");
        String name = input.nextLine();
        xeMay.setNameHang(name);
        System.out.println("Nhập Năm: ");
        String year = input.nextLine();
        xeMay.setYear(year);
        System.out.println("Chủ Sở Hửu: ");
        String chu = input.nextLine();
        xeMay.setChuSoHuu(chu);
        System.out.println("Công Suất: ");
        String congSuat = input.nextLine();
        xeMay.setCongSuat(congSuat);
        xeMayList.add(xeMay);
        writerAndRead.WriterXeMay(xeMayList, true);
    }

    public void showXeTai() {
        ArrayList<XeTai> xeTaiArrayList = writerAndRead.readXeTai();
        for (XeTai xeTai : xeTaiArrayList) {
            System.out.println(xeTai);
        }
    }

    public void showOto() {
        ArrayList<Oto> otoArrayList = writerAndRead.readOto();
        for (Oto oto : otoArrayList) {
            System.out.println(oto);
        }
    }

    public void showXeMay() {
        ArrayList<XeMay> xeMayArrayList = writerAndRead.readXeMay();
        for (XeMay xeMay : xeMayArrayList) {
            System.out.println(xeMay);
        }
    }
    public void deleteXeTai(){
        List<XeTai> xeTaiList = writerAndRead.readXeTai();
        String list= "";
        for (int i = 0; i<xeTaiList.size();i++){
            list+=(i+1+"Name: "+xeTaiList.get(i).getBks()+"\n ");
        }
        System.out.println(list);
        System.out.println("Chọn BKS muốn xóa: ");
        int choose = input.nextInt();
        xeTaiList.remove(choose-1);
        writerAndRead.WriterXeTai(xeTaiList,false);
    }
    public void deleteOto(){
        List<Oto> xeOtolist = writerAndRead.readOto();
        String list= "";
        for (int i = 0; i<xeOtolist.size();i++){
            list+=(i+1+"Name: "+xeOtolist.get(i).getBks()+"\n ");
        }
        System.out.println(list);
        System.out.println("Chọn BKS muốn xóa: ");
        int choose = input.nextInt();
        xeOtolist.remove(choose-1);
        writerAndRead.WriterOto(xeOtolist,false);
    }
    public void deleteXeMay(){
        List<XeMay> xeMayList = writerAndRead.readXeMay();
        String list= "";
        for (int i = 0; i<xeMayList.size();i++){
            list+=(i+1+"Name: "+xeMayList.get(i).getBks()+"\n ");
        }
        System.out.println(list);
        System.out.println("Chọn BKS muốn xóa: ");
        int choose = input.nextInt();
        xeMayList.remove(choose-1);
        writerAndRead.WriterXeMay(xeMayList,false);
    }
}
