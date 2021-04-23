package _06_Ke_Thua.bai_tap.lopcirclevalopcylinder;

public class LopCircle {
    public float banKinh;
    public String color;

    public float getBanKinh() {
        return banKinh;
    }
    public LopCircle(){

    }

    public LopCircle(float banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getArea(){
        return Math.PI*Math.pow(banKinh,2);
    }

    @Override
    public String toString() {
        return "LopCircle{" +
                "banKinh=" + banKinh +
                ", color='" + color + '\'' +
                "DienTich = "+getArea()+
                '}';
    }
}
