package Bai_Tap.model;

public class BenhAn {
    private String stt;
    private String idBenhAn;
    private String idBenhNhan;
    private String name;
    private String dayIn;
    private String dayOut;
    private String liDo;

    public BenhAn(String stt, String idBenhAn, String idBenhNhan, String name, String dayIn, String dayOut, String liDo) {
        this.stt = stt;
        this.idBenhAn = idBenhAn;
        this.idBenhNhan = idBenhNhan;
        this.name = name;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.liDo = liDo;
    }

    public BenhAn() {

    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getIdBenhAn() {
        return idBenhAn;
    }

    public void setIdBenhAn(String idBenhAn) {
        this.idBenhAn = idBenhAn;
    }

    public String getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(String idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }

    public String getLiDo() {
        return liDo;
    }

    public void setLiDo(String liDo) {
        this.liDo = liDo;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "stt='" + stt + '\'' +
                ", idBenhAn='" + idBenhAn + '\'' +
                ", idBenhNhan='" + idBenhNhan + '\'' +
                ", name='" + name + '\'' +
                ", dayIn='" + dayIn + '\'' +
                ", dayOut='" + dayOut + '\'' +
                ", liDo='" + liDo + '\'' +
                '}';
    }
}
