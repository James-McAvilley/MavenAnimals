package org.example;

public class Penguin extends Bird{
    @Override
    void move() {

    }

    @Override
    boolean eat() {
        return false;
    }

    @Override
    void sleep() {

    }

    @Override
    void die() throws DeathException {

    }

    @Override
    void feed() {

    }

    @Override
    void gender() {
        if(this.female){
            this.gender = "Female";
            System.out.println(this.gender);
        }
        else{
            this.gender = "Male";
            System.out.println(this.gender);
        }
    }

    @Override
    boolean canFly() {
        return false;
    }
}
