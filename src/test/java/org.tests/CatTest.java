package org.tests;


import org.example.DeathException;
import org.junit.jupiter.api.Test;
import org.example.Cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    Cat testAnimal = new Cat();
    private int age;
    private int killTotal;

    public CatTest() {
    }

    @Test
    public void get_test_cat(){
        Cat testCat = new Cat();
    }

    @Test
    public boolean test_eat(){
        testAnimal.hungry = false;
        return false;
    }

    @Test
    public int testKillTotal(){
        this.killTotal++;
        return this.killTotal;
    }





}
