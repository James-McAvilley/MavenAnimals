package org.tests;


import org.example.DeathException;
import org.junit.jupiter.api.Test;
import org.example.Cat;

import static org.junit.jupiter.api.Assertions.assertEquals;
//
public class CatTest {
    Cat testAnimal = new Cat();
    @Test
    public void test_get_cat(){
        Cat testCat = new Cat();
    }

    public boolean test_eat(){
        testAnimal.hungry = false;
        return false;
    }

    public void test_die() throws DeathException {
        testAnimal.alive = false;
    }
}
