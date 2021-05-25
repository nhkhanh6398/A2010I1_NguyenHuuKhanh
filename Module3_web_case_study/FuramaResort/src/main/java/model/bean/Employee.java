package model.bean;

public class Employee {
    private int idEmployee;
    private String nameEmployee;
    private String birthEmployee;
    private int cmndEmployee;
    private double salaryEmployee;
    private int phoneEmployee;
    private String emailEmployee;
    private String addressEmployee;
    private int educationIdEmployee;
    private int positionIdEmployee;
    private int divisionIdEmployee;
    private String usernameEmployee;



    public Employee() {
    }

    public Employee(int idEmployee, String nameEmployee, String birthEmployee, int cmndEmployee, double salaryEmployee,
                    int phoneEmployee, String emailEmployee, String addressEmployee, int educationIdEmployee, int positionIdEmployee, int divisionIdEmployee, String usernameEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.birthEmployee = birthEmployee;
        this.cmndEmployee = cmndEmployee;
        this.salaryEmployee = salaryEmployee;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.educationIdEmployee = educationIdEmployee;
        this.positionIdEmployee = positionIdEmployee;
        this.divisionIdEmployee = divisionIdEmployee;
        this.usernameEmployee = usernameEmployee;
    }

    public Employee(String name, String birthday, int cmnd, double salary, int phone, String email, String address, int position, int education, int division) {
        this.nameEmployee = name;
        this.birthEmployee = birthday;
        this.cmndEmployee = cmnd;
        this.salaryEmployee = salary;
        this.phoneEmployee = phone;
        this.emailEmployee = email;
        this.addressEmployee = address;
        this.educationIdEmployee = education;
        this.positionIdEmployee = position;
        this.divisionIdEmployee = division;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthEmployee() {
        return birthEmployee;
    }

    public void setBirthEmployee(String birthEmployee) {
        this.birthEmployee = birthEmployee;
    }

    public int getCmndEmployee() {
        return cmndEmployee;
    }

    public void setCmndEmployee(int cmndEmployee) {
        this.cmndEmployee = cmndEmployee;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public int getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(int phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public int getEducationIdEmployee() {
        return educationIdEmployee;
    }

    public void setEducationIdEmployee(int educationIdEmployee) {
        this.educationIdEmployee = educationIdEmployee;
    }

    public int getPositionIdEmployee() {
        return positionIdEmployee;
    }

    public void setPositionIdEmployee(int positionIdEmployee) {
        this.positionIdEmployee = positionIdEmployee;
    }

    public int getDivisionIdEmployee() {
        return divisionIdEmployee;
    }

    public void setDivisionIdEmployee(int divisionIdEmployee) {
        this.divisionIdEmployee = divisionIdEmployee;
    }

    public String getUsernameEmployee() {
        return usernameEmployee;
    }

    public void setUsernameEmployee(String usernameEmployee) {
        this.usernameEmployee = usernameEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", birthEmployee='" + birthEmployee + '\'' +
                ", cmndEmployee=" + cmndEmployee +
                ", salaryEmployee=" + salaryEmployee +
                ", phoneEmployee=" + phoneEmployee +
                ", emailEmployee='" + emailEmployee + '\'' +
                ", addressEmployee='" + addressEmployee + '\'' +
                ", educationIdEmployee=" + educationIdEmployee +
                ", positionIdEmployee=" + positionIdEmployee +
                ", divisionIdEmployee=" + divisionIdEmployee +
                ", usernameEmployee='" + usernameEmployee + '\'' +
                '}';
    }
}
