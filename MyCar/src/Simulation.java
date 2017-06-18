
/*
This is the main class of the simulation, you could manage all the simulation from here.
 */
import CarSystems.Dash;
import CarSystems.SystemsAbstract;
import GUI.Config;
import CarSystems.ISystems;
import CarSystems.Obstacles;
import CarSystems.SystemClass;
import FileToStreet.FileProcessor;
import Street.StreetSection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
public class Simulation{
    private ArrayList<StreetSection> Road = new ArrayList<StreetSection>();
    private String File = "";

    public ArrayList<StreetSection> getRoad() {
        return Road;
    }

    public void setRoad(ArrayList<StreetSection> Road) {
        this.Road = Road;
    }

    public String getFile() {
        return File;
    }

    public void setFile(String File) {
        this.File = File;
    }
    
    public void getStreet()
    {
        FileProcessor tmp= new FileProcessor();
        tmp.process(File);
    }
    
    public static void main(String args[])
    {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    if ("com.sun.java.swing.plaf.gtk.GTKLookAndFeel".equals(info.getClassName())) {   
        try {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
        }
       break;
     } 
}
        Config tmp = new Config();
        tmp.setVisible(true);
    
//        System.out.println(tmp.getArchivo());
//        SystemsAbstract[] abstracciones = new SystemsAbstract[2];
//        abstracciones[0] = new SystemClass(new Dash());
//        abstracciones[1] = new SystemClass(new Obstacles());
//        for(SystemsAbstract abstraccion:abstracciones)
//            abstraccion.start();
    }
    
}
