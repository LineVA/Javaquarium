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
    
    int id;
    
    public Seaweed(){
        //this.id = super.seaweedsList.size();
    }
    
    @Override
    public String toString(){
        return "A seaweed";
    }

    @Override
    public void die() {
        System.out.println("A weed is dying.");
        super.die(this);
    }
    
    
}
