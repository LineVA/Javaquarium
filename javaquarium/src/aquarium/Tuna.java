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
public class Tuna extends Fish{

    public Tuna(String name, Sex sex, int age) {
        super(name, sex, age);
    }
    
       @Override
    public String toString() {
        return "A tuna named " + super.getName() + ", a " + super.getSex()
                + ", carnivorious, with "+ this.getPv() + " PV and aged of "+ this.getAge() + " years.";
    }
}
