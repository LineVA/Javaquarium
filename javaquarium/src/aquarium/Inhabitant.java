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
   private int age;
   
   public Inhabitant(int age){
       this.pv = 10;
       this.age = age;
   }
    
    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }
    
    public boolean isDying(){
        return (this.pv<1) || this.age>19;
    }
    
    public abstract void newTurn();
    
    public abstract void eaten();
}
