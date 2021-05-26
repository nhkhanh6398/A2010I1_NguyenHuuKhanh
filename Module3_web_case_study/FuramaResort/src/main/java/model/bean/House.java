package model.bean;

public class House extends Service {
    private String standardRoom;
    private String descriptionOtherConvenience;
    private int numberOfFloors;

    public House(int idService, String nameService, double areaService, String costService, int peopleMaxService, String typeRentService, String standardRoom, String descriptionOtherConvenience, int numberOfFloors) {
        super(idService, nameService, areaService, costService, peopleMaxService, typeRentService);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String standardRoom, String descriptionOtherConvenience, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
