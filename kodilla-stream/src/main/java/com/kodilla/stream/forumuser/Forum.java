package com.kodilla.stream.forumuser;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){
        theUserList.add(new ForumUser(10,"Edek z Fabryki Kredek", 'M',
                1990, 10, 2, 2));
        theUserList.add(new ForumUser(11,"Królewna Fiona", 'K',
                1980, 9, 13, 1));
        theUserList.add(new ForumUser(12,"Kubuś Puchatek", 'M',
                1999, 1, 12, 0));
        theUserList.add(new ForumUser(13,"Czarownica z Eastwick", 'K',
                1979, 6, 22, 3));
        theUserList.add(new ForumUser(14,"Pan z kiosku", 'M',
                2019, 8, 9, 1));
        theUserList.add(new ForumUser(15,"James Bond", 'M',
                1960, 11, 12, 0));
        theUserList.add(new ForumUser(16,"Gal Anonim", 'M',
                1800, 7, 2, 4));
        theUserList.add(new ForumUser(17,"Niania Frania", 'K',
                1993, 5, 15, 0));
        theUserList.add(new ForumUser(18,"Dracula", 'M',
                1700, 12, 2, 9));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUserList);
    }
}
