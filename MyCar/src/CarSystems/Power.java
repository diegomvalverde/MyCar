package CarSystems;

/*
This is the class foe power om or of the car and other things
 */
public class Power implements ISystems
{
    private boolean light;
    private boolean brushes;
    private boolean der;
    private boolean izq;
    
    public Power()
    {
        this.der = false;
        this.izq = false;
        this.light = false;
        this.brushes = false;
    }
    @Override
    public void start()
    {
        System.out.println("CarSystems.Power.start()");
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
