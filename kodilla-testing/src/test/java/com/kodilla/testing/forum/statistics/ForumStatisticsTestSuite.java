package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCountStatistic = 1000;
        when(statisticsMock.commentsCount()).thenReturn(commentsCountStatistic);

        int postsCountStatistic = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCountStatistic);

        List<String> userNamesStatistics = new ArrayList<String>();
        for (int i = 0; i < 100; i++){
            userNamesStatistics.add("A");
        }
        when(statisticsMock.usersNames()).thenReturn(userNamesStatistics);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = forumStatistics.getAverageQuantityOfPostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageQuantityOfCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageQuantityOfCommentsPerPost();

        //Than
        Assert.assertEquals(forumStatistics.getUserQuantity(), statisticsMock.usersNames().size());
        Assert.assertEquals(forumStatistics.getPostQuantity(), statisticsMock.postsCount());
        Assert.assertEquals(forumStatistics.getCommentQuantity(), statisticsMock.commentsCount());
        Assert.assertEquals(forumStatistics.getAverageQuantityOfCommentsPerPost(), averageCommentsPerPost, .4);
        Assert.assertEquals(forumStatistics.getAverageQuantityOfCommentsPerUser(), averageCommentsPerUser, .4);
        Assert.assertEquals(forumStatistics.getAverageQuantityOfPostsPerUser(), averagePostsPerUser, .4);
    }
}
