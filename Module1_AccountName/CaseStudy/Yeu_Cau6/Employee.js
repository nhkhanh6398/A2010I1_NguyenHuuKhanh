class Employee{
    constructor() {

    }
    getName(){
        return this.name;
    };
    getBirtday(){
        return this.birtday;
    };
    getPhone(){
        return this.phone;
    };
    getEmail(){
        return this.email;
    };
    getCmnd(){
        return this.cmnd;
    };
    getLevel(){
        return this.level;
    };
    getLocation(){
        return this.location;
    };
    getSalary(){
        if (this.getLocation()==="Manager"){
            this.salary=500;
        }else if (this.getLocation()==="Sale"){
            this.salary=300;
        }else if (this.getLocation()==="Marketing"){
            this.salary=200;
        }
        return this.salary;
    }
    setName(name){
        this.name=name;
    };
    setBirtday(birtday){
        this.birtday=birtday;
    };
    setPhone(phone){
        this.phone=phone;
    };
    setEmail(email){
        this.email=email;
    };
    setCmnd(cmnd){
        this.cmnd=cmnd;
    };
    setLevel(level){
        this.level=level;
    };
    setLocation(location){
        this.location=location;
    };
    setSalary(salary){
        this.salary=salary;
    }

}