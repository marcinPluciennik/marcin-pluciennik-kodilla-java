package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("10000000"));
        Country germany = new Country("Germany", new BigDecimal("10000000"));
        Country italy = new Country("Italy", new BigDecimal("10000000"));

        Country usa = new Country("USA", new BigDecimal("10000000"));
        Country canada = new Country("Canada", new BigDecimal("10000000"));

        Country china = new Country("China", new BigDecimal("10000000"));
        Country india = new Country("India", new BigDecimal("10000000"));
        Country nepal = new Country("Nepal", new BigDecimal("10000000"));

        Continent europa = new Continent();
        Continent northamerica = new Continent();
        Continent asia = new Continent();

        europa.addCountry(poland);
        europa.addCountry(germany);
        europa.addCountry(italy);

        northamerica.addCountry(usa);
        northamerica.addCountry(canada);

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(nepal);

        World world = new World();
        world.addContinent(europa);
        world.addContinent(northamerica);
        world.addContinent(asia);

        //When
        BigDecimal totalQuantityOfPeople = world.getPeopleQuantity();

        //Than
        BigDecimal expectedTotalPeopleQuantity = new BigDecimal("80000000");
        Assert.assertEquals(expectedTotalPeopleQuantity, totalQuantityOfPeople);


    }
}
