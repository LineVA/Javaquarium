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
public class CarnivorousFish extends Fish {

    public CarnivorousFish(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public String toString() {
        return "A fish named " + super.getName() + ", a " + super.getSex()
                + ", carnivorious and has "+ this.getPv() + " PV.";
    }

    public boolean equas(Fish fish){
        return fish.getName().equals(this.getName());
    }
    
//    @Override
//    public boolean eat(Inhabitant eatable) {
//        if(eatable instanceof Fish){
//            if(eatable.equals(this)){
//                return false;
//            } else {
//                System.out.println(this.getName() + " eats ");
//                return true;
//            }
//        } else {
//            return false;
//        }
//    }

   public Inhabitant eat(ArrayList<Inhabitant> inList, 
           ArrayList<Inhabitant> dying) {
        // A carnivorous fish cannot eat if it is the only fish in the aquarium
       // Or if all the other fishes are dying
        if (inList.size() == 1 || inList.size() == dying.size() + 1) {
            return null;
        } else {
            int iEatable = super.getRandom().nextInt(inList.size());
            Inhabitant eatable = inList.get(iEatable);
            if(eatable.equals(this)){
                // Because of a bad choice, the fish tries to eat itself
                // So it needs to choose a new meal
                return eat(inList, dying);
            } else {
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
