package model.bean;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private String birthCustomer;
    private String genderCustomer;
    private int cmndCustomer;
    private int phoneCustomer;
    private String emailCustomer;
    private String addressCustomer;
    private int typeCustomer;

    public Customer(int idCustomer, String nameCustomer, String birthCustomer, String genderCustomer, int cmndCustomer,
                    int phoneCustomer, String emailCustomer, String addressCustomer, int typeCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.birthCustomer = birthCustomer;
        this.genderCustomer = genderCustomer;
        this.cmndCustomer = cmndCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.typeCustomer = typeCustomer;
    }

    public Customer() {
    }

    public Customer(int typeCustomer, String nameCustomer, String birthCustomer, String genderCustomer, int cmndCustomer, int phoneCustomer,
                    String emailCustomer, String addressCustomer) {
        this.typeCustomer = typeCustomer;
        this.nameCustomer = nameCustomer;
        this.birthCustomer = birthCustomer;
        this.genderCustomer = genderCustomer;
        this.cmndCustomer = cmndCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;

    }

    public Customer(int id, int type, String name, String birthDay, String gender, int cmnd, int phone, String email, String address) {
        this.idCustomer = id;
        this.typeCustomer = type;
        this.nameCustomer = name;
        this.birthCustomer = birthDay;
        this.genderCustomer = gender;
        this.cmndCustomer = cmnd;
        this.phoneCustomer = phone;
        this.emailCustomer = email;
        this.addressCustomer = address;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthCustomer() {
        return birthCustomer;
    }

    public void setBirthCustomer(String birthCustomer) {
        this.birthCustomer = birthCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public int getCmndCustomer() {
        return cmndCustomer;
    }

    public void setCmndCustomer(int cmndCustomer) {
        this.cmndCustomer = cmndCustomer;
    }

    public int getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(int phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public int getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(int typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
}
