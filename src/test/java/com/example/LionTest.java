package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(5);
        int expectedCount = 5;
        int actualCont = lion.getKittens();
        Assert.assertEquals("Лев вышел из прайда!", expectedCount, actualCont);

    }

    @Test
    public void lionFoodTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Assert.assertEquals("Львы траву не едят", expectedFood, lion.getFood());
    }

    @Test
    public void lionExceptionTest() throws Exception {
        Lion lion = new Lion(feline, "Чудо-Юдо");
            }
}
