package _05_Access_modifier_Static.bai_tap;

public class Circle {
    private double radius=1.0;
    private double area;
    private String color = "red";


    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return area;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


}
