/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquarium;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author doyenm
 */
public interface FeedingPattern {

    public Inhabitant eat(Fish fish, ArrayList<Inhabitant> inList,
            ArrayList<Inhabitant> dying);

    public boolean isVegan();

    public boolean isCarnivorous();

}

class Carnivorous implements FeedingPattern {

    private Random random;

    public Carnivorous() {
        this.random = new Random();
    }

    @Override
    public Inhabitant eat(Fish fish, ArrayList<Inhabitant> inList, ArrayList<Inhabitant> dying) {
         // A carnivorous fish cannot eat if it is the only fish in the aquarium
        // Or if all the other fishes are dying
        if (inList.size() == 1 || inList.size() == dying.size() + 1) {
            return null;
        } else {
            int iEatable = this.random.nextInt(inList.size());
            Inhabitant eatable = inList.get(iEatable);
            // If it chooses itself, it cannot eat at all (no other chance)
            if (eatable.equals(fish)) {
                return null;
            } else if (eatable.isDying()) {
                // Because of a bad choice, the fish tries to eat itself
                // So it needs to choose a new meal
                // OR it chooses an already dying fish
                return eat(fish, inList, dying);
            } else {
                eatable.eaten();
                fish.setPv(fish.getPv() + 5);
                return eatable;
            }
        }
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
