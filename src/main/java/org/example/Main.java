package org.example;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dolphin dolphin = new Dolphin();
        //Pigeon pigeon = new Pigeon();
        cat.setName("Poppy");
        System.out.println(cat.name);
        cat.move();
        //pigeon.move();
        cat.kill();
        //pigeon.die();
        cat.liveBirth();
        System.out.println(cat.getKillTotal());
        cat.setLegs(4);
        System.out.println("The cat has " + cat.getLegs() + " legs");
        System.out.println(cat.eat());

        if(cat.alive){
            System.out.println("The cat is alive");
        }
        else{
            System.out.println("The cat is dead");
        }

        System.out.println("A dolphin has " + dolphin.numberOfLegs + " legs");
    }
}
