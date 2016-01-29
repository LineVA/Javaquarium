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
        Fish fish1 = new VeganFish("Coco", Sex.MALE, 0);
        Fish fish2 = new CarnivorousFish("Miam", Sex.FEMALE, 0);
        Seaweed weed = new Seaweed(0);

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addSeaweed(weed);

        Play play = new Play(aquarium, 10);

    }

}
