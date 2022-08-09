package org.example;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main.class.getName());
        //comment2
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Dolphin dolphin = new Dolphin();
        cat.setName("Poppy");
        logger.info(cat.name);
        cat.move();
        cat.kill();
        cat.liveBirth();
        cat.setLegs(4);
        cat.eat();
        cat1.setName("Teddy");
        cat2.setName("Marley");
        cat3.setName("Jordan");

        cat1.gender();
        cat2.gender();
        cat3.gender();

        if(cat1.female != cat2.female){
            Cat cat4 = new Cat();
            cat4.setName("Poppy");
            logger.info(cat4.getName() + " is born yay");
        }


    }
}
