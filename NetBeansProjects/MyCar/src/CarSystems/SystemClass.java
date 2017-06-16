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
public class SystemClass implements SystemsAbstract
{
    private ISystems implementador;
    public SystemClass(ISystems pImplementador){
        this.implementador = pImplementador;
    }
    @Override
    public void start() {
    implementador.start();    
    }

  


}
