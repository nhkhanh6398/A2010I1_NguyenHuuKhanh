package Bai_Tap.model;

public class BenhNhanVip extends BenhAn {
    private String vip1;
    private String vip2;
    private String vip3;
    private String time;


    public BenhNhanVip(String stt, String idBenhAn, String idBenhNhan, String name, String dayIn, String dayOut, String liDo) {
        super(stt, idBenhAn, idBenhNhan, name, dayIn, dayOut, liDo);
    }

    public BenhNhanVip(String stt, String idBenhAn, String idBenhNhan, String name, String dayIn, String dayOut, String liDo, String vip1, String vip2, String vip3,String time) {
        super(stt, idBenhAn, idBenhNhan, name, dayIn, dayOut, liDo);
        this.vip1 = vip1;
        this.vip2 = vip2;
        this.vip3 = vip3;
        this.time = time;
    }

    public BenhNhanVip() {

    }

    public String getVip1() {
        return vip1;
    }

    public void setVip1(String vip1) {
        this.vip1 = vip1;
    }

    public String getVip2() {
        return vip2;
    }

    public void setVip2(String vip2) {
        this.vip2 = vip2;
    }

    public String getVip3() {
        return vip3;
    }

    public void setVip3(String vip3) {
        this.vip3 = vip3;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "BenhNhanVip{" +
                "vip1='" + vip1 + '\'' +
                ", vip2='" + vip2 + '\'' +
                ", vip3='" + vip3 + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
