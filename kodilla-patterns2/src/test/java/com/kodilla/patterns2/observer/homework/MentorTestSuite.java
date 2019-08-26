package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void homeworkUpdate(){
        //Given
        HomeworkQueue jessiePinkman = new HomeworkQueue("Jessie Pinkman");
        HomeworkQueue michaelGarcia = new HomeworkQueue("Michael Garcia");
        HomeworkQueue mariaHernandez = new HomeworkQueue("Maria Hernandez");
        HomeworkQueue jamesJohnson = new HomeworkQueue("James Johnson");

        Mentor mentor1 = new Mentor("John Smith");
        Mentor mentor2 = new Mentor("Ivone Escobar");

        jessiePinkman.registerObserver(mentor1);
        michaelGarcia.registerObserver(mentor1);
        mariaHernandez.registerObserver(mentor2);
        jamesJohnson.registerObserver(mentor1);

        //When
        jessiePinkman.addNewHomework("Java Developer Tools");
        michaelGarcia.addNewHomework("Java error handling");
        mariaHernandez.addNewHomework("Spring 5 - introduction");
        jamesJohnson.addNewHomework("Spring & Hibernate");

        //Then
        assertEquals(3,mentor1.getUpdateCount());
        assertEquals(1,mentor2.getUpdateCount());
    }

}