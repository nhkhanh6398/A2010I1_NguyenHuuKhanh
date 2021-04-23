package Bai_Tap.control;

import Bai_Tap.commons.ExceptionDelete;
import Bai_Tap.commons.Validate;
import Bai_Tap.commons.WriterAndRead;
import Bai_Tap.model.BenhAn;
import Bai_Tap.model.BenhNhanThuong;
import Bai_Tap.model.BenhNhanVip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainControler {
    Scanner input = new Scanner(System.in);
    BenhNhanThuong benhNhanThuong = new BenhNhanThuong();
    BenhNhanVip benhNhanVip = new BenhNhanVip();
    WriterAndRead writerAndRead = new WriterAndRead();
    public void themBenhAn(){
        System.out.println("Nhập Đối Tượng Muốn Thêm: ");
        System.out.println("1.Thêm Bệnh Nhân Thường"+"\n"+"2.Thêm Bệnh Nhân Vip");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose){
            case 1:
                themBenhNhanThuong();
                break;
            case 2:
                themBenhNhanVip();
                break;
            default:
                System.out.println("Không có đối tượng");
        }
    }
    public void showBenhAn(){
        System.out.println("Nhập đối tượng muốn show: ");
        System.out.println("1.Show tất cả"+"\n"+"2.Show bệnh nhân thường"+"\n"+"3.Show bệnh nhân vip");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose){
            case 1:
                writerAndRead.ReadBenhAn();
                break;


        }
    }
    public void themBenhNhanThuong(){
        List<BenhNhanThuong> benhNhanThuongList = new ArrayList<>();
        System.out.println("Nhập STT: ");
        String stt = input.nextLine();
        benhNhanThuong.setStt(stt);
        System.out.println("Nhập ID Bênh Án: BA-XXX");
        String idBenhAn;
        do{
            idBenhAn = input.nextLine();
            if (Validate.checkIdBenhAn(idBenhAn)){
                benhNhanThuong.setIdBenhAn(idBenhAn);
                break;
            }else {
                System.out.println("Nhập lại!");
            }
        }while (true);


        System.out.println("Nhập ID Bệnh Nhân: BN-XXX ");
        String idBenhNhan;
        do {
            idBenhNhan = input.nextLine();
            if (Validate.checkIdBenhNhan(idBenhNhan)){
                benhNhanThuong.setIdBenhNhan(idBenhNhan);
                break;
            }else {
                System.out.println("Nhập lại!");
            }
        }while (true);


        System.out.println("Nhập Tên Bệnh Nhân: ");
        String name = input.nextLine();
        benhNhanThuong.setName(name);
        System.out.println("Nhập Ngày Nhập Viện: dd/MM/yyyy ");
        String dayin;
        do {
            dayin = input.nextLine();
            if (Validate.checkday(dayin)){
                benhNhanVip.setDayIn(dayin);
                break;
            }else {
                System.out.println("Nhập lại!");
            }
        }while (true);


        System.out.println("Nhập Ngày Ra Viện: dd/MM/yyyy ");
        String dayout;
        do {
            dayout = input.nextLine();
            if (Validate.checkday(dayout)){
                benhNhanVip.setDayOut(dayout);
                break;
            }else {
                System.out.println("Nhập lại!");
            }
        }while (true);
        System.out.println("Lý Do Nhập Viện: ");
        String lido = input.nextLine();
        benhNhanThuong.setLiDo(lido);
        System.out.println("Nhập Phí Nằm Viện");
        int count = input.nextInt();
        input.nextLine();
        benhNhanThuong.setCount(count);
        benhNhanThuongList.add(benhNhanThuong);
        writerAndRead.WriterBNT(benhNhanThuongList,true);

    }
    public void themBenhNhanVip(){
        List<BenhNhanVip> benhNhanVipList = new ArrayList<>();
        System.out.println("Nhập STT: ");
        String stt = input.nextLine();
        benhNhanVip.setStt(stt);

        System.out.println("Nhập ID Bênh Án: BA-XXX");
        String idBenhAn;
        do{
            idBenhAn = input.nextLine();
            if (Validate.checkIdBenhAn(idBenhAn)){
                benhNhanThuong.setIdBenhAn(idBenhAn);
                break;
            }else {
                System.out.println("Nhập lại!");
            }
        }while (true);
        System.out.println("Nhập ID Bệnh Nhân: BN-XXX ");
        String idBenhNhan;
        do {
            idBenhNhan = input.nextLine();
            if (Validate.checkIdBenhNhan(idBenhNhan)){
                benhNhanThuong.setIdBenhNhan(idBenhNhan);
                break;
            }else {
                System.out.println("Nhập lại!");
            }
        }while (true);
        System.out.println("Nhập Tên Bệnh Nhân: ");
        String name = input.nextLine();
        benhNhanVip.setName(name);
        System.out.println("Nhập Ngày Nhập Viện: dd/MM/yyyy ");
        String dayin;
        do {
            dayin = input.nextLine();
            if (Validate.checkday(dayin)){
                benhNhanVip.setDayIn(dayin);
                break;
            }else {
                System.out.println("Nhập lại!");
            }
        }while (true);


        System.out.println("Nhập Ngày Ra Viện: dd/MM/yyyy ");
        String dayout;
        do {
            dayout = input.nextLine();
            if (Validate.checkday(dayout)){
                benhNhanVip.setDayOut(dayout);
                break;
            }else {
                System.out.println("Nhập lại!");
            }
        }while (true);

        System.out.println("Lý Do Nhập Viện: ");
        String lido = input.nextLine();
        benhNhanVip.setLiDo(lido);
        System.out.println("Nhập Loại Vip (VIP I,VIP II,VIP III): ");
        String loai = input.nextLine();
        if (loai.contains("VIP I")){
            benhNhanVip.setVip1(loai);
        }else if (loai.contains("VIP II")){
            benhNhanVip.setVip2(loai);
        }else if (loai.contains("VIP III")){
            benhNhanVip.setVip3(loai);
        }
        System.out.println("Nhập Thời Hạn VIP: dd/MM/yyyy ");
        String thoiHan;
        do {
            thoiHan = input.nextLine();
            if (Validate.checkday(thoiHan)){
                benhNhanVip.setDayIn(thoiHan);
                break;
            }else {
                System.out.println("Nhập lại!");
            }
        }while (true);
        benhNhanVip.setTime(thoiHan);
        benhNhanVipList.add(benhNhanVip);
        writerAndRead.WriterBNV(benhNhanVipList,true);
    }
    public void deleteBNT(){
        List<BenhNhanThuong> benhNhanThuongList = writerAndRead.readBNT();
        String list = " ";

        for (int i =0; i<benhNhanThuongList.size();i++){
            list+=(i+1+"ID Bệnh Nhân: "+benhNhanThuongList.get(i).getIdBenhAn()+"\n ");
        }
        System.out.println(list);
        System.out.println("Chọn ID Muốn Xóa: ");
        int choose = input.nextInt();
        input.nextLine();
        benhNhanThuongList.remove(choose-1);
        writerAndRead.WriterBNT(benhNhanThuongList,false);
    }public void deleteBNV(){
        List<BenhNhanVip> benhNhanVipList = writerAndRead.readBNV();
        String list = " ";
        for (int i =0; i<benhNhanVipList.size();i++){
            list+=(i+1+"ID Bệnh Nhân: "+benhNhanVipList.get(i).getIdBenhAn()+"\n ");
        }
        System.out.println(list);
        System.out.println("Chọn ID Muốn Xóa: ");
        int choose = input.nextInt();
        input.nextLine();
        benhNhanVipList.remove(choose-1);
        writerAndRead.WriterBNV(benhNhanVipList,false);
    }
    public void delete() {
        System.out.println("Chọn bệnh án muốn xóa: ");
        System.out.println("1.Bệnh nhân thường"+"\n"+"2.Bệnh nhân VIP");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose){
            case 1:
                deleteBNT();
                break;
            case 2:
                deleteBNV();
                break;
        }
    }
//    public void deleteTest(){
//        List<BenhAn> benhAnList = writerAndRead.ReadBenhAn();
//        System.out.println("Nhập bệnh án muốn xóa: ");
//        String choose = input.nextLine();
//        for (int i = 0; i<benhAnList.size();i++){
//            try{
//                if (benhAnList.contains(choose)){
//                    benhAnList.remove(choose);
//                }
//
//            }catch (ExceptionDelete d){
//                d.printStackTrace();
//            }
//        }


    }

