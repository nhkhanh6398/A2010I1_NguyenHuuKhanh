package model.bean;

public class Service {
    private String nameService;
    private double areaService;
    private String costService;
    private int peopleMaxService;
    private String typeRentService;

    public Service(String nameService, double areaService, String costService, int peopleMaxService, String typeRentService) {
        this.nameService = nameService;
        this.areaService = areaService;
        this.costService = costService;
        this.peopleMaxService = peopleMaxService;
        this.typeRentService = typeRentService;
    }

    public Service() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaService() {
        return areaService;
    }

    public void setAreaService(double areaService) {
        this.areaService = areaService;
    }

    public String getCostService() {
        return costService;
    }

    public void setCostService(String costService) {
        this.costService = costService;
    }

    public int getPeopleMaxService() {
        return peopleMaxService;
    }

    public void setPeopleMaxService(int peopleMaxService) {
        this.peopleMaxService = peopleMaxService;
    }

    public String getTypeRentService() {
        return typeRentService;
    }

    public void setTypeRentService(String typeRentService) {
        this.typeRentService = typeRentService;
    }
}
