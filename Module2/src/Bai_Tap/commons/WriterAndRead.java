package Bai_Tap.commons;

import Bai_Tap.model.BenhAn;
import Bai_Tap.model.BenhNhanThuong;
import Bai_Tap.model.BenhNhanVip;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriterAndRead {
    public void WriterBNT(List<BenhNhanThuong> benhNhanThuongList, boolean selection) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\Bai_Tap\\data\\medical_records.csv", selection);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (BenhNhanThuong benhNhanThuong : benhNhanThuongList) {
                bufferedWriter.write(benhNhanThuong.getStt() + "," + benhNhanThuong.getIdBenhAn() + "," + benhNhanThuong.getIdBenhNhan() + "," +
                        benhNhanThuong.getName() + "," + benhNhanThuong.getDayIn() + "," + benhNhanThuong.getDayOut() + "," + benhNhanThuong.getLiDo() +
                        "," + benhNhanThuong.getCount());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void WriterBNV(List<BenhNhanVip> benhNhanVipList, boolean selection) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\Bai_Tap\\data\\medical_records.csv", selection);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (BenhNhanVip benhNhanVip : benhNhanVipList) {
                bufferedWriter.write(benhNhanVip.getStt() + "," + benhNhanVip.getIdBenhAn() + "," + benhNhanVip.getIdBenhNhan() + "," +
                        benhNhanVip.getName() + "," + benhNhanVip.getDayIn() + "," + benhNhanVip.getDayOut() + "," + benhNhanVip.getLiDo() + ","
                        + benhNhanVip.getVip1() + benhNhanVip.getVip2() + benhNhanVip.getVip3() + "," + benhNhanVip.getTime());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<BenhAn> ReadBenhAn() {

        try {
            FileReader fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\Bai_Tap\\data\\medical_records.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<BenhNhanThuong> readBNT() {
        ArrayList<BenhNhanThuong> benhNhanThuongArrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\Bai_Tap\\data\\medical_records.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            String[] arrayBNT = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayBNT = line.split(",");
                BenhNhanThuong benhNhanThuong = new BenhNhanThuong(arrayBNT[0], arrayBNT[1], arrayBNT[2], arrayBNT[3],
                        arrayBNT[4], arrayBNT[5], arrayBNT[6], Integer.parseInt(arrayBNT[7]));
                benhNhanThuongArrayList.add(benhNhanThuong);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return benhNhanThuongArrayList;
    }

    public ArrayList<BenhNhanVip> readBNV() {
        ArrayList<BenhNhanVip> benhNhanVipArrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\Bai_Tap\\data\\medical_records.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            String[] arrayBNV = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayBNV = line.split(",");
                BenhNhanVip benhNhanVip = new BenhNhanVip(arrayBNV[0], arrayBNV[1], arrayBNV[2], arrayBNV[3], arrayBNV[4],
                        arrayBNV[5], arrayBNV[6], arrayBNV[7], arrayBNV[8], arrayBNV[9], arrayBNV[10]);
                benhNhanVipArrayList.add(benhNhanVip);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return benhNhanVipArrayList;
    }
}
