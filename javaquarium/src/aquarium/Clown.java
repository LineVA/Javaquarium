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
public class Clown extends CarnivorousFish{

    public Clown(String name, Sex sex, int age) {
        super(name, sex, age);
    }
    
    
     @Override
    public String toString() {
        return "A clown fish named " + super.getName() + ", a " + super.getSex()
                + ", carnivorous, with " + this.getPv() + " PV and aged of "+ this.getAge() + " years.";
    }
    
}
