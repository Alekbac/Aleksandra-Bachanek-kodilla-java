package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistic.Statistics;
import com.kodilla.testing.forum.statistic.Users;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UsersTestSuite {

    @Test
    public void testForZeroPosts(){
        //Given
        Statistics userStatisticsMock = mock(Statistics.class);

        when(userStatisticsMock.postsCount()).thenReturn(0);
        Users users = new Users();

        //When
        users.calculateAvgStatistic(userStatisticsMock);

        //Then
        Assert.assertEquals(0, users.getPostNum());

    }
    @Test
    public void testForThousandPosts(){
        //Given
        Statistics userStatisticsMock = mock(Statistics.class);

        when(userStatisticsMock.postsCount()).thenReturn(1000);
        Users users = new Users();

        //When
        users.calculateAvgStatistic(userStatisticsMock);

        //Then
        Assert.assertEquals(1000, users.getPostNum());

    }
    @Test
    public void testForZeroComments(){
        //Given
        Statistics userStatisticsMock = mock(Statistics.class);

        when(userStatisticsMock.commentsCount()).thenReturn(0);
        Users users = new Users();

        //When
        users.calculateAvgStatistic(userStatisticsMock);

        //Then
        Assert.assertEquals(0, users.getCommentNum());
    }
    @Test
    public void testWhenComNumIsLessThanPostNum(){
        //Given
        Statistics userStatisticsMock = mock(Statistics.class);

        when(userStatisticsMock.commentsCount()).thenReturn(5);
        when(userStatisticsMock.postsCount()).thenReturn(10);
        Users users = new Users();

        //When
        users.calculateAvgStatistic(userStatisticsMock);

        //Then
        Assert.assertEquals(5, users.getCommentNum());
        Assert.assertEquals(10, users.getPostNum());
        Assert.assertEquals(0.5, users.getCommentAvgPerPost(), 0.01);
    }
    @Test
    public void testWhenComNumIsGreaterThanPostNum(){
        //Given
        Statistics userStatisticsMock = mock(Statistics.class);

        when(userStatisticsMock.commentsCount()).thenReturn(10);
        when(userStatisticsMock.postsCount()).thenReturn(5);
        Users users = new Users();

        //When
        users.calculateAvgStatistic(userStatisticsMock);

        //Then
        Assert.assertEquals(10, users.getCommentNum());
        Assert.assertEquals(5, users.getPostNum());
        Assert.assertEquals(2, users.getCommentAvgPerPost(), 0.01);
    }
    @Test
    public void testForZeroUsers(){
        //Given
        Statistics userStatisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();

        when(userStatisticsMock.usersNames()).thenReturn(usersNames);
        Users users = new Users();

        //When
        users.calculateAvgStatistic(userStatisticsMock);

        //Then
        Assert.assertEquals(0, users.getUsersNum());
    }
    @Test
    public void testForHundredUsers(){
        //Given
        Statistics userStatisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i<100; i++){
            usersNames.add("User Name");
        }
        when(userStatisticsMock.usersNames()).thenReturn(usersNames);
        Users users = new Users();

        //When
        users.calculateAvgStatistic(userStatisticsMock);

        //Then
        Assert.assertEquals(100, users.getUsersNum());
    }
}
