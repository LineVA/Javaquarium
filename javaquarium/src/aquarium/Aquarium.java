/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquarium;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author doyenm
 */
public class Aquarium {

    private ArrayList<Fish> fishesList;
    private ArrayList<Seaweed> seaweedsList;

    public Aquarium() {
        fishesList = new ArrayList<>();
        seaweedsList = new ArrayList<>();

    }

    public void addFish(Fish fish) {
        fishesList.add(fish);
    }

    public void addSeaweed(Seaweed weed) {
        seaweedsList.add(weed);
    }

    public void visualize() {
        Iterator itFishes = fishesList.iterator();
        Fish fish;
        while (itFishes.hasNext()) {
            fish = (Fish) itFishes.next();
            System.out.println(fish.toString());
        }
        System.out.println("Nuber of seaweeds : " + seaweedsList.size());
    }

    
}
