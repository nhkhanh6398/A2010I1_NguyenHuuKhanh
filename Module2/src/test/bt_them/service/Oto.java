package test.bt_them.service;

public class Oto extends PhuongTien {
    private String soChoNgoi;
    private String kieuXe;

    public Oto(String bks, String nameHang, String year, String chuSoHuu) {
        super(bks, nameHang, year, chuSoHuu);
    }

    public Oto(String bks, String nameHang, String year, String chuSoHuu, String soChoNgoi, String kieuXe) {
        super(bks, nameHang, year, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto() {

    }

    public String getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +super.toString()+
                "soChoNgoi='" + soChoNgoi + '\'' +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
