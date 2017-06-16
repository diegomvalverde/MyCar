/*
This is the father class for the strees sections
*/
package Street;

public class StreetSection {
    int MinimumVelocity;
    int MaximunVelocity;
    boolean Nigth;
    boolean Morning;
    
    void info(int pMaxVelicity, int pMinVelocity, boolean pNigth, boolean pMorning)
    {
        this.MaximunVelocity = pMaxVelicity;
        this.MinimumVelocity = pMinVelocity;
        this.Morning = pMorning;
        this.Nigth = pNigth;
    }
    
}
