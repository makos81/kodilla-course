package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int Id;
    private String userName;
    private char sex;
    private LocalDate birthDate;
    private int postsNumber;

    public ForumUser(int id, String userName, char sex, LocalDate birthDate, int postsNumber) {
        Id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsNumber = postsNumber;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public void setPostsNumber(int postsNumber) {
        this.postsNumber = postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}

/*
unikalny identyfikator użytkownika (typu int),
nazwa użytkownika (typu String),
płeć (typu char), z wartościami M/F
data urodzenia (typu LocalDate),
ilość opublikowanych postów (typu int).
 */
