package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeworkTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Homework homeworkDonaldTrump = new HomeworkDonaldTrump();
        Homework homeworkWladimirPutin = new HomeworkWladimirPutin();
        Homework homeworkAngelaMerkel = new HomeworkAngelaMerkel();
        Mentor dalaiLama = new Mentor("Dalai Lama");
        Mentor buddha = new Mentor("Buddha");
        homeworkDonaldTrump.registerMentorObserver(dalaiLama);
        homeworkWladimirPutin.registerMentorObserver(buddha);
        homeworkAngelaMerkel.registerMentorObserver(dalaiLama);

        //When
        homeworkDonaldTrump.addHomework("Find COVID-19 vaccine");
        homeworkDonaldTrump.addHomework("Still be the president of United States");
        homeworkDonaldTrump.addHomework("Build new Trump Tower in NYC");
        homeworkAngelaMerkel.addHomework("Celebrate Nord Stream 2 with Wladimir Wladimirowich");
        homeworkAngelaMerkel.addHomework("Take more refugees in Europe in 2021");
        homeworkAngelaMerkel.addHomework("Have a romance with Emanuel Macron");
        homeworkWladimirPutin.addHomework("Build new atomic bomb");
        homeworkWladimirPutin.addHomework("Be a king of the world");
        homeworkWladimirPutin.addHomework("Be a king of Russia till the end");

        //Than
        assertEquals(6, dalaiLama.getUpdateCount());
        assertEquals(3, buddha.getUpdateCount());
    }
}
