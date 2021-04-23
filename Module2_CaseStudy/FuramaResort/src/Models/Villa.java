package Models;

public class Villa extends Services {
    private String typeRoom;
    private String otherService;
    private double areaLake;
    private int numberFloor;
    public Villa(){}

    public Villa(String id, String nameServices, double areaUse, int cost, int amount,
                 int rentType, String typeRoom, String other, double areaLake, int numberFloor) {
        super(id, nameServices, areaUse, cost, amount, rentType);
        this.typeRoom = typeRoom;
        this.otherService = other;
        this.areaLake = areaLake;
        this.numberFloor = numberFloor;
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

    public double getAreaLake() {
        return areaLake;
    }

    public void setAreaLake(double areaLake) {
        this.areaLake = areaLake;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String showInfor() {
        return "Villa{" +"ID: "+this.getId()+","+
                "Name: "+ this.getNameServices()+','+
                "AreaUse: "+this.getAreaUse()+','+
                "Cost: "+this.getCost()+','+
                "Amount: "+this.getAmount()+","+
                "RentType: "+this.getRentType()+","+
                "TypeRoom: " + this.getTypeRoom() + ',' +
                "Other: " + this.getOtherService() + ',' +
                "AreaLake: " + this.getAreaLake() + ','+
                "NumberFloor: " + this.getNumberFloor() +
                '}';
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "typeRoom='" + typeRoom + '\'' +
                ", otherService='" + otherService + '\'' +
                ", areaLake=" + areaLake +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
