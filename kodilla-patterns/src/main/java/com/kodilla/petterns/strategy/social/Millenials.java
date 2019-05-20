package com.kodilla.petterns.strategy.social;

import com.kodilla.petterns.strategy.social.media.SnapchatPublisher;

public class Millenials extends User {
    public Millenials(String userName) {
        super( userName );
        this.socialPublisher = new SnapchatPublisher();
    }
}
