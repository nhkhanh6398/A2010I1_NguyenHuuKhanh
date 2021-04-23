package Models;

public class Services implements Comparable<Services> {
    private String id;
    private String nameServices;
    private double areaUse;
    private int cost;
    private int amount;
    private int rentType;
    public Services(){

    }
    public Services(String id, String nameServices, double areaUse, int cost, int amount, int rentType) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUse = areaUse;
        this.cost = cost;
        this.amount = amount;
        this.rentType = rentType;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRentType() {
        return rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRentType(int rentType) {
        this.rentType = rentType;
    }


    public String showInfor() {
        return "Services{" +"ID: "+id+"\n"+
                "NameServices: " + nameServices + '\'' +
                "AreaUse: " + areaUse +
                "Cost: " + cost +
                "Amount: " + amount +
                "RentType: " + rentType;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", areaUse=" + areaUse +
                ", cost=" + cost +
                ", amount=" + amount +
                ", rentType=" + rentType;
    }

    @Override
    public int compareTo(Services o) {
        return this.nameServices.compareTo(o.nameServices);
    }
}
