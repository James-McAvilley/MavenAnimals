package org.example;

public class Dolphin extends Mammal{


    public Dolphin(){
        canWalk = false;
        numberOfLegs = 0;
    }
    @Override
    void move() {
        System.out.println("A dolphin swims");
    }

    @Override
    boolean eat() {
        return false;
    }

    @Override
    void sleep() {

    }

    @Override
    boolean die() {
        return false;
    }

    @Override
    void liveBirth() {

    }


    public String getName(){
        return name;
    }

    public int getLegs(){
        return numberOfLegs;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setLegs(int newLegs){
        this.numberOfLegs = newLegs;
    }
}
