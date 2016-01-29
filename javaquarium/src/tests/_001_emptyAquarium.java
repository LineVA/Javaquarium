/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import aquarium.Aquarium;
import aquarium.Play;

/**
 * A test to check the succession of operations when the aquarium is empty
 *
 * @author doyenm
 */
public class _001_emptyAquarium {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Play play = new Play(aquarium, 10);
    }

}
