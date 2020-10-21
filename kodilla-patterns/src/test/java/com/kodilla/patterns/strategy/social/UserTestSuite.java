package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User duda = new Millenials("Andrzej Duda");
        User trzaskowski = new YGeneration("Rafal Trzaskowski");
        User cholownia = new ZGeneration("Szymon Cholownia");

        //When
        String dudaPost = duda.sharePost();
        System.out.println("Andrzej Duda posts on: " + dudaPost);
        String trzaskowskiPost = trzaskowski.sharePost();
        System.out.println("Rafal Trzaskowski posts on: " + trzaskowskiPost);
        String cholowniaPost = cholownia.sharePost();
        System.out.println("Szymon Cholownia posts on: " + cholowniaPost);

        //Than
        Assert.assertEquals("Facebook", dudaPost);
        Assert.assertEquals("Twitter", trzaskowskiPost);
        Assert.assertEquals("Snapchat", cholowniaPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User trump = new Millenials("Donald Trump");

        //When
        String trumpPost = trump.sharePost();
        System.out.println("Donald Trump posts on: " + trumpPost);
        trump.setPostStrategy(new TwitterPublisher());
        trumpPost = trump.sharePost();
        System.out.println("Donald Trump posts on: " + trumpPost);

        //Than
        Assert.assertEquals("Twitter", trumpPost);
    }
}
