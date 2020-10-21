package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock1() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCountStatistic = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentsCountStatistic);

        int postsCountStatistic = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCountStatistic);

        List<String> userNamesStatistics = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userNamesStatistics.add("A");
        }
        when(statisticsMock.usersNames()).thenReturn(userNamesStatistics);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = forumStatistics.getAverageQuantityOfPostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageQuantityOfCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageQuantityOfCommentsPerPost();

        //Than
        Assert.assertEquals(10, statisticsMock.usersNames().size());
        Assert.assertEquals(0, statisticsMock.postsCount());
        Assert.assertEquals(10, statisticsMock.commentsCount());
        Assert.assertEquals(0, averageCommentsPerPost, .4);
        Assert.assertEquals(1, averageCommentsPerUser, .4);
        Assert.assertEquals(0, averagePostsPerUser, .4);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock2() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCountStatistic = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentsCountStatistic);

        int postsCountStatistic = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCountStatistic);

        List<String> userNamesStatistics = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userNamesStatistics.add("A");
        }
        when(statisticsMock.usersNames()).thenReturn(userNamesStatistics);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = forumStatistics.getAverageQuantityOfPostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageQuantityOfCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageQuantityOfCommentsPerPost();

        //Than
        Assert.assertEquals(10, statisticsMock.usersNames().size());
        Assert.assertEquals(1000, statisticsMock.postsCount());
        Assert.assertEquals(10, statisticsMock.commentsCount());
        Assert.assertEquals(0.01, averageCommentsPerPost, .4);
        Assert.assertEquals(1.0, averageCommentsPerUser, .4);
        Assert.assertEquals(100.0, averagePostsPerUser, .4);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock3() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCountStatistic = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCountStatistic);

        int postsCountStatistic = 10;
        when(statisticsMock.postsCount()).thenReturn(postsCountStatistic);

        List<String> userNamesStatistics = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userNamesStatistics.add("A");
        }
        when(statisticsMock.usersNames()).thenReturn(userNamesStatistics);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = forumStatistics.getAverageQuantityOfPostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageQuantityOfCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageQuantityOfCommentsPerPost();

        //Than
        Assert.assertEquals(10, statisticsMock.usersNames().size());
        Assert.assertEquals(10, statisticsMock.postsCount());
        Assert.assertEquals(0, statisticsMock.commentsCount());
        Assert.assertEquals(0.0, averageCommentsPerPost, .4);
        Assert.assertEquals(0.0, averageCommentsPerUser, .4);
        Assert.assertEquals(1.0, averagePostsPerUser, .4);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock4() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCountStatistic = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentsCountStatistic);

        int postsCountStatistic = 100;
        when(statisticsMock.postsCount()).thenReturn(postsCountStatistic);

        List<String> userNamesStatistics = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userNamesStatistics.add("A");
        }
        when(statisticsMock.usersNames()).thenReturn(userNamesStatistics);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = forumStatistics.getAverageQuantityOfPostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageQuantityOfCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageQuantityOfCommentsPerPost();

        //Than
        Assert.assertEquals(10, statisticsMock.usersNames().size());
        Assert.assertEquals(100, statisticsMock.postsCount());
        Assert.assertEquals(10, statisticsMock.commentsCount());
        Assert.assertEquals(0.1, averageCommentsPerPost, .4);
        Assert.assertEquals(1, averageCommentsPerUser, .4);
        Assert.assertEquals(10, averagePostsPerUser, .4);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock5() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCountStatistic = 100;
        when(statisticsMock.commentsCount()).thenReturn(commentsCountStatistic);

        int postsCountStatistic = 10;
        when(statisticsMock.postsCount()).thenReturn(postsCountStatistic);

        List<String> userNamesStatistics = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            userNamesStatistics.add("A");
        }
        when(statisticsMock.usersNames()).thenReturn(userNamesStatistics);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = forumStatistics.getAverageQuantityOfPostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageQuantityOfCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageQuantityOfCommentsPerPost();

        //Than
        Assert.assertEquals(10, statisticsMock.usersNames().size());
        Assert.assertEquals(10, statisticsMock.postsCount());
        Assert.assertEquals(100, statisticsMock.commentsCount());
        Assert.assertEquals(10.0, averageCommentsPerPost, .4);
        Assert.assertEquals(10.0, averageCommentsPerUser, .4);
        Assert.assertEquals(1, averagePostsPerUser, .4);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock6() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCountStatistic = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentsCountStatistic);

        int postsCountStatistic = 10;
        when(statisticsMock.postsCount()).thenReturn(postsCountStatistic);

        List<String> userNamesStatistics = new ArrayList<String>();
        /*for (int i = 0; i < 10; i++){
            userNamesStatistics.add("A");
        }*/
        when(statisticsMock.usersNames()).thenReturn(userNamesStatistics);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = forumStatistics.getAverageQuantityOfPostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageQuantityOfCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageQuantityOfCommentsPerPost();

        //Than
        Assert.assertEquals(0, statisticsMock.usersNames().size());
        Assert.assertEquals(10, statisticsMock.postsCount());
        Assert.assertEquals(10, statisticsMock.commentsCount());
        Assert.assertEquals(1.0, averageCommentsPerPost, .4);
        Assert.assertEquals(0.0, averageCommentsPerUser, .4);
        Assert.assertEquals(0.0, averagePostsPerUser, .4);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock7() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCountStatistic = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentsCountStatistic);

        int postsCountStatistic = 10;
        when(statisticsMock.postsCount()).thenReturn(postsCountStatistic);

        List<String> userNamesStatistics = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userNamesStatistics.add("A");
        }
        when(statisticsMock.usersNames()).thenReturn(userNamesStatistics);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = forumStatistics.getAverageQuantityOfPostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageQuantityOfCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageQuantityOfCommentsPerPost();

        //Than
        Assert.assertEquals(100, statisticsMock.usersNames().size());
        Assert.assertEquals(10, statisticsMock.postsCount());
        Assert.assertEquals(10, statisticsMock.commentsCount());
        Assert.assertEquals(1.0, averageCommentsPerPost, .4);
        Assert.assertEquals(0.1, averageCommentsPerUser, .4);
        Assert.assertEquals(0.1, averagePostsPerUser, .4);
    }
}
