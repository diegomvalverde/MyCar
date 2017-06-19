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
public class Motor extends Thread{
    public Gearbox gear;
    public MoveFunction move;
    public ElectricFunction elecSystem;
    boolean change;
    
    public Motor(){
        this.gear = new Gearbox();
        this.move = new MoveFunction();
        this.elecSystem = new ElectricFunction();
        this.change = true;
    }
    
    public int speed(){
        while (this.change){
            this.move.setSpeed();
        }
    }
}
