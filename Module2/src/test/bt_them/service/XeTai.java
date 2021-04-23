package test.bt_them.service;

public class XeTai extends PhuongTien {
    private String trongTai;

    public XeTai(String bks, String nameHang, String year, String chuSoHuu) {
        super(bks, nameHang, year, chuSoHuu);
    }

    public XeTai(String bks, String nameHang, String year, String chuSoHuu, String trongTai) {
        super(bks, nameHang, year, chuSoHuu);
        this.trongTai = trongTai;
    }

    public XeTai() {
        super();
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" + super.toString()+
                "trongTai='" + trongTai + '\'' +
                '}';
    }
}
