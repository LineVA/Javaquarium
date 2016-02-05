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
public class Seaweed extends Inhabitant {
    
    public Seaweed(int age){
      super(age);
    }
    
    @Override
    public String toString(){
        return "A seaweed with "+ this.getPv() + " PV and aged of "+ this.getAge() + " years.";
    }

    @Override
    public void newTurn() {
        this.setPv(this.getPv() + 1);
        this.setAge(this.getAge() + 1);
    }

    @Override
    public void eaten() {
        this.setPv(this.getPv() - 2);
    }
    
}
