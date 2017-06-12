package CarSystems;

/*
This is the class for the obxtacles of the simulation.
 */
public class Obstacles implements Systems
{
    private boolean Nigth;
    private int MaxVelocity;
    private int MinVelocity;
    private boolean Rain;
    
    Obstacles()
    {
        Nigth = false;
        MaxVelocity = 0;
        MinVelocity = 0;
        Rain = false;
    }
    
    @Override
    public void start()
    {
        System.out.println("CarSystems.Obstacles.start()");
    }
}
