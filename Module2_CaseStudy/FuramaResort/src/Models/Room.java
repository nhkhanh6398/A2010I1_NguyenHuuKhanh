package Models;

public class Room extends Services {
    private String freeServices;

    public Room(String id, String nameServices, double areaUse, int cost, int amount, int rentType, String freeServices) {
        super(id, nameServices, areaUse, cost, amount, rentType);
        this.freeServices = freeServices;
    }

    public Room() {

    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String showInfor() {
        return "Room{" +"ID: "+this.getId()+
                ", Name: "+ this.getNameServices()+
                ", AreaUse: "+this.getAreaUse()+
                ", Cost: "+this.getCost()+
                ", Amount: "+this.getAmount()+
                ", RentType: "+this.getRentType()+
                ", FreeServices: " + this.getFreeServices()+
                '}';
    }

    @Override
    public String toString() {
        return "Room{" +"ID: "+this.getId()+
                ", Name: "+ this.getNameServices()+
                ", AreaUse: "+this.getAreaUse()+
                ", Cost: "+this.getCost()+
                ", Amount: "+this.getAmount()+
                ", RentType: "+this.getRentType()+
                ", FreeServices: " + this.getFreeServices()+
                '}';
    }
}
