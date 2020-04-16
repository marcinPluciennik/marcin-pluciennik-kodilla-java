package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {22, 10, 10, 10, 10, 10};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Than
        Assert.assertEquals(12, average, 0.001);
    }
}
