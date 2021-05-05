public class Customer {
    private String name;
    private String dayOfBirth;
    private String diaChi;
    private String image;

    public Customer() {
    }

    public Customer(String name, String dayOfBirth, String diaChi, String image) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.diaChi = diaChi;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}