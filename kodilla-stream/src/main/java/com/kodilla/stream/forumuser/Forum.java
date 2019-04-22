package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1010, "Katarzyna",
                'F', 2, LocalDate.of(1990, 1, 31)));
        userList.add(new ForumUser(1020, "Maria",
                'F', 3, LocalDate.of(2000, 2, 28)));
        userList.add(new ForumUser(1030, "Tomasz",
                'M', 4, LocalDate.of(2009, 5, 31)));
        userList.add(new ForumUser(1040, "Jacek",
                'M', 5, LocalDate.of(1988, 6, 30)));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
