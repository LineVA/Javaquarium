/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquarium;

import java.util.Iterator;

/**
 *
 * @author doyenm
 */
public class Play {

    private final Aquarium aquarium;

    public Play(Aquarium aquarium, int turn) {
        this.aquarium = aquarium;
        oneTurn(true);
        int i = 1;
        while (i < turn) { 
            System.out.println("########## TURN N°"+i+" ##########");
            oneTurn(false);
            i++;
        }
    }

    private void meal() {
        System.out.println("---------- MEAL ----------");
        Iterator itFishes = this.aquarium.getFishesList().iterator();
        Fish fish;
        while (itFishes.hasNext()) {
            fish = (Fish) itFishes.next();
            if (!this.aquarium.isDying(fish) && fish.getPv() < 6) {
                if (fish.isVegan()) {
                    this.aquarium.eatVegan(fish);
                } else if (fish.isCarnivorous()) {
                    this.aquarium.eatCarnivorous(fish);
                }
            }
        }
        this.aquarium.die();
    }

    public void visualize() {
        System.out.println("--------- VISUALIZATION ----------");
        Iterator itFishes = this.aquarium.getFishesList().iterator();
        Fish fish;

        while (itFishes.hasNext()) {
            fish = (Fish) itFishes.next();
            System.out.println(fish.toString());
        }
        System.out.println("Number of seaweeds : "
                + this.aquarium.getSeaweedsList().size() + " : ");
        Iterator itWeeds = this.aquarium.getSeaweedsList().iterator();
        Seaweed weed;
        while (itWeeds.hasNext()) {
            weed = (Seaweed) itWeeds.next();
            System.out.println(weed.toString());
        }
    }

    public void beginNewTurn() {
        Iterator itFishes = this.aquarium.getFishesList().iterator();
        Fish fish;
        while (itFishes.hasNext()) {
            fish = (Fish) itFishes.next();
            fish.newTurn();
            if (fish.getPv() < 1) {
                itFishes.remove();
            }
        }
        Iterator itWeeds = this.aquarium.getSeaweedsList().iterator();
        Seaweed weed;
        while (itWeeds.hasNext()) {
            weed = (Seaweed) itWeeds.next();
            weed.newTurn();
            if (weed.getPv() < 1) {
                itWeeds.remove();
            }
        }
    }

    public void oneTurn(boolean first) {
        if (!first) {
            beginNewTurn();
        }
        visualize();
        meal();
        visualize();
    }

}
