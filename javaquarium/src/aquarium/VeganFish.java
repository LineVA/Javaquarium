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
public class VeganFish extends Fish {

    public VeganFish(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public String toString() {
        return "A fish named " + super.getName() + ", a " + super.getSex()
                + " and vegetarian.";
    }

    public Inhabitant eat(ArrayList<Inhabitant> inList, ArrayList<Inhabitant> dying) {
        // A vegan fish cannot eat if there is no seaweed in the aquarium
        if (inList.isEmpty()) {
            return null;
        } else {
            int iEatable = super.getRandom().nextInt(inList.size());
            return inList.get(iEatable);
        }
    }

    @Override
    public void die() {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isVegan() {
        return true;
    }

    @Override
    public boolean isCarnivorous() {
        return false;
    }

}
