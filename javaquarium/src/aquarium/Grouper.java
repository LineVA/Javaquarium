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
public class Grouper extends Fish{

    public Grouper(String name, Sex sex, int age) {
        super(name, sex, age);    
        super.setFeedingPattern(new Carnivorous());
    }
    
       @Override
    public String toString() {
        return "A grouper named " + super.getName() + ", a " + super.getSex()
                + ", carnivorious, with "+ this.getPv() + " PVand aged of "+ this.getAge() + " years.";
    }
}
