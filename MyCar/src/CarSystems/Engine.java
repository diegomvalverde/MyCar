package CarSystems;

/*
this is the class forthe engine of the car
 */
public class Engine implements ISystems
{
//    private int Speed;
//    private int MechanicalGait;
    private String gearbox;
    private int speed;
    private int rmp;
    private int acceleration;
    
    public void setGearbox(String pGearcase){
        this.gearbox = pGearcase;
    }
    
    public String getGeatbox(){
        return this.gearbox;
    }
    
    public Engine()
    {
//        Speed = 0;
//        MechanicalGait = 0;
        this.gearbox = "1";
        this.speed = 0;
        this.rmp = 0;
        this.acceleration = 0;
    }
    
    @Override
    public void start()
    {
        System.out.println("CarSystems.Engine.start()");
    }

    
    public void setSpeed(int pRate){
        this.speed = pRate;
    }
    
    public void setRmp(int pRevolutions){
        this.rmp = pRevolutions;
    }
    
    public void setAcceleration(int pQuickness){
        this.acceleration = pQuickness;
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
