package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getDoneList().addTask("task done");
        board.getInProgressList().addTask("in progress task");
        board.getToDoList().addTask("to do task");
        Assertions.assertEquals(board.getDoneList().getTasks().get(0),"task done");
        Assertions.assertEquals(board.getInProgressList().getTasks().get(0),"in progress task");
        Assertions.assertEquals(board.getToDoList().getTasks().get(0),"to do task");
    }
}
