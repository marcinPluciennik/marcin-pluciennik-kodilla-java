package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int userQuantity;
    private int postQuantity;
    private int commentQuantity;
    private double averageQuantityOfPostsPerUser;
    private double averageQuantityOfCommentsPerUser;
    private double averageQuantityOfCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){

        postQuantity = statistics.postsCount();
        commentQuantity = statistics.commentsCount();
        userQuantity = statistics.usersNames().size();

        averageQuantityOfPostsPerUser = (double)postQuantity / userQuantity;
        averageQuantityOfCommentsPerUser = (double)commentQuantity / userQuantity;
        averageQuantityOfCommentsPerPost = (double)commentQuantity / postQuantity;
    }

    /*
    public void showStatistics(){
        System.out.println("FORUM STATISTICS:");
        System.out.println("----------------------------------------------------");
        System.out.println("Total quantity of forum users: " + userQuantity);
        System.out.println("Total quantity of forum posts: " + postQuantity);
        System.out.println("Total quantity of forum comments: " + commentQuantity);
        System.out.println("Average quantity of posts per user: " + averageQuantityOfPostsPerUser);
        System.out.println("Average quantity of comments per user: " + averageQuantityOfCommentsPerUser);
        System.out.println("Average quantity of comments per post: " + averageQuantityOfCommentsPerPost);
    }
    */

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public int getCommentQuantity() {
        return commentQuantity;
    }

    public double getAverageQuantityOfPostsPerUser() {
        return averageQuantityOfPostsPerUser;
    }

    public double getAverageQuantityOfCommentsPerUser() {
        return averageQuantityOfCommentsPerUser;
    }

    public double getAverageQuantityOfCommentsPerPost() {
        return averageQuantityOfCommentsPerPost;
    }
}
