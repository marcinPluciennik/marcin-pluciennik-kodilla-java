package com.kodilla.stream.immutable;

import org.w3c.dom.ls.LSOutput;

public final class ForumUser {
    private final String userName;
    private final String realName;

    public ForumUser(String userName, String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }
}
