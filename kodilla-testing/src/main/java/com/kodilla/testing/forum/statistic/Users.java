package com.kodilla.testing.forum.statistic;

public class Users {

    int usersNum;
    int postNum;
    int commentNum;
    public double postAvgPerUser;
    public double commentAvgPerUser;
    public double commentAvgPerPost;

    public int getUsersNum(){
        return usersNum;
    }
    public int getPostNum(){
        return postNum;
    }
    public int getCommentNum(){
        return commentNum;
    }

    public double getPostAvgPerUser(){
        if(usersNum > 0){
            return postNum / usersNum;
        }else {
            return 0;
        }
    }

    public double getCommentAvgPerUser(){
        if(usersNum > 0){
            return commentNum / usersNum;
        }else{
            return 0;
        }
    }

    public double getCommentAvgPerPost(){
        if(postNum > 0){
            return (double) commentNum / postNum;
        }else{
            return 0;
        }
    }

    public void calculateAvgStatistic (Statistics statistics){
        usersNum = statistics.usersNames().size();
        postNum = statistics.postsCount();
        commentNum = statistics.commentsCount();
        postAvgPerUser = getPostAvgPerUser();
        commentAvgPerUser = getCommentAvgPerUser();
        commentAvgPerPost = getCommentAvgPerPost();
    }

    public void showStatistics(){
        System.out.println("Users quantity: " + getUsersNum());
        System.out.println("Posts quantity: " + getPostNum());
        System.out.println("Comments quantity: " + getCommentNum());
        System.out.println("Posts average per user: " + getPostAvgPerUser());
        System.out.println("Comment average per user: " + getCommentAvgPerUser());
        System.out.println("Comment average per post: " + getCommentAvgPerPost());
    }

}
