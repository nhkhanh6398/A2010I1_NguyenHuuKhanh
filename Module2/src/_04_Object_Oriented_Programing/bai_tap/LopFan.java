package _04_Object_Oriented_Programing.bai_tap;

public class LopFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public LopFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString(){
        if (this.on==true){
            return "LopFan " + "speed " + speed +
                    ",radius " + radius +
                    ",color " + color +" Fan is on";
        }else{
            return "LopFan " + "speed " + speed +
                    ",radius " + radius +
                    ",color " + color +" Fan is off";
        }
    }


    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        double radius;
        LopFan Fan1 = new LopFan(FAST, true, 10, "yellow");
        LopFan Fan2 = new LopFan(MEDIUM, false, 5, "blue");
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
    }
}

