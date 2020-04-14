package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {
        PoemDecorator decorator1 = input -> "*** " + input + " ***";
        PoemDecorator decorator2 = input -> input.toUpperCase();
        PoemDecorator decorator3 = input -> input.concat(" !!!");
        PoemDecorator decorator4 = input -> input + " - This sentencse includes " + input.length() + " signs.";

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("I love Lambda Expressions", decorator1));
        System.out.println(poemBeautifier.beautify("I love Lambda Expressions", decorator2));
        System.out.println(poemBeautifier.beautify("I love Lambda Expressions", decorator3));
        System.out.println(poemBeautifier.beautify("I love Lambda Expressions", decorator4));
    }
}
