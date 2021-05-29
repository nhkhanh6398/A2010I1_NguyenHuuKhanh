package model.bean;

public class Customer {
    private int idCustomer;
    private String codeCustomer;
    private String nameCustomer;
    private String birthCustomer;
    private String genderCustomer;
    private String cmndCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String addressCustomer;
    private int typeCustomer;

    public Customer(int idCustomer, String codeCustomer, String nameCustomer, String birthCustomer, String genderCustomer,
                    String cmndCustomer, String phoneCustomer, String emailCustomer, String addressCustomer, int typeCustomer) {
        this.idCustomer = idCustomer;
        this.codeCustomer = codeCustomer;
        this.nameCustomer = nameCustomer;
        this.birthCustomer = birthCustomer;
        this.genderCustomer = genderCustomer;
        this.cmndCustomer = cmndCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.typeCustomer = typeCustomer;
    }

    public Customer(int idCustomer, String nameCustomer, String birthCustomer, String genderCustomer, String cmndCustomer,
                    String phoneCustomer, String emailCustomer, String addressCustomer, int typeCustomer) {
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

    public Customer(int typeCustomer, String nameCustomer, String birthCustomer, String genderCustomer, String cmndCustomer, String phoneCustomer,
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

    public Customer(int id, int type, String name, String birthDay, String gender, String cmnd, String phone, String email, String address) {
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

    public String getCmndCustomer() {
        return cmndCustomer;
    }

    public void setCmndCustomer(String cmndCustomer) {
        this.cmndCustomer = cmndCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
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

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public void setTypeCustomer(int typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
}
