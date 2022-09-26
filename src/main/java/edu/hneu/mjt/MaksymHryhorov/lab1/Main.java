package edu.hneu.mjt.MaksymHryhorov.lab1;

import model.User;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, User> userMap = new LinkedHashMap<>();
        User user = new User("Name", "Surname", LocalDate.ofYearDay(2014,9));
        userMap.put(0, user);

        userMap.forEach((integer, user1) ->
                System.out.println("Key: " + integer + "\n" + "User: " + user1.getName() + " " + user1.getSurname()));

    }

}