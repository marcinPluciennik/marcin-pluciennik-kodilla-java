package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> par = theForum.getUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> user.getPostsQuantityPerUser() >= 1)
                .filter(user -> user.getUserBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("I found " + par.size() + " elements:");
        System.out.println("------------------------------------");
        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);




        /*
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
         */

        /*
        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
         */

        /*
        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

         */

        /*
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
         */

        /*
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
         */

        /*
        PoemDecorator decorator1 = input -> "*** " + input + " ***";
        PoemDecorator decorator2 = input -> input.toUpperCase();
        PoemDecorator decorator3 = input -> input.concat(" !!!");
        PoemDecorator decorator4 = input -> input + " - This sentencse includes " + input.length() + " signs.";

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("I love Lambda Expressions", decorator1));
        System.out.println(poemBeautifier.beautify("I love Lambda Expressions", decorator2));
        System.out.println(poemBeautifier.beautify("I love Lambda Expressions", decorator3));
        System.out.println(poemBeautifier.beautify("I love Lambda Expressions", decorator4));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
         */
    }
}
