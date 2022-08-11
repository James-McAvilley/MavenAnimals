package org.example;

public abstract class Animal {
    //Comment
    int numberOfLegs;
    boolean alive = true;
    boolean tired = false;

    boolean hungry = true;

    boolean female;
    String gender;
    String food;

    abstract void move();
    abstract boolean eat();
    abstract void sleep();
    abstract void die() throws DeathException;

    abstract void feed();

    abstract void gender();

}
