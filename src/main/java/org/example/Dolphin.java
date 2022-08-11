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
    public void die() throws DeathException {
        this.alive = false;
    }

    @Override
    void feed() {

    }

    @Override
    public void gender() {
        if(this.female){
            this.gender = "Female";
            System.out.println(this.name + " is " + this.gender);
        }
        else{
            this.gender = "Male";
            System.out.println(this.name + " is " + this.gender);
        }

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
