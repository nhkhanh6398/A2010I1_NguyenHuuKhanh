package model.bean;

public class Room extends Service {
    private String serviceFree;

    public Room(String nameService, double areaService, String costService, int peopleMaxService, String typeRentService, String serviceFree) {
        super(nameService, areaService, costService, peopleMaxService, typeRentService);
        this.serviceFree = serviceFree;
    }

    public Room() {
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }
}
