package _05_Access_modifier_Static.thuc_hanh;

public class StaticProperty {
    private String name;

    private String engine;



    public static int numberOfCars;

    public StaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public static void main(String[] args) {

        StaticProperty car1 = new StaticProperty("Mazda 3","Skyactiv 3");

        System.out.println(StaticProperty.numberOfCars);

        StaticProperty car2 = new StaticProperty("Mazda 6","Skyactiv 6");

        System.out.println(StaticProperty.numberOfCars);

    }

}

