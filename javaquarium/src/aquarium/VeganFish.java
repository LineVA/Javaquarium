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
public class VeganFish extends Fish{

    public VeganFish(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public String toString() {
        return "A fish named " + super.getName() + ", a " + super.getSex() +
                " and vegetarian.";
    }

    @Override
    public boolean eat(Inhabitant eatable) {
        return true;
    }
    
    
    
}
