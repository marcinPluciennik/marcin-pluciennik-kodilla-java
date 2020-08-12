package com.kodilla.hibernate.manytomany.facade;

public class FindingException extends Exception{
    public static String ERR_EMPTY_TABLE = "Sorry, I didn't find anything";

    public FindingException(String message) {
        super(message);
    }
}
