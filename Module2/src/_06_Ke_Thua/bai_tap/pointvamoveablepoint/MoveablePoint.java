package _06_Ke_Thua.bai_tap.pointvamoveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    protected float xSpeed;
    protected float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float xy[]={this.xSpeed,this.ySpeed};
        return xy;
    }
    public MoveablePoint move(){
        this.setX(this.getX()+xSpeed);
        this.setY(this.getY()+ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return
                "xSpeed " + xSpeed +"\n"+
                "ySpeed " + ySpeed +"\n"+
                "Speed: "+ Arrays.toString(getSpeed())+"\n"
                +super.toString()
                ;
    }
}
