package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "user1", 'M', LocalDate.of(2000,10,10),
                1));
        forumUserList.add(new ForumUser(2, "user2", 'F', LocalDate.of(2000,10,10),
                0));
        forumUserList.add(new ForumUser(3, "user3", 'M', LocalDate.of(2000,10,10),
                5));
        forumUserList.add(new ForumUser(4, "user4", 'F', LocalDate.of(2000,10,10),
                4));
        forumUserList.add(new ForumUser(5, "user5", 'F', LocalDate.of(2000,10,10),
                10));
        forumUserList.add(new ForumUser(6, "user6", 'M', LocalDate.of(2000,10,10),
                3));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }

}
