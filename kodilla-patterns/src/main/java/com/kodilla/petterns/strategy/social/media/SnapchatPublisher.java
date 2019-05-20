package com.kodilla.petterns.strategy.social.media;

import com.kodilla.petterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Snapchat";
    }
}
