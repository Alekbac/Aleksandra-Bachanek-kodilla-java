package com.kodilla.spring.portfolio;
;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String toDo = "toDoList";
        String inProgress = "inProgressList";
        String done = "doneList";

        board.getToDoList().addTask(toDo);
        board.getInProgressList().addTask(inProgress);
        board.getDoneList().addTask(done);
        // Then
        Assert.assertEquals("toDoList", board.getToDoList().getTasks().get( 0 ));
        Assert.assertEquals("inProgressList", board.getInProgressList().getTasks().get( 0 ));
        Assert.assertEquals("doneList", board.getDoneList().getTasks().get( 0 ));

    }
}
