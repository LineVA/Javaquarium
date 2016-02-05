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
public abstract class Fish extends Inhabitant {

    private String name;
    private Sex sex;
    private FeedingPattern feedingPattern;

    public Fish(String name, Sex sex, int age) {
        super(age);
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public FeedingPattern getFeedingPattern() {
        return feedingPattern;
    }

    public void setFeedingPattern(FeedingPattern feedingPattern) {
        this.feedingPattern = feedingPattern;
    }
    
    

    public Inhabitant eat(ArrayList<Inhabitant> inList, ArrayList<Inhabitant> dying){
        return this.feedingPattern.eat(this, inList, dying);
    }

    public abstract String toString();

   // public abstract void die();

    public boolean isVegan(){
        return this.feedingPattern.isVegan();
    }

    public boolean isCarnivorous(){
        return this.feedingPattern.isCarnivorous();
    }

    public void newTurn() {
        this.setPv(this.getPv() - 1);
        this.setAge(this.getAge() + 1);
    }

    public boolean isHungry() {
        return this.getPv() < 6;
    }

    public void eaten() {
        this.setPv(this.getPv() - 4);
    }

}
