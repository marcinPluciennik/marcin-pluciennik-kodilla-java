package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithDoubleCheeseOlivesTomatoesGetCost(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new CheeseDecorator(thePizza);
        thePizza = new CheeseDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new TomatoesDecorator(thePizza);
        System.out.println(thePizza.getCost());

        //When
        BigDecimal theCost = thePizza.getCost();

        //Than
        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    public void testPizzaWithDoubleCheeseOlivesTomatoesGetDescription(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new CheeseDecorator(thePizza);
        thePizza = new CheeseDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new TomatoesDecorator(thePizza);
        System.out.println(thePizza.getDescription());

        //When
        String description = thePizza.getDescription();

        //Than
        assertEquals("Your pizza + cheese + cheese + olives + tomatoes", description);
    }

    @Test
    public void testPizzaWithCheeseHamGetCost(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new CheeseDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        System.out.println(thePizza.getCost());

        //When
        BigDecimal theCost = thePizza.getCost();

        //Than
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void testPizzaWithCheeseHamGetDescription(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new CheeseDecorator(thePizza);
        thePizza = new HamDecorator(thePizza);
        System.out.println(thePizza.getDescription());

        //When
        String description = thePizza.getDescription();

        //Than
        assertEquals("Your pizza + cheese + ham", description);
    }
}
