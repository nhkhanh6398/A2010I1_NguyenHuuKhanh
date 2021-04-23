package test.bt_them.service;

public class PhuongTien {
    private String bks;
    private String nameHang;
    private String year;
    private String chuSoHuu;

    public PhuongTien(String bks, String nameHang, String year, String chuSoHuu) {
        this.bks = bks;
        this.nameHang = nameHang;
        this.year = year;
        this.chuSoHuu = chuSoHuu;
    }

    public PhuongTien() {

    }

    public String getBks() {
        return bks;
    }

    public void setBks(String bks) {
        this.bks = bks;
    }

    public String getNameHang() {
        return nameHang;
    }

    public void setNameHang(String nameHang) {
        this.nameHang = nameHang;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "bks='" + bks + '\'' +
                ", nameHang='" + nameHang + '\'' +
                ", year='" + year + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
