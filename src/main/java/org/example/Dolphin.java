package org.example;

public class Dolphin extends Mammal{


    public Dolphin(){
        canWalk = false;
        numberOfLegs = 0;
    }
    @Override
    public void move() {
        System.out.println("A dolphin swims");
    }

    @Override
    public boolean eat() {
        return false;
    }

    @Override
    public void sleep() {

    }

    @Override
    public void die() {
        this.alive = false;
    }

    @Override
    public void gender() {

    }

    @Override
    public void liveBirth() {

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
