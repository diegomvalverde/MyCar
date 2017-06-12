/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarSystems;

/**
 *
 * @author diegomv
 */
public class SystemsFactory {
    
    public Systems getSystem(String systemType){
      if(systemType == null){
         return null;
      }		
      if(systemType.equalsIgnoreCase("Dash")){
         return new Dash();
         
      } else if(systemType.equalsIgnoreCase("Direction")){
         return new Direction();
         
      } else if(systemType.equalsIgnoreCase("Engine")){
         return new Engine();
         
      } else if(systemType.equalsIgnoreCase("Obstacles")){
         return new Obstacles();
         
      } else if(systemType.equalsIgnoreCase("Power")){
         return new Power();
      }
      
      return null;
   }
    
}
