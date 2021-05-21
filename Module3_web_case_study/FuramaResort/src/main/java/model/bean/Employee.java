package model.bean;

public class Employee {
    private String nameEmployee;
    private String birthEmployee;
    private int cmndEmployee;
    private int phoneEmployee;
    private String emailEmployee;
    private String educationEmployee;
    private String positionEmployee;
    private double salaryEmployee;

    public Employee(String nameEmployee, String birthEmployee, int cmndEmployee, int phoneEmployee, String emailEmployee,
                    String educationEmployee, String positionEmployee, double salaryEmployee) {
        this.nameEmployee = nameEmployee;
        this.birthEmployee = birthEmployee;
        this.cmndEmployee = cmndEmployee;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.educationEmployee = educationEmployee;
        this.positionEmployee = positionEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public Employee() {
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

    public String getEducationEmployee() {
        return educationEmployee;
    }

    public void setEducationEmployee(String educationEmployee) {
        this.educationEmployee = educationEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }
}
