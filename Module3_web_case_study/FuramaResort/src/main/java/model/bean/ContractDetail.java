package model.bean;

public class ContractDetail {
    private  int idDetail;
    private int idContract;
    private int idServiceAttach;
    private int quatily;

    public ContractDetail(int idDetail, int idContract, int idServiceAttach, int quatily) {
        this.idDetail = idDetail;
        this.idContract = idContract;
        this.idServiceAttach = idServiceAttach;
        this.quatily = quatily;
    }

    public ContractDetail(int idContract, int idServiceAttach, int quatily) {
        this.idContract = idContract;
        this.idServiceAttach = idServiceAttach;
        this.quatily = quatily;
    }

    public ContractDetail() {
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdServiceAttach() {
        return idServiceAttach;
    }

    public void setIdServiceAttach(int idServiceAttach) {
        this.idServiceAttach = idServiceAttach;
    }

    public int getQuatily() {
        return quatily;
    }

    public void setQuatily(int quatily) {
        this.quatily = quatily;
    }
}
