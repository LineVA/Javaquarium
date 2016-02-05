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
public class Carp extends Fish{

    public Carp(String name, Sex sex, int age) {
        super(name, sex, age);
            super.setFeedingPattern(new Vegetarian());

    }
    
     @Override
    public String toString() {
        return "A carp named " + super.getName() + ", a " + super.getSex()
                + ", vegetarian, with " + this.getPv() + " PV and aged of "+ this.getAge() + " years.";
    }
    
}
