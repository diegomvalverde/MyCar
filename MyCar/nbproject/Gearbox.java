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
public class Gearbox {
    String gearbox;
    int revolutionsPerSecond;
    
    public Gearbox(){
        this.gearbox = "1";
    }
    
    
    public void setRMP(int pRMP){
        this.revolutionsPerSecond += pRMP;
    }
    
    public int getRMP(){
        return this.revolutionsPerSecond;
    }
    
    public void setGearbox(String pGearcase){
        this.gearbox = pGearcase;
    }
    
    public String getGeatbox(){
        return this.gearbox;
    }
}
