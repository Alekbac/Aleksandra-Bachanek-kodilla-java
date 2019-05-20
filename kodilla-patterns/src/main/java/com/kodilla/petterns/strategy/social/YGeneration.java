package com.kodilla.petterns.strategy.social;

import com.kodilla.petterns.strategy.social.media.FacebookPublisher;

public class YGeneration extends User {
    public YGeneration(String userName) {
        super( userName );
        this.socialPublisher = new FacebookPublisher();
    }
}
