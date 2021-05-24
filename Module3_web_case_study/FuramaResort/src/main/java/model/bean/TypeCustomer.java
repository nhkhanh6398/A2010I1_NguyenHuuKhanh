package model.bean;

public class TypeCustomer {
    private int idType;
    private String nameType;

    public TypeCustomer(int idType, String nameType) {
        this.idType = idType;
        this.nameType = nameType;
    }

    public TypeCustomer() {
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
