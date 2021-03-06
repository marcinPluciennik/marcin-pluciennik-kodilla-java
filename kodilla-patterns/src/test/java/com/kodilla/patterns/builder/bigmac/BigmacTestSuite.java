package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Bacon")
                .ingredient("Onion")
                .bun("Sesame bun")
                .sauce("Standard")
                .ingredient("Cheese")
                .burgers(3)
                .ingredient("Chilli")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Than
        Assert.assertEquals(4, howManyIngredients);
    }
}
