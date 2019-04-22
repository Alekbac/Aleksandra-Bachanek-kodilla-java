package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.YEARS;

public class StreamMain {
    public static void main(String[] args) {
       Forum theForumUser = new Forum();
        Map<Integer, ForumUser> theResultMap = theForumUser.getUserList().stream()
                .filter(user ->user.getSex() == 'M')
                .filter(user ->YEARS.between(user.getBirthdayDate(), LocalDate.now()) >= 20)
                .filter(user ->user.getPostQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));
        System.out.println("# elements: " + theResultMap.size());
        theResultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}