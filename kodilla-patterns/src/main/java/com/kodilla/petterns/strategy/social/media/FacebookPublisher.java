package com.kodilla.petterns.strategy.social.media;

import com.kodilla.petterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Facebook";
    }
}
