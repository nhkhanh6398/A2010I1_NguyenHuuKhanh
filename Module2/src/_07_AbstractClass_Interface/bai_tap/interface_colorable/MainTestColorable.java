package _07_AbstractClass_Interface.bai_tap.interface_colorable;

public class MainTestColorable {
    public static void main(String[] args) {
        Shape[] shape1 = new Shape[3];
        shape1[0] = new Circle(5, "yellow", false);
        shape1[1] = new Rectangle(6,7, "red", false);
        shape1[2] = new Square(8, "yellow", false);
        Shape.printShape(shape1);
        for (Shape b : shape1){
            if ( b instanceof Colorable){
                ((Colorable)b).howToColor();
            }
        }

    }
}
