/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import aquarium.Aquarium;
import aquarium.CarnivorousFish;
import aquarium.Sex;

/**
 * A test to check the succession of operations when the aquarium is empty
 *
 * @author doyenm
 */
public class _003_carnivorousAquarium {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        CarnivorousFish carni = new CarnivorousFish("Carni", Sex.MALE);
        aquarium.addFish(carni);
        CarnivorousFish carni2 = new CarnivorousFish("Carni2", Sex.MALE);
        aquarium.addFish(carni2);

        aquarium.visualize();
        aquarium.meal();
        aquarium.visualize();
    }

}