package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10.0);
        //When
        shapeCollector.addFigure(shape);
        //Than
        Assert.assertEquals(1, shapeCollector.getFigures().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10.0);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Than
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10.0);
        shapeCollector.addFigure(shape);
        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);
        //Than
        Assert.assertEquals(shape, retrievedShape);
    }
}
