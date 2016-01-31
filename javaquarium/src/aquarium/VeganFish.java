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
public abstract class VeganFish extends Fish {

    public VeganFish(String name, Sex sex, int age) {
        super(name, sex, age);
    }

   

    public Inhabitant eat(ArrayList<Inhabitant> inList, ArrayList<Inhabitant> dying) {
        // A vegan fish cannot eat if there is no seaweed in the aquarium
        // or all of them are dying
        if (inList.isEmpty() || dying.size() == inList.size()) {
            return null;
        } else {
            int iEatable = super.getRandom().nextInt(inList.size());
            // We check if the eatable seaweed is not dying 
            Inhabitant eatable = inList.get(iEatable);
            if (!eatable.isDying()) {
                eatable.eaten();
            this.setPv(this.getPv() + 3);
            return eatable;
            // If the seaweed is dying, we need to choose a new one
            } else {
                return eat(inList, dying);
            }
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
