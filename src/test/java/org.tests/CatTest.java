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
    public void test_eat(){
        testAnimal.hungry = false;
    }

    @Test
    public void testKillTotal(){
        this.killTotal++;
    }





}
