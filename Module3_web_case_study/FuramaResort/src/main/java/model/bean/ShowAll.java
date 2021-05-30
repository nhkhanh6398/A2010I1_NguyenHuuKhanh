package model.bean;

public class ShowAll {
    private String name;
    private int idContract;
    private int idDetail;
    private String nameService;

    public ShowAll() {
    }

    public ShowAll(String name, int idContract, int idDetail, String nameService) {
        this.name = name;
        this.idContract = idContract;
        this.idDetail = idDetail;
        this.nameService = nameService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }
}
