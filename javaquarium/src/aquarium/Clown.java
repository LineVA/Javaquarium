/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquarium;

import java.util.ArrayList;

/**
 *
 * @author doyenm
 */
public class Clown extends Fish{

    public Clown(String name, Sex sex, int age) {
        super(name, sex, age);
        super.setFeedingPattern(new Carnivorous());
    }
    
    
     @Override
    public String toString() {
        return "A clown fish named " + super.getName() + ", a " + super.getSex()
                + ", carnivorous, with " + this.getPv() + " PV and aged of "+ this.getAge() + " years.";
    }
}
