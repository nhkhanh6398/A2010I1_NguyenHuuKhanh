package _06_Ke_Thua.bai_tap.lopcirclevalopcylinder;

public class Cylinder extends LopCircle {
    public double height;

    public Cylinder(float banKinh, String color, double height) {
        super(banKinh, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTheTich(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "TheTich= "+ getTheTich()+
                '}';
    }
}
