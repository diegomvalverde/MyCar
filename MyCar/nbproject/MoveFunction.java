/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewcarfunction;

/**
 *
 * @author ger08
 */
public class MoveFunction{
    int speed;
    int rmp;
    int acceleration;
    
    public MoveFunction(){
        this.speed = 0;
        this.rmp = 0;
        this.acceleration = 0;
    }
    
    public void setSpeed(){
        this.speed += this.acceleration;
    }
    
    public void setRmp(int pRevolutions){
        this.rmp = pRevolutions;
    }
    
    public void lowSpeed(){
        this.speed -= this.acceleration;
    }
    
    public void setAcceleration(int pQuickness){
        this.acceleration = pQuickness;
    }
    
    public void decelerate(){
        this.speed += this.acceleration;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public int getRmp(){
        return this.rmp;
    }
    
    public int getAcceleration(){
        return this.acceleration;
    }
}
