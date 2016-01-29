/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquarium;

/**
 *
 * @author doyenm
 */
public abstract class Inhabitant extends Aquarium{
    
   private int pv;
   
   public Inhabitant(){
       this.pv = 10;
   }
    
    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }
    
    public abstract void newTurn(); 
}
