
/*
This is the main class of the simulation, you could manage all the simulation from here.
 */
import CarSystems.Dash;
import CarSystems.SystemsAbstract;
import GUI.Config;
import CarSystems.ISystems;
import CarSystems.Obstacles;
import CarSystems.SystemClass;
public class Simulation {
    
    public static void main(String args[])
    {
    
//        Config tmp = new Config();
        SystemsAbstract[] abstracciones = new SystemsAbstract[2];
        abstracciones[0] = new SystemClass(new Dash());
        abstracciones[1] = new SystemClass(new Obstacles());
        for(SystemsAbstract abstraccion:abstracciones)
            abstraccion.start();
    }
    
}
