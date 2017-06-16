package CarSystems;

/*
This is the class foe power om or of the car and other things
 */
public class Power implements ISystems
{
    private boolean Ligths;
    private int Directionals;
    private boolean WiperWasher;
    
    public Power()
    {
        Ligths = false;
        Directionals = 0;
        WiperWasher = false;
    }
    @Override
    public void start()
    {
        System.out.println("CarSystems.Power.start()");
    }
}
