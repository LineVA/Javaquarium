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
public class Sole extends Fish {

    public Sole(String name, Sex sex, int age) {
        super(name, sex, age);
        super.setFeedingPattern(new Vegetarian());
        super.setSexualityPattern(new HermaphroditeByAge());
    }

    @Override
    public String toString() {
        return "A sole named " + super.getName() + ", a " + super.getSex()
                + ", vegetarian, with " + this.getPv() + " PV and aged of " + this.getAge() + " years.";
    }
}
