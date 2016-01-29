/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import aquarium.Aquarium;
import aquarium.CarnivorousFish;
import aquarium.Play;
import aquarium.Sex;
import aquarium.VeganFish;

/**
 * A test to check the succession of operations when the aquarium is empty
 *
 * @author doyenm
 */
public class _004_variousAquarium {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        CarnivorousFish carni = new CarnivorousFish("Carni", Sex.MALE, 0);
        aquarium.addFish(carni);
        VeganFish vegan = new VeganFish("Vegan", Sex.MALE, 0);
        aquarium.addFish(vegan);
        VeganFish vegan2 = new VeganFish("Vegan2", Sex.MALE, 0);
        aquarium.addFish(vegan2);

        Play play = new Play(aquarium, 10);
    }

}
