package Bai_Tap.model;

public class BenhNhanThuong extends BenhAn {
    private int count;


    public BenhNhanThuong(String stt, String idBenhAn, String idBenhNhan, String name, String dayIn, String dayOut, String liDo) {
        super(stt, idBenhAn, idBenhNhan, name, dayIn, dayOut, liDo);
    }

    public BenhNhanThuong(String stt, String idBenhAn, String idBenhNhan, String name, String dayIn, String dayOut, String liDo, int count) {
        super(stt, idBenhAn, idBenhNhan, name, dayIn, dayOut, liDo);
        this.count = count;
    }

    public BenhNhanThuong() {
        super();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" + super.toString()+
                "count=" + count +
                '}';
    }
}
