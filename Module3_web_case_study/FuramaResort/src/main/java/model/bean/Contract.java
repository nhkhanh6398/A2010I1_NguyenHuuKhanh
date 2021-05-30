package model.bean;

public class Contract {
    private int idContract;
    private String dayStart;
    private String dayEnd;
    private double deposit;
    private double total;
    private int idCustomer;
    private int idService;
    private int idEmployee;

    public Contract(String dayStart, String dayEnd, double deposit, double total, int idCustomer, int idService, int idEmployee) {
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.deposit = deposit;
        this.total = total;
        this.idCustomer = idCustomer;
        this.idService = idService;
        this.idEmployee = idEmployee;
    }

    public Contract() {
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Contract(int idContract, String dayStart, String dayEnd, double deposit, double total, int idCustomer, int idService, int idEmployee) {
        this.idContract = idContract;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.deposit = deposit;
        this.total = total;
        this.idCustomer = idCustomer;
        this.idService = idService;
        this.idEmployee = idEmployee;
    }
}
