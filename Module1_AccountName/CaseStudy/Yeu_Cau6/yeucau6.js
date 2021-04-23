class Custommer {
    constructor() {
        // this.name = "";
        // this.email = "";
        // this.birtday = "";
        // this.cmnd = "";
        // this.address = "";
        // this.customer1 = "";
        // this.typeService = "";
        // this.discount = "";
        // this.slDikem = "";
        // this.renDay = "";
        // this.typeRoom = "";
    };
    setName(name){
        this.name=name;
    };
    getName(){
        return this.name;
    };
    setEmail(email){
        this.email = email;
    };
    getEmail(){
        return this.email;
    };
    setBirtday(birthday){
        this.birtday = birthday;
    };
    getBirtday(){
        return this.birtday;
    };
    setCmnd(cmnd){
        this.cmnd = cmnd;
    };
    getCmnd(){
        return this.cmnd;
    };
    setAddress(address){
        this.address = address;
    };
    getAddress(){
        return this.address;
    };
    setCustomer1(customer1){
        this.customer1 = customer1;
    };
    getCustomer1(){
        return this.customer1;
    };
    setTypeService(typeService){
        this.typeService = typeService;
    };
    getTypeService(){
        return this.typeService;
    };
    setDiscount(discount){
        this.discount = discount;
    };
    getDiscount(){
        return this.discount;
    };
    setSlDikem(slDikem){
        this.slDikem = slDikem;
    };
    getSlDikem(){
        return this.slDikem;
    };
    setRenday(renDay){
        this.renDay = renDay;
    };
    getRenday(){
        return this.renDay;
    }
    setTypeRoom(typeRoom){
        this.typeRoom = typeRoom;
    };
    getTypeRoom(){
        return this.typeRoom;
    }
    totalPay(){
        let ipayService = 0;
        if (this.getTypeService()==="Villa"){
            ipayService=500;
        }else if(this.getTypeService()==="House"){
            ipayService=300;
        }else if(this.getTypeService()==="Room"){
            ipayService=100;
        }
        return this.getRenday()*ipayService*(1-this.getDiscount()/100);
    }
}
