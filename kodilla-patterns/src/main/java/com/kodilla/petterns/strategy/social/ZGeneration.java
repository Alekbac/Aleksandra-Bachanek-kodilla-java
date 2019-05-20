package com.kodilla.petterns.strategy.social;

import com.kodilla.petterns.strategy.social.media.TwitterPublisher;

public class ZGeneration extends User {
    public ZGeneration(String userName) {
        super( userName );
        this.socialPublisher = new TwitterPublisher();
    }
}
