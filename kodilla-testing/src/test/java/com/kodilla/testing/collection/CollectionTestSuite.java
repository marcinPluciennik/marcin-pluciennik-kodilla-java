package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        OddNumbersExterminator testList = new OddNumbersExterminator();
        System.out.println("Test: Case when ArrayList \"numbers\" is empty");
        //Then
        Assert.assertEquals(testList.exterminate(numbers), numbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            numbers.add(i);
        }
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        evenList.add(0);
        evenList.add(2);
        evenList.add(4);
        evenList.add(6);
        evenList.add(8);
        //When
        OddNumbersExterminator testList = new OddNumbersExterminator();
        System.out.println("Test: Case when ArrayList \"numbers\" contains even and odd numbers");
        //Then
        Assert.assertEquals(testList.exterminate(numbers), evenList);
    }
}
