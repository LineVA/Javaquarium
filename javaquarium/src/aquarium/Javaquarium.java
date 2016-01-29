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
public class Javaquarium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish1 = new VeganFish("Coco", Sex.MALE);
        Fish fish2 = new CarnivorousFish("Miam", Sex.FEMALE);
        Seaweed weed = new Seaweed();

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addSeaweed(weed);

        aquarium.visualize();
        aquarium.oneTurn();

    }

}
