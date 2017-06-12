
/*
This is the main class of the simulation, you could manage all the simulation from here.
 */
import CarSystems.Systems;
import CarSystems.SystemsFactory;
import GUI.Config;
public class Simulation {
    
    public static void main(String args[])
    {
    
//        Config tmp = new Config();
        SystemsFactory sys = new SystemsFactory();
        Systems Sys1 = sys.getSystem("Dash");
        Sys1.start();
        
        Sys1 = sys.getSystem("Obstacles");
        Sys1.start();
    }
    
}
