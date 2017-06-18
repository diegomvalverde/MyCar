/*
This is the father class for the strees sections
*/
package Street;

public class StreetSection {
    protected int MinimumVelocity;
    protected int MaximunVelocity;
    protected boolean Nigth;
    protected boolean Morning;
    protected boolean Rain;
    
    public void info(int pMaxVelicity, int pMinVelocity, boolean pNigth, boolean pMorning, boolean pRain)
    {
        this.MaximunVelocity = pMaxVelicity;
        this.MinimumVelocity = pMinVelocity;
        this.Morning = pMorning;
        this.Nigth = pNigth;
        this.Rain = pRain;
    }
    
}
