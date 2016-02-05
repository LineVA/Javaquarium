/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import aquarium.Aquarium;
import aquarium.CarnivorousFish;
import aquarium.Clown;
import aquarium.Play;
import aquarium.Sex;
import aquarium.Sole;
import aquarium.VeganFish;

/**
 * A test to check the succession of operations when the aquarium is empty
 *
 * @author doyenm
 */
public class _004_variousAquarium {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Clown carni = new Clown("Carni", Sex.MALE, 0);
        aquarium.addFish(carni);
        Sole vegan = new Sole("Vegan", Sex.MALE, 0);
        aquarium.addFish(vegan);
        Sole vegan2 = new Sole("Vegan2", Sex.MALE, 0);
        aquarium.addFish(vegan2);

        Play play = new Play(aquarium, 10);
    }

}
