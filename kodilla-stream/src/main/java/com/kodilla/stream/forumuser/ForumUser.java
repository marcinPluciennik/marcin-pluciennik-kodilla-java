package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userBirthDate;
    private final int postsQuantityPerUser;

    public ForumUser(int userID, String userName, char userSex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postsQuantityPerUser) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsQuantityPerUser = postsQuantityPerUser;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getPostsQuantityPerUser() {
        return postsQuantityPerUser;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userBirthDate=" + userBirthDate +
                ", postsQuantityPerUser=" + postsQuantityPerUser +
                '}';
    }
}
