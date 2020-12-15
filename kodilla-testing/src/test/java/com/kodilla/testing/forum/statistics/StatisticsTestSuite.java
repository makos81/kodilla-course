package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    @Mock
    Statistics statistics;

    CalculateStatistics calculateStatistics;

    @BeforeEach
    void before(){
        calculateStatistics = new CalculateStatistics();
    }

    @Test
    public void testPostsZero(){
        //given
        List<String> list = createList(10);
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(10);
        //when
        calculateStatistics.calculateAdvStatistics(statistics);
        //then
        Assertions.assertEquals(10, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(0, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(10, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0, calculateStatistics.getGetAverageCommentsPerPost());
        Assertions.assertEquals(0, calculateStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, calculateStatistics.getGetAverageCommentsPerPost());
    }

    public List<String> createList(int elements){
        List<String> list = new ArrayList<>();
        for(int i=1;i<=elements;i++){
            list.add("element " + i);
        }
        return list;
    }

    @Test
    public void testPosts1000(){
        //given
        List<String> list = createList(10);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(list);
        //when
        calculateStatistics.calculateAdvStatistics(statistics);
        //then
        Assertions.assertEquals(10, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(1000, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(10, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0.01, calculateStatistics.getGetAverageCommentsPerPost());
        Assertions.assertEquals(100, calculateStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0.01, calculateStatistics.getGetAverageCommentsPerPost());
    }

    @Test
    public void testComments0(){
        //given
        List<String> list = createList(10);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(list);
        //when
        calculateStatistics.calculateAdvStatistics(statistics);
        //then
        Assertions.assertEquals(10, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(10, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0, calculateStatistics.getGetAverageCommentsPerPost());
        Assertions.assertEquals(0, calculateStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0, calculateStatistics.getGetAverageCommentsPerPost());
    }

    @Test
    public void testCommentsLessThenPosts(){
        //given
        List<String> list = createList(10);
        when(statistics.postsCount()).thenReturn(20);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(list);
        //when
        calculateStatistics.calculateAdvStatistics(statistics);
        //then
        Assertions.assertEquals(1, calculateStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0.5, calculateStatistics.getGetAverageCommentsPerPost());
        Assertions.assertEquals(2, calculateStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(1, calculateStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0.5, calculateStatistics.getGetAverageCommentsPerPost());
        Assertions.assertEquals(2, calculateStatistics.getAveragePostsPerUser());
    }

    @Test
    public void testCommentsMoreThenPosts(){
        //given
        List<String> list = createList(10);
        when(statistics.postsCount()).thenReturn(20);
        when(statistics.commentsCount()).thenReturn(40);
        when(statistics.usersNames()).thenReturn(list);
        //when
        calculateStatistics.calculateAdvStatistics(statistics);
        //then
        Assertions.assertEquals(10, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(20, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(40, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(4, calculateStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(2, calculateStatistics.getGetAverageCommentsPerPost());
        Assertions.assertEquals(2, calculateStatistics.getAveragePostsPerUser());
    }

    @Test
    public void testUsers0(){
        //given
        List<String> list = createList(0);
        when(statistics.postsCount()).thenReturn(20);
        when(statistics.commentsCount()).thenReturn(40);
        when(statistics.usersNames()).thenReturn(list);
        //when
        calculateStatistics.calculateAdvStatistics(statistics);
        //then
        Assertions.assertEquals(0, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(20, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(40, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0, calculateStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(2, calculateStatistics.getGetAverageCommentsPerPost());
        Assertions.assertEquals(0, calculateStatistics.getAveragePostsPerUser());
    }

    @Test
    public void testUsers1000(){
        //given
        List<String> list = createList(100);
        when(statistics.postsCount()).thenReturn(20);
        when(statistics.commentsCount()).thenReturn(40);
        when(statistics.usersNames()).thenReturn(list);
        //when
        calculateStatistics.calculateAdvStatistics(statistics);
        //then
        Assertions.assertEquals(100, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(20, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(40, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0.4, calculateStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(2, calculateStatistics.getGetAverageCommentsPerPost());
        Assertions.assertEquals(0.2, calculateStatistics.getAveragePostsPerUser());
    }
}
/*
calculateAdvStatistics(Statistics statistics) testowanej klasy. Testy zrealizuj przy pomocy mocka interfejsu Statistics.
Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:

gdy liczba postów = 0,
gdy liczba postów = 1000,
gdy liczba komentarzy = 0,
gdy liczba komentarzy < liczba postów,
gdy liczba komentarzy > liczba postów,
gdy liczba użytkowników = 0,
gdy liczba użytkowników = 100.
 */
