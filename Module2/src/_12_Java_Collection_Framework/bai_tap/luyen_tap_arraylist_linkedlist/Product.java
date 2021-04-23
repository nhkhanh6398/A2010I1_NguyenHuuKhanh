package _12_Java_Collection_Framework.bai_tap.luyen_tap_arraylist_linkedlist;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private Integer mount;

    public Product(String id, String name, Integer mount) {
        this.id = id;
        this.name = name;
        this.mount = mount;
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

    public Integer getMount() {
        return mount;
    }

    public void setMount(Integer mount) {
        this.mount = mount;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id: '" + id + '\'' +
                ", name: '" + name + '\'' +
                ", mount: '" + mount + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.getMount() > o.getMount()) {
            return 1;
        } else if (this.getMount() == o.getMount()) {
            return this.getId().compareTo(o.getId());
        }else if(this.getId()== o.getId()){
            return this.getName().compareTo(o.getName());
        } else{
            return -1;
        }
    }
}
