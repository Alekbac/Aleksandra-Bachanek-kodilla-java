package com.kodilla.petterns.strategy.social.media;

import com.kodilla.petterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter";
    }
}
