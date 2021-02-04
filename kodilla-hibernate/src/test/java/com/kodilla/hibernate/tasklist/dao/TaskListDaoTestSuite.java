package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;

    @Test
    public void testFindByListName(){
        String listName = "listName";
        String description = "Task_description";
        TaskList taskList = new TaskList(listName, description);

        taskListDao.save(taskList);

        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        assertEquals(1, readTaskList.size());

        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);

    }
}
