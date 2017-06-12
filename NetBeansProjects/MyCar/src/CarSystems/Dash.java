package CarSystems;

/*
This is the class for the dash of the car, it is basically to show information 
on the interface.
 */

public class Dash implements Systems
{
    private int Revolutions;
    private int Velocity;
    private boolean Ligths;
    private boolean WiperWasher;
    private int LosedPoints;
    
    Dash()
    {
    Revolutions = 0;
    Velocity = 0;
    Ligths = false;
    WiperWasher = false;
    LosedPoints = 0;
    }
    
    @Override
    public void start()
    {
        System.out.println("CarSystems.Dash.start()");
    }
    
}
