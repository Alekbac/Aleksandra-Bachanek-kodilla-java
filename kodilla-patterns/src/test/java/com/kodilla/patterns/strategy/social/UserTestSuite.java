package com.kodilla.patterns.strategy.social;

import com.kodilla.petterns.strategy.social.Millenials;
import com.kodilla.petterns.strategy.social.User;
import com.kodilla.petterns.strategy.social.YGeneration;
import com.kodilla.petterns.strategy.social.ZGeneration;
import com.kodilla.petterns.strategy.social.media.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){

        //Given
        User steven = new Millenials( "Steven S" );
        User john = new YGeneration( "John J" );
        User carol = new ZGeneration( "Carol C" );

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven shared post on " + stevenShare);
        String johnShare = john.sharePost();
        System.out.println("John shared post on " + johnShare);
        String carolShare = carol.sharePost();
        System.out.println("Carol shared post on " + carolShare);

        //Then
        Assert.assertEquals( "Snapchat", stevenShare );
        Assert.assertEquals( "Facebook", johnShare );
        Assert.assertEquals( "Twitter", carolShare );
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User carol = new ZGeneration( "Carol C" );

        //When
        String carolShare = carol.sharePost();
        System.out.println("Carol shared post on " + carolShare);
        carol.setSocialPublisher( new SnapchatPublisher() );
        carolShare = carol.sharePost();
        System.out.println("Carol started to use " + carolShare);

        //Then
        Assert.assertEquals( "Snapchat", carolShare );
    }
}