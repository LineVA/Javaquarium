/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author doyenm
 */
public class Aquarium {

    private ArrayList<Inhabitant> fishesList;
    private ArrayList<Inhabitant> seaweedsList;
    private ArrayList<Inhabitant> dyingFishesList;
    private ArrayList<Inhabitant> dyingSeaweedsList;

    private Random random;

    public Aquarium() {
        fishesList = new ArrayList<>();
        seaweedsList = new ArrayList<>();
        dyingFishesList = new ArrayList<>();
        dyingSeaweedsList = new ArrayList<>();
        random = new Random();

    }

    public Random getRandom() {
        return random;
    }

    public ArrayList<Inhabitant> getFishesList() {
        return fishesList;
    }

    public void setFishesList(ArrayList<Inhabitant> fishesList) {
        this.fishesList = fishesList;
    }

    public ArrayList<Inhabitant> getSeaweedsList() {
        return seaweedsList;
    }

    public void setSeaweedsList(ArrayList<Inhabitant> seaweedsList) {
        this.seaweedsList = seaweedsList;
    }

    public ArrayList<Inhabitant> getDyingFishesList() {
        return dyingFishesList;
    }

    public void setDyingFishesList(ArrayList<Inhabitant> dyingFishesList) {
        this.dyingFishesList = dyingFishesList;
    }

    public ArrayList<Inhabitant> getDyingSeaweedsList() {
        return dyingSeaweedsList;
    }

    public void setDyingSeaweedsList(ArrayList<Inhabitant> dyingSeaweedsList) {
        this.dyingSeaweedsList = dyingSeaweedsList;
    }

    public void addFish(Fish fish) {
        fishesList.add(fish);
    }

    public void addSeaweed(Seaweed weed) {
        seaweedsList.add(weed);
    }

    private void die(Inhabitant in) {
        if (in instanceof Seaweed) {
            dyingSeaweedsList.add(in);
        } else if (in instanceof Fish) {
            dyingFishesList.add(in);
        }
    }

    public void die() {
        fishesList.removeAll(dyingFishesList);
        dyingFishesList.clear();
        seaweedsList.removeAll(dyingSeaweedsList);
        this.dyingSeaweedsList.clear();
    }

    public boolean isDying(Inhabitant fish) {
        return dyingFishesList.contains(fish);
    }

    public void eatVegan(Fish fish) {
        Inhabitant eatable = fish.eat(seaweedsList, dyingSeaweedsList);
        if (eatable != null) {
            System.out.println(fish.getName()
                    + " is eating a seaweed.");
            if (eatable.isDying()) {
                die(eatable);
            }
        } else {
            System.out.println(fish.getName()
                    + " has nothing to eat.");
        }
    }

    public void eatCarnivorous(Fish fish) {
        Fish eatable = (Fish) fish.eat(fishesList, dyingFishesList);
        if (eatable != null) {
            System.out.println("The fish that " + fish.getName()
                    + " wants to eat is " + eatable.getName());
            if (eatable.isDying()) {
                die(eatable);
            }
        } else {
            System.out.println(fish.getName()
                    + " has nothing to eat.");
        }
    }

    public void meal() {
        Iterator itFishes = this.getFishesList().iterator();
        Fish fish;
        Inhabitant eatable = null;
        while (itFishes.hasNext()) {
            fish = (Fish) itFishes.next();
            // Before eating, we must cj=heck if it is not dying and if it is 
            // hungry
            if (!fish.isDying() && fish.isHungry()) {
                if (fish.isVegan()) {
                    eatable = fish.eat(seaweedsList, dyingSeaweedsList);
//    this.eatVegan(fish);
                } else if (fish.isCarnivorous()) {
                    eatable = fish.eat(fishesList, dyingFishesList);
//       this.eatCarnivorous(fish);
                }
                if (eatable != null) {
//                    System.out.println("The fish that " + fish.getName()
//                            + " wants to eat is " + eatable.getName());
                    if (eatable.isDying()) {
                        die(eatable);
                    }
                } else {
                    System.out.println(fish.getName()
                            + " has nothing to eat.");
                }
            }
        }
        this.die();
    }

}
