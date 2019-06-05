package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "To Do";
    private static final String DESCRIPTION = "Convert project";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList( LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        //String listName = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        Assert.assertEquals(LISTNAME, readTaskList.get(0).getListName());
        Assert.assertEquals(1, readTaskList.size());

       //CleanUp
        taskListDao.delete(taskList);
    }
}
