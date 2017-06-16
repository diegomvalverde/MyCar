package CarSystems;

/*
this is the class forthe engine of the car
 */
public class Engine implements ISystems
{
    private int Speed;
    private int MechanicalGait;
    
    public Engine()
    {
        Speed = 0;
        MechanicalGait = 0;
    }
    
    @Override
    public void start()
    {
        System.out.println("CarSystems.Engine.start()");
    }
}
