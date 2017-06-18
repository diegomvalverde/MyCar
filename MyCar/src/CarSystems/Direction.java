package CarSystems;

/*
This is the class that manage the direction of the car i7n the simulation.
 */
public class Direction implements ISystems
{
    private int Dir;
    
    public Direction()
    {
        Dir = 0;
    }
    @Override
    public void start()
    {
        System.out.println("CarSystems.Direction.start()");
    }
}
