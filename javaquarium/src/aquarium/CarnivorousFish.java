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
public class CarnivorousFish extends Fish {

    public CarnivorousFish(String name, Sex sex) {
        super(name, sex);
    }
    
    @Override
    public String toString() {
        return "A fish named " + super.getName() + ", a " + super.getSex() +
                " and carnivorious.";
    }

    @Override
    public boolean eat(Inhabitant eatable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
