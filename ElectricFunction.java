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
     boolean der;
    boolean izq;
    
    public ElectricFunction(){
        this.der = false;
        this.izq = false;
        this.light = false;
        this.brushes = false;
    }
    
    public void setDer(boolean pdirection){
        this.der = pdirection;
    }
    public void setIzq(boolean pdirection){
        this.izq = pdirection;
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
    
        public boolean getDer(){
        return this.der;
    }
    
    public boolean getIzq(){
        return this.izq;
    }
}
