package test.bt_them.service;

public class XeMay extends PhuongTien{
    private String congSuat;

    public XeMay(String bks, String nameHang, String year, String chuSoHuu) {
        super(bks, nameHang, year, chuSoHuu);
    }

    public XeMay(String bks, String nameHang, String year, String chuSoHuu, String congSuat) {
        super(bks, nameHang, year, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay() {

    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString()+
                "congSuat='" + congSuat + '\'' +
                '}';
    }
}
