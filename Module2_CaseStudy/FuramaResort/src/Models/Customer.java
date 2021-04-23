package Models;

public class Customer {
    private String nameCustomer;
    private String birthDayCustomer;
    private String cmndCustomer;
    private int phoneCustomer;
    private String emailCustomer;
    private String genderCustomer;
    private String addressCustomer;
    private Services services;

    public Customer() {

    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customer(String nameCustomer, String birthDayCustomer, String cmndCustomer, int phoneCustomer, String emailCustomer,
                    String genderCustomer, String addressCustomer, Services services) {
        this.nameCustomer = nameCustomer;
        this.birthDayCustomer = birthDayCustomer;
        this.cmndCustomer = cmndCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.genderCustomer = genderCustomer;
        this.addressCustomer = addressCustomer;
        this.services = services;
    }


    public Customer(String nameCustomer, String birthDayCustomer, String cmndCustomer, int phoneCustomer, String emailCustomer
            , String typeCustomer, String addressCustomer) {
        this.nameCustomer = nameCustomer;
        this.birthDayCustomer = birthDayCustomer;
        this.cmndCustomer = cmndCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.genderCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;

    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDayCustomer() {
        return birthDayCustomer;
    }

    public void setBirthDayCustomer(String birthDayCustomer) {
        this.birthDayCustomer = birthDayCustomer;
    }

    public String getCmndCustomer() {
        return cmndCustomer;
    }

    public void setCmndCustomer(String cmndCustomer) {
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

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", birthDayCustomer='" + birthDayCustomer + '\'' +
                ", cmndCustomer=" + cmndCustomer +
                ", phoneCustomer=" + phoneCustomer +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", typeCustomer='" + genderCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
    public String showInfor(){
        return "Customer: "+
                "nameCustomer: " + nameCustomer + '\'' +
                ",birthDayCustomer: " + birthDayCustomer + '\'' +
                ",cmndCustomer: " + cmndCustomer +
                ",phoneCustomer: " + phoneCustomer +
                ",emailCustomer: " + emailCustomer + '\'' +
                ",typeCustomer: " + genderCustomer + '\'' +
                ",addressCustomer: " + addressCustomer + '\'' +
                '}';
    }
}
