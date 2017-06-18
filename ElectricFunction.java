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
public class ElectricFunction {
    boolean light;
    boolean brushes;
    
    public ElectricFunction(){
        this.light = false;
        this.brushes = false;
    }
    
    public void setLights(boolean pOn){
        this.light = pOn;
    }
    
    public void setBrushes(boolean pOn){
        this.light = pOn;
    }
    
    public boolean getLights(){
        return this.light;
    }
    
    public boolean getBrushes(){
        return this.brushes;
    }
}
