package org.example;
import java.security.SecureRandom;

public class Cat extends Mammal {
//
    SecureRandom rand = new SecureRandom();

    private int killTotal = 0;

    /////////////////////CONSTRUCTORS////////////////////////////////////////
    public Cat(){
        killTotal = 0;
        numberOfLegs = 4;
        female = rand.nextBoolean();
    }


    /////////////////////METHODS///////////////////////////////////////
    @Override
    public void move() {
        System.out.println("Cats walk");
    }

    @Override
    public boolean eat() {
        this.hungry = false;
        return false;
    }

    @Override
    public void sleep() {
        this.tired = false;

    }

    @Override
    public void die() throws DeathException {
        this.alive = false;
    }

    public void kill(){
        System.out.println("The cat kills a pigeon because it is a psychopath");
        killTotal++;
    }

    @Override
    public void liveBirth() {
        this.babies++;
        System.out.println("The cat makes " + babies + " kittens");
    }

    public void gender(){
        if(this.female){
            this.gender = "Female";
            System.out.println(this.name + " is " + this.gender);
        }
        else{
            this.gender = "Male";
            System.out.println(this.name + " is " + this.gender);
        }
    }

    ////////////////GETTERS///////////////////////////////////////
    public int getKillTotal(){
        return killTotal;
    }

    public String getName(){
        return name;
    }

    public int getLegs(){
        return numberOfLegs;
    }

    public boolean getGender(){ return female;}

    ///////////////SETTERS///////////////////////////////////////////////////////
    public void setKillTotal(int newKillTotal){
        this.killTotal = newKillTotal;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setLegs(int newLegs){
        this.numberOfLegs = newLegs;
    }

    public void setGender(boolean newGender){this.female = newGender;}
}
