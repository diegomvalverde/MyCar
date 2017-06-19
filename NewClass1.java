/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalcar;

/**
 *
 * @author ger08
 */
public class SectionsFactory {
    
    
    public StreetSection getSection(String type, int pMaxVelicity, int pMinVelocity, boolean pNigth, boolean pMorning, boolean pRain){
		
        if("Final".equalsIgnoreCase(type)){ 
            Final tmp = new Final();
            tmp.info(pMaxVelicity, pMinVelocity, pNigth, pMorning, pRain);
            return tmp;

        }
        else if("FourCorners".equalsIgnoreCase(type))
        {
            FourCorners tmp = new FourCorners();
            tmp.info(pMaxVelicity, pMinVelocity, pNigth, pMorning, pRain);
            return tmp;
        }
        else if("HunderdMeters".equalsIgnoreCase(type))
        {
            HundredMeters tmp = new HundredMeters();
            tmp.info(pMaxVelicity, pMinVelocity, pNigth, pMorning, pRain);
            return tmp;
        }
        else if("Intersection".equalsIgnoreCase(type))
        {
            Intersection tmp = new Intersection();
            tmp.info(pMaxVelicity, pMinVelocity, pNigth, pMorning, pRain);
            return tmp;
        }
        return null;
	}
    
    
}