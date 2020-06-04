package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = context.getBean(Board.class);

        board.getToDoList().addTaskToList("Watch TV");
        board.getInProgressList().addTaskToList("Read the book");
        board.getDoneList().addTaskToList("Buy new T-shirt");

        //Then
        Assert.assertEquals("Watch TV", board.getToDoList().getTask());
        Assert.assertEquals("Read the book", board.getInProgressList().getTask());
        Assert.assertEquals("Buy new T-shirt", board.getDoneList().getTask());
    }
}
