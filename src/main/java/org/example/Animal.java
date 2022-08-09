package org.example;

abstract class Animal {

    int numberOfLegs;
    boolean alive = true;

    boolean female;

    abstract void move();
    abstract boolean eat();
    abstract void sleep();
    abstract boolean die();

//    public int getAge(){
//        return age;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
}
