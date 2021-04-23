class GameBall {
    constructor() {
        this.doRong = doRong;
        this.doDai = doDai;
    }
    setDoRong(dorong){
        this.doRong= dorong;
    }
    setDoDai(){
        return this.doDai;
    }
}
class Ball {
    constructor() {
        this.toaDoX=toadoX;
        this.toaDoY=toadoY;
        this.diChuyen = dichuyen;
        this.tocDo = tocdo;
        this.vaCham = vaCham;
    }
    setToaDoY(toadoY){
        this.toaDoY=toadoY;
    }
    setToDoX(toadoX){
        this.toaDoX=toadoX;
    }
    setDichuyen(dichuyen){
        this.diChuyen=dichuyen;
    }
    setTocDo(tocdo){
        this.tocDo = tocdo;
    }
    setVaCham(vacham){
        this.vaCham=vacham;
    }
    getToaDoY(){
        return this.toaDoY;
    }
    getToaDoX(){
        return this.toaDoX;
    }
    getDichuyen(){
        return this.diChuyen;
    }
    getTocDo(){
        return this.tocDo;
    }
    getVaCham(){
        return this.vaCham;
    }
}
class Bar {
    constructor() {
        this.doRongBar = dorongbar;
        this.toaDoX= toadoX;
    }
    
}