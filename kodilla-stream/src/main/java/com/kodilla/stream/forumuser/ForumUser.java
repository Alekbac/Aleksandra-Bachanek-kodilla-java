package com.kodilla.stream.forumuser;

import java.time.LocalDate;

final class ForumUser {
    private final int userID;
    private String userName;
    private char sex;
    private int postQuantity;
    private LocalDate birthdayDate;

    public ForumUser(final int userID, String userName, char sex, int postQuantity, LocalDate birthdayDate) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.postQuantity = postQuantity;
        this.birthdayDate = birthdayDate;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", postQuantity=" + postQuantity +
                ", birthdayDate=" + birthdayDate +
                '}';
    }
}
