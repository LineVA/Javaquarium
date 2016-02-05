/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquarium;

import java.util.ArrayList;

/**
 *
 * @author doyenm
 */
public abstract class CarnivorousFish extends Fish {

    public CarnivorousFish(String name, Sex sex, int age) {
        super(name, sex, age);
    }

 

    public boolean equas(Fish fish){
        return fish.getName().equals(this.getName());
    }

   public Inhabitant eat(ArrayList<Inhabitant> inList, 
           ArrayList<Inhabitant> dying) {
        // A carnivorous fish cannot eat if it is the only fish in the aquarium
       // Or if all the other fishes are dying
        if (inList.size() == 1 || inList.size() == dying.size() + 1) {
            return null;
        } else {
            int iEatable = super.getRandom().nextInt(inList.size());
            Inhabitant eatable = inList.get(iEatable);
            // If it chooses itself, it cannot eat at all (no other chance)
            if(eatable.equals(this)){
                return null;
            } else if(eatable.isDying()){
                // Because of a bad choice, the fish tries to eat itself
                // So it needs to choose a new meal
                // OR it chooses an already dying fish
                return eat(inList, dying);
            } else {
                eatable.eaten();
                this.setPv(this.getPv() + 5);
                return eatable;
            }
        }
    }

    @Override
    public void die() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isVegan() {
        return false;
    }

    @Override
    public boolean isCarnivorous() {
        return true;
    }

   
}
