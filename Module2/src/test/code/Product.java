package test.code;

public class Product {
    private String id;
    private String name;
    private String day;
    private int count;

    public Product(String id, String name, String day, int count) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.count = count;
    }

    public Product() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", count=" + count +
                '}';
    }
}
