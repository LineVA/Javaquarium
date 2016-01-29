/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import aquarium.Aquarium;
import aquarium.Sex;
import aquarium.VeganFish;

/**
 * A test to check the succession of operations when the aquarium is empty
 *
 * @author doyenm
 */
public class _002_veganAquarium {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        VeganFish vegan = new VeganFish("Vegan", Sex.FEMALE);
        aquarium.addFish(vegan);

            aquarium.oneTurn();

    }

}
