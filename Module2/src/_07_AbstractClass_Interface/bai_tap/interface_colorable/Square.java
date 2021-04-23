package _07_AbstractClass_Interface.bai_tap.interface_colorable;

import _07_AbstractClass_Interface.bai_tap.interface_resizeable.Rectangle;
import _07_AbstractClass_Interface.bai_tap.interface_resizeable.Resizeable;

public class Square extends Shape implements Resizeable,Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                +getArea();
    }

    double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}