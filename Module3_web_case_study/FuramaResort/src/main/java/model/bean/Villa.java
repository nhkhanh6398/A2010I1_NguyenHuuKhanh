package model.bean;

public class Villa extends Service {
    private String standardRoom;
    private String desciptionOtherConvenience;
    private double areaPool;
    private int numberOfFloors;

    public Villa(String nameService, double areaService, String costService, int peopleMaxService, String typeRentService,
                 String standardRoom, String desciptionOtherConvenience, double areaPool, int numberOfFloors) {
        super(nameService, areaService, costService, peopleMaxService, typeRentService);
        this.standardRoom = standardRoom;
        this.desciptionOtherConvenience = desciptionOtherConvenience;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String standardRoom, String desciptionOtherConvenience, double areaPool, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.desciptionOtherConvenience = desciptionOtherConvenience;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa() {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDesciptionOtherConvenience() {
        return desciptionOtherConvenience;
    }

    public void setDesciptionOtherConvenience(String desciptionOtherConvenience) {
        this.desciptionOtherConvenience = desciptionOtherConvenience;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
