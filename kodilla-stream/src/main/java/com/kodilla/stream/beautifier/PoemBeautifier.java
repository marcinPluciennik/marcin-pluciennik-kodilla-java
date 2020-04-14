package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator){
        String beatyfiedText = poemDecorator.decorate(text);
        return beatyfiedText;
    }
}
