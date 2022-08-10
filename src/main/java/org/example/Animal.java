package org.example;

abstract class Animal {

    int numberOfLegs;
    public static boolean alive = true;
    boolean tired = false;

    boolean female;
    String gender;
    String food;

    abstract void move();
    abstract boolean eat();
    abstract void sleep();
    abstract void die() throws DeathException;

    abstract void gender();

}
