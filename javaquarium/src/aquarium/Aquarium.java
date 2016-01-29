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

    public void addFish(Fish fish) {
        fishesList.add(fish);
    }

    public void addSeaweed(Seaweed weed) {
        seaweedsList.add(weed);
    }

    private void die(Inhabitant in) {
        if (in instanceof Seaweed) {
            Iterator it = this.seaweedsList.iterator();
            Seaweed weed;
            while (it.hasNext()) {
                weed = (Seaweed) it.next();
                it.remove();
            }
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

    private void eatVegan(Fish fish) {
        Inhabitant eatable = fish.eat(seaweedsList, null);
        if (eatable != null) {
            System.out.println(fish.getName()
                    + " is eating a seaweed.");
            die(eatable);
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
            // die(eatable);
            dyingFishesList.add(eatable);
        } else {
            System.out.println(fish.getName()
                    + " has nothing to eat.");
        }
    }

    private void meal() {
        System.out.println("MEAL : ");
        Iterator itFishes = fishesList.iterator();
        Fish fish;
        while (itFishes.hasNext()) {
            fish = (Fish) itFishes.next();
            if (!isDying(fish)) {
                if (fish.isVegan()) {
                    eatVegan(fish);
                } else if (fish.isCarnivorous()) {
                    eatCarnivorous(fish);
                }
            }
        }
        die();
    }

    public void visualize() {
        System.out.println("VISUALIZATION : ");
        Iterator itFishes = fishesList.iterator();
        Fish fish;

        while (itFishes.hasNext()) {
            fish = (Fish) itFishes.next();
            System.out.println(fish.toString());
        }
        System.out.println("Number of seaweeds : " + seaweedsList.size() + " : ");
        Iterator itWeeds = seaweedsList.iterator();
        Seaweed weed;
        while (itWeeds.hasNext()) {
            weed = (Seaweed) itWeeds.next();
            System.out.println(weed.toString());
        }
    }

    public void beginNewTurn() {
        Iterator itFishes = fishesList.iterator();
        Fish fish;
        while (itFishes.hasNext()) {
            fish = (Fish) itFishes.next();
            fish.newTurn();
            if (fish.getPv() < 1) {
                itFishes.remove();
            }
        }
        Iterator itWeeds = seaweedsList.iterator();
        Seaweed weed;
        while (itWeeds.hasNext()) {
            weed = (Seaweed) itWeeds.next();
            weed.newTurn();
            if (weed.getPv() < 1) {
                itWeeds.remove();
            }
        }
    }

    public void oneTurn() {
        beginNewTurn();    
        beginNewTurn();
        beginNewTurn();
        meal();
        visualize();
    }
}
