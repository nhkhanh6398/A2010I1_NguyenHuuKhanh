package bean;

public class TComplex {
    private String id;
    private int area;
    private String status;
    private int floot;
    private String typeRoom;
    private String describe;
    private int rent;
    private String dayStart;
    private String dayEnd;

    public TComplex() {
    }

    public TComplex(String id, int area, String status, int floot, String typeRoom, String describe, int rent, String dayStart, String dayEnd) {
        this.id = id;
        this.area = area;
        this.status = status;
        this.floot = floot;
        this.typeRoom = typeRoom;
        this.describe = describe;
        this.rent = rent;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFloot() {
        return floot;
    }

    public void setFloot(int floot) {
        this.floot = floot;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }
}
