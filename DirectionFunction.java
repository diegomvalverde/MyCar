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
public class DirectionFunction {
    boolean der;
    boolean izq;
    
    public DirectionFunction(){
        this.der = false;
        this.izq = false;
    }
    
    public void setDer(boolean pdirection){
        this.der = pdirection;
    }
    public void setIzq(boolean pdirection){
        this.izq = pdirection;
    }
    
    public boolean getDer(){
        return this.der;
    }
    
    public boolean getIzq(){
        return this.izq;
    }
}
