package test.bt_them.control;

import test.bt_them.service.Oto;
import test.bt_them.service.PhuongTien;
import test.bt_them.service.XeMay;
import test.bt_them.service.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterAndRead {
    public void WriterXeTai(List<XeTai> phuongTienList, boolean selection) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\test\\bt_them\\file\\xetai.csv", selection);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (XeTai xeTai : phuongTienList) {
                bufferedWriter.write(xeTai.getBks() + "," + xeTai.getNameHang() + "," + xeTai.getYear() + "," +
                        xeTai.getChuSoHuu() + "," + xeTai.getTrongTai());
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

    public void WriterOto(List<Oto> otoList, boolean selection) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\test\\bt_them\\file\\oto.csv", selection);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Oto oto : otoList) {
                bufferedWriter.write(oto.getBks() + "," + oto.getNameHang() + "," + oto.getYear() + "," + oto.getChuSoHuu() + ","
                        + oto.getSoChoNgoi() + "," + oto.getKieuXe());
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

    public void WriterXeMay(List<XeMay> xeMayList, boolean selection) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\test\\bt_them\\file\\xemay.csv", selection);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (XeMay xeMay : xeMayList) {
                bufferedWriter.write(xeMay.getBks() + "," + xeMay.getNameHang() + "," + xeMay.getYear() + "," + xeMay.getChuSoHuu() + "," + xeMay.getCongSuat());
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

    public ArrayList<XeTai> readXeTai() {
        ArrayList<XeTai> xeTaiArrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\test\\bt_them\\file\\xetai.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arrayXetai = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayXetai = line.split(",");
                XeTai xeTai = new XeTai(arrayXetai[0], arrayXetai[1], arrayXetai[2], arrayXetai[3], arrayXetai[4]);
                xeTaiArrayList.add(xeTai);
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
        return xeTaiArrayList;
    }

    public ArrayList<Oto> readOto() {
        ArrayList<Oto> otoArrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\test\\bt_them\\file\\oto.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            String[] arrayOto = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayOto = line.split(",");
                Oto oto = new Oto(arrayOto[0], arrayOto[1], arrayOto[2], arrayOto[3],
                        arrayOto[4], arrayOto[5]);
                otoArrayList.add(oto);
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
        return otoArrayList;
    }
    public ArrayList<XeMay> readXeMay(){
        ArrayList<XeMay> xeMayArrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\test\\bt_them\\file\\xemay.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arrayXemay = null;
            while ((line=bufferedReader.readLine())!=null){
                XeMay xeMay = new XeMay(arrayXemay[0],arrayXemay[1],arrayXemay[2],arrayXemay[3],arrayXemay[4]);
                xeMayArrayList.add(xeMay);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }return xeMayArrayList;
    }
}
