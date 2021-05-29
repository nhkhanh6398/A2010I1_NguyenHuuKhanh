package model.bean;

public class Service {
    private int idService;
    private String nameService;
    private double areaService;
    private double costService;
    private int peopleMaxService;
    private String typeRentService;

    public Service(int idService, String nameService, double areaService, double costService, int peopleMaxService, String typeRentService) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaService = areaService;
        this.costService = costService;
        this.peopleMaxService = peopleMaxService;
        this.typeRentService = typeRentService;
    }

    public Service(String nameService, double areaService, double costService, int peopleMaxService, String typeRentService) {
        this.nameService = nameService;
        this.areaService = areaService;
        this.costService = costService;
        this.peopleMaxService = peopleMaxService;
        this.typeRentService = typeRentService;
    }

    public Service() {
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
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

    public double getCostService() {
        return costService;
    }

    public void setCostService(double costService) {
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
