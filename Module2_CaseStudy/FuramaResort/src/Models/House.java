package Models;

public class House extends Services {
    private String typeRoom;
    private String otherService;
    private int numberFloor;

    public House(String id, String nameServices, double areaUse, int cost,
                 int amount, int rentType, String typeRoom, String other, int numberFloor) {
        super(id, nameServices, areaUse, cost, amount, rentType);
        this.typeRoom = typeRoom;
        this.otherService = other;
        this.numberFloor = numberFloor;
    }

    public House() {

    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getOtherService() {
        return otherService;
    }

    public void setOtherService(String otherService) {
        this.otherService = otherService;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String showInfor() {
        return "House{" +"ID: "+ this.getId()+
                ", Name: "+ this.getNameServices()+
                ", AreaUse: "+this.getAreaUse()+
                ", Cost: "+this.getCost()+
                ", Amount: "+this.getAmount()+
                ", RentType: "+this.getRentType()+
                ", TypeRoom: " + this.getTypeRoom()  +
                ", Other: " + this.getOtherService() +
                ", numberFloor: " + this.getNumberFloor() +
                '}';
    }

    @Override
    public String toString() {
        return "House{" + "ID: "+ this.getId()+
                ", Name: "+ this.getNameServices()+
                ", AreaUse: "+this.getAreaUse()+
                ", Cost: "+this.getCost()+
                ", Amount: "+this.getAmount()+
                ", RentType: "+this.getRentType()+
                "typeRoom='" + typeRoom + '\'' +
                ", otherService='" + otherService + '\'' +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
