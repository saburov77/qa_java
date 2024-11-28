package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    Feline feline;
    @Before
    public void initFeline(){
        feline = new Feline();
    }
    @Test
    public void eatMeatTest() throws Exception {

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals("Семейство Кошачьих траву не ест!", expectedFood, actualFood);
    }

    @Test
    public void getFamilyTest() {

        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Ты не из нашей фамилии!", expectedFamily, actualFamily);

    }
    @Test
    public void getKittensTest(){

        int expectedCount = 1;
        int actualCont = feline.getKittens();
        Assert.assertEquals("Только одна чёрная кошка, в тёмной комнате", expectedCount, actualCont);
    }
}
