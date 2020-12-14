package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double getAverageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getGetAverageCommentsPerPost() {
        return getAverageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfComments = statistics.commentsCount();
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        averageCommentsPerUser = numberOfUsers==0 ? 0: (double)numberOfComments/numberOfUsers;
        averagePostsPerUser = numberOfUsers==0? 0: (double)numberOfPosts/numberOfUsers;
        getAverageCommentsPerPost = numberOfPosts==0? 0: (double)numberOfComments/numberOfPosts;
    }

    public void showStatistics(){
        System.out.println(
                "Number of comments: " + numberOfComments +
                        " Number of users " + numberOfUsers +
                        " Number of posts " + numberOfPosts +
                        " Average Comments Per User " + averageCommentsPerUser +
                        " Average posts per User " + averagePostsPerUser +
                        " Average comments per post " + getAverageCommentsPerPost
        );
    }
}

/*
utwórz klasę obliczającą następujące statystyki:
liczbę użytkowników,
liczbę postów,
liczbę komentarzy,
średnią liczbę postów na użytkownika,
średnią liczbę komentarzy na użytkownika,
średnią liczbę komentarzy na post.
Stworzona klasa powinna posiadać metodę calculateAdvStatistics(Statistics statistics),
która obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy.
Możesz również dopisać metodę showStatistics(), która wyświetli zapamiętane we właściwościach statystyki.
 */