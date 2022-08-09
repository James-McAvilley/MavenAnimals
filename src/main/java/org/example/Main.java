package org.example;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat babyCat = new Cat();
        Dolphin dolphin = new Dolphin();
        cat.setName("Poppy");
        System.out.println(cat.name);
        cat.move();
        cat.kill();
        cat.liveBirth();
        System.out.println(cat.getKillTotal());
        cat.setLegs(4);
        System.out.println("The cat has " + cat.getLegs() + " legs");
        System.out.println(cat.eat());
        cat1.setName("Teddy");
        cat2.setName("Marley");
        cat3.setName("Jordan");

        cat1.gender();
        cat2.gender();
        cat3.gender();

    }
}
